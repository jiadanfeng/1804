package cn.jt.feigh;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="sidecar")
public interface SidecarServiceFeign {
	//反问sidercar，调用nodejis欢迎页面
	@RequestMapping("/node")
	public String node();
}
