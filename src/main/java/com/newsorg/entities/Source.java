package com.newsorg.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	"id",
	"name",
	})


public class Source {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Source [id=" + id + ", name=" + name + "]";
	}
	
	
}
