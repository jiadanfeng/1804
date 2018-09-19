package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.jt.feigh.ErekaServiceFerign;

@RestController
public class HelloCotroller {
	@Autowired
    private ErekaServiceFerign erekaServiceFerign;
	@RequestMapping("/hello/{name}")
	
    public String hello(@PathVariable("name")String name){
    	return erekaServiceFerign.hello(name);
    }
	
	
}
