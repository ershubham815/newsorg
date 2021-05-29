package com.newsorg.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	"source",
	"author",
	"title",
	"description",
	"publishedAt",
	"content"
	})

public class Articles {
	
	@JsonProperty("source")
	private Source source;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("publishedAt")
	private String publishedAt;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("content")
	private String content;
	
	public Source getSource() {
		return source;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Articles [source=" + source + ", author=" + author + ", title=" + title + ", publishedAt=" + publishedAt
				+ ", description=" + description + ", content=" + content + "]";
	}

	
	
	

}
