package com.example.tsreportingservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class ClientActivity {
	@Id
	@GeneratedValue
	private long id;
	private long clientId;
	private String fullName ,action;
	private Date createdAt;
	
	public ClientActivity(long clientId, String fullName, String action) {
		this.clientId = clientId;
		this.fullName = fullName;
		this.action = action;
		this.createdAt = new Timestamp((new Date().getTime()));
	}
	
	public ClientActivity(){
	
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getClientId() {
		return clientId;
	}
	
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void getCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
