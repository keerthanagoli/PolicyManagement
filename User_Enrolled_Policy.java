package com.PMSProject.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
@Entity
public class User_Enrolled_Policy {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@ManyToOne
	User user;
	@ManyToOne
	Policy policy;
	@Column(name="enrolled_date")
	private Date EnrolledDate;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public Date getEnrolledDate() {
		return EnrolledDate;
	}
	public void setEnrolledDate(Date enrolledDate) {
		EnrolledDate = enrolledDate;
	}
	
	
	

}
