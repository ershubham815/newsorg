package com.newsorg.entities;

public class Example {
	
	private String status;
	private Integer totalResults;
	private Articles articles;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public Articles getArticles() {
		return articles;
	}
	public void setArticles(Articles articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Example [status=" + status + ", totalResults=" + totalResults + ", articles=" + articles + "]";
	}
	
	

}
