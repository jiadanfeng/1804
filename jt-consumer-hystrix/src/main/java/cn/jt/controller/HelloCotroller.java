package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.jt.feigh.ErekaServiceFerign;
import cn.jt.feigh.SidecarServiceFeign;

@RestController
public class HelloCotroller {
	@Autowired
    private ErekaServiceFerign erekaServiceFerign;
	@Autowired
	private SidecarServiceFeign sidecarServiceFeign;
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="failbackHello")
    public String hello(@PathVariable("name")String name){
    	return erekaServiceFerign.hello(name);
    }
	
	public String failbackHello(String name){
		return "tony"; //设置一个默认值返回
	}
	//实现对nodejs的封装
	@RequestMapping("/node")
	public String node(){
		return sidecarServiceFeign.node();//在接口中定义
	}
}
