package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/user/{name}")
	public String Hello(@PathVariable String name){
		String url="http://provider-user/user/"+name;
		return restTemplate.getForObject(url, String.class);
	}
	
}
