package cn.jt.feigh;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(value="provider-user")
public interface ErekaServiceFerign {
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
	
    public String hello(@PathVariable("name")String name);
	
}
