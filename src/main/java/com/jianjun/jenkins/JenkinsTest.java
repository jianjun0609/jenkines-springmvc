package com.jianjun.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JenkinsTest {
	
	@RequestMapping(value = "/")
	public @ResponseBody String test() {
		return "hello jenkins";
	}
}
