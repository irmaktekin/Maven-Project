package com.irmaktekin.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>html page </title>");
		sb.append("<body>");
		sb.append("First html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		
		
		
				
	}
	@RequestMapping("say-hello-jsp")
	
	public String sayHelloJsp(@RequestParam String name, ModelMap model) {
		//we can use name in jsp now
		model.put("name", name);
		System.out.println("request param is"+ name);
		return "sayHello";
	}

}
