package com.newsorg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONObject;

import com.newsorg.entities.Articles;
import com.newsorg.entities.Example;
import com.newsorg.entities.Source;

@Service
public class newsService {

	public static List<Example> sendRefinedUpdate(String country, String category, String source123) {
		String urlString = "https://newsapi.org/v2/top-headlines?country="+country+"&category="+category+"&source="+source123+"&apiKey=30a57078b1aa4cc88c04416e269573b8";
    	
   	 RestTemplate restTemplate = new RestTemplate();
   	    String result = restTemplate.getForObject(urlString, String.class);	    	
   		    	  
   	    JSONObject root = new JSONObject(result); 
   	    
   		String status = null;
           Integer totalResults = null;
           String id = null;
           String name = null;                
           String author = null;         		
   		String title = null;
   		String description = null;
   		String publishedAt = null;
   		String content = null;
           
           List<Example> newsList = new ArrayList<>();
           				
			status =  root.getString("status");
			totalResults =  root.getInt("totalResults");
			
			 JSONArray articlesObject = root.getJSONArray("articles");

		        for(int i = 0; i < articlesObject.length(); i++) {
		              	
		            JSONObject arrayElement = articlesObject.getJSONObject(i);
		           
		            JSONObject sourceother = arrayElement.getJSONObject("source");
		            			          			            			     	        
		            if(!sourceother.isNull("id")){ 
		            	id = sourceother.getString("id");
		            	}else {
		            		id=null;
		            	}   
		            
		            name =  sourceother.getString("name");
		            			          
		            if(!arrayElement.isNull("author")){ 
		            	author = arrayElement.getString("author");
		            	}else {
		            		author = null;
		            	}    
		            
		            title = arrayElement.getString("title");
		            			         
		            if(!arrayElement.isNull("description")){ 
		            	description = arrayElement.getString("description");
		            	}else {
		            		description = null;
		            	}    
		            
		            
		            publishedAt = arrayElement.getString("publishedAt");
		            			         
		           if(!arrayElement.isNull("content")){ 
		            	content = arrayElement.getString("content");
		            	}else {
		            		content = null;
		            	}    
		            			            
			         Example emp = new Example();				    	 
			    	Articles articles = new Articles();				    		
			    	Source source = new Source();	
			    	
		            emp.setStatus(status);
		            emp.setTotalResults(totalResults);
		            articles.setAuthor(author);
		            articles.setContent(content);
		            articles.setDescription(description);
		            articles.setPublishedAt(publishedAt);
		            articles.setTitle(title);
		            source.setId(id);
		            source.setName(name);	
		            
		            articles.setSource(source);
		            emp.setArticles(articles);
		            newsList.add(emp);
   }    
		        return newsList;
	}

	public static List<Example> sendSourcedUpdate(String country, String source123) {
		String urlString = "https://newsapi.org/v2/top-headlines?country="+country+"&source="+source123+"&apiKey=30a57078b1aa4cc88c04416e269573b8";
    	
   	 RestTemplate restTemplate = new RestTemplate();
   	    String result = restTemplate.getForObject(urlString, String.class);	    	
   		    	  
   	    JSONObject root = new JSONObject(result); 
   		String status = null;
           Integer totalResults = null;
           String id = null;
           String name = null;                
           String author = null;         		
   		String title = null;
   		String description = null;
   		String publishedAt = null;
   		String content = null;
           
           List<Example> newsList = new ArrayList<>();
           				
			status =  root.getString("status");
			totalResults =  root.getInt("totalResults");
			
			 JSONArray articlesObject = root.getJSONArray("articles");

		        for(int i = 0; i < articlesObject.length(); i++) {
		              	
		            JSONObject arrayElement = articlesObject.getJSONObject(i);
		           
		            JSONObject sourceother = arrayElement.getJSONObject("source");
		            			          			            			     	        
		            if(!sourceother.isNull("id")){ 
		            	id = sourceother.getString("id");
		            	}else {
		            		id=null;
		            	}   
		            
		            name =  sourceother.getString("name");
		            			          
		            if(!arrayElement.isNull("author")){ 
		            	author = arrayElement.getString("author");
		            	}else {
		            		author = null;
		            	}    
		            
		            title = arrayElement.getString("title");
		            			         
		            if(!arrayElement.isNull("description")){ 
		            	description = arrayElement.getString("description");
		            	}else {
		            		description = null;
		            	}    
		            
		            publishedAt = arrayElement.getString("publishedAt");
		            			         
		           if(!arrayElement.isNull("content")){ 
		            	content = arrayElement.getString("content");
		            	}else {
		            		content = null;
		            	}    
		            			            
			         Example emp = new Example();				    	 
			    	Articles articles = new Articles();				    		
			    	Source source = new Source();	
			    	
		            emp.setStatus(status);
		            emp.setTotalResults(totalResults);
		            articles.setAuthor(author);
		            articles.setContent(content);
		            articles.setDescription(description);
		            articles.setPublishedAt(publishedAt);
		            articles.setTitle(title);
		            source.setId(id);
		            source.setName(name);	
		            
		            articles.setSource(source);
		            emp.setArticles(articles);
		            newsList.add(emp);
   }    
		        return newsList;
	}

	public static List<Example> sendCategorizedUpdate(String country, String category) {
		String urlString = "https://newsapi.org/v2/top-headlines?country="+country+"&category="+category+"&apiKey=30a57078b1aa4cc88c04416e269573b8";
		RestTemplate restTemplate = new RestTemplate();
   	 	String result=restTemplate.getForObject(urlString, String.class);
   	 	
	    JSONObject root = new JSONObject(result);   
   	 
		String status = null;
        Integer totalResults = null;
        String id = null;
        String name = null;                
        String author = null;         		
		String title = null;
		String description = null;
		String publishedAt = null;
		String content = null;
   	 	
		List<Example> newsList = new ArrayList<>();
		
		status =  root.getString("status");
		totalResults =  root.getInt("totalResults");
		
		 JSONArray articlesObject = root.getJSONArray("articles");

	        for(int i = 0; i < articlesObject.length(); i++) {
	              	
	            JSONObject arrayElement = articlesObject.getJSONObject(i);
	           
	            JSONObject sourceother = arrayElement.getJSONObject("source");
	            			          			            			     	        
	            if(!sourceother.isNull("id")){ 
	            	id = sourceother.getString("id");
	            	}else {
	            		id=null;
	            	}   
	            
	            name =  sourceother.getString("name");
	            			          
	            if(!arrayElement.isNull("author")){ 
	            	author = arrayElement.getString("author");
	            	}else {
	            		author = null;
	            	}    
	            
	            title = arrayElement.getString("title");
	            			         
	            if(!arrayElement.isNull("description")){ 
	            	description = arrayElement.getString("description");
	            	}else {
	            		description = null;
	            	}    
	               
	            
	            publishedAt = arrayElement.getString("publishedAt");
	            			         
	           if(!arrayElement.isNull("content")){ 
	            	content = arrayElement.getString("content");
	            	}else {
	            		content = null;
	            	}    
	            			            
		         Example emp = new Example();				    	 
		    	Articles articles = new Articles();				    		
		    	Source source = new Source();	
		    	
	            emp.setStatus(status);
	            emp.setTotalResults(totalResults);
	            articles.setAuthor(author);
	            articles.setContent(content);
	            articles.setDescription(description);
	            articles.setPublishedAt(publishedAt);
	            articles.setTitle(title);
	            source.setId(id);
	            source.setName(name);	
	            
	            articles.setSource(source);
	            emp.setArticles(articles);
	            newsList.add(emp);
}    
	        return newsList;
	}

}
