package com.example.microservice.model;

public class RestaurantInfo {
//	@Id private String id; // for mongob object id

	private String restName;
	private int restId;
	private String restDescription;
	private int restRate;

	public RestaurantInfo(String restName, int restId, String restDescription, int restRate) {
		super();
		this.restName = restName;
		this.restId = restId;
		this.restDescription = restDescription;
		this.restRate = restRate;
	}

	public RestaurantInfo() {
		// TODO Auto-generated constructor stub
	}

	// public Task() {
//		// TODO Auto-generated constructor stub
//	}
	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestDescription() {
		return restDescription;
	}

	public void setRestDescription(String restDescription) {
		this.restDescription = restDescription;
	}

	public int getRestRate() {
		return restRate;
	}

	public void setRestRate(int restRate) {
		this.restRate = restRate;
	}

	@Override
	public String toString() {
		return "Restaurant [restName=" + restName + ", restId=" + restId + ", restDescription=" + restDescription
				+ ", restRate=" + restRate + "]";
	}

}
