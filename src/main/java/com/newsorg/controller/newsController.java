package com.newsorg.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.newsorg.entities.Example;
import com.newsorg.service.newsService;

@RestController
public class newsController {
	
	@GetMapping(value = "/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping(value = "/Categorizednews/{country}/{category}")
	public List<Example> sendCategorizedUpdate(@PathVariable String country,@PathVariable String category) throws Exception, IOException {
		return newsService.sendCategorizedUpdate(country,category);
	} 
	
	@GetMapping(value = "/Sourcednews/{country}/{source123}")
	public List<Example> sendSourcedUpdate(@PathVariable String country,@PathVariable String source123) throws Exception, IOException {
		return newsService.sendSourcedUpdate(country,source123);
	}
	
	@GetMapping(value = "/news/{country}/{category}/{source123}")
	public List<Example> sendRefinedUpdate(@PathVariable String country,@PathVariable String category,@PathVariable String source123) throws Exception, IOException {
		return newsService.sendRefinedUpdate(country,category,source123);
	} 
	
	

}
