package com.PMSProject.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@Column(name="bill_id")
	private String Bill_Id;
	@Column(name="bill_date")
	private Date Bill_Date;
	@Column(name="paid_amt")
	private double Paid_Amt;
	@Column(name="fine")
	private double Fine;
	@Column(name="due_date")
	private double Due_Date;
	@ManyToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBill_Id() {
		return Bill_Id;
	}
	public void setBill_Id(String bill_Id) {
		Bill_Id = bill_Id;
	}
	public Date getBill_Date() {
		return Bill_Date;
	}
	public void setBill_Date(Date bill_Date) {
		Bill_Date = bill_Date;
	}
	public double getPaid_Amt() {
		return Paid_Amt;
	}
	public void setPaid_Amt(double paid_Amt) {
		Paid_Amt = paid_Amt;
	}
	public double getFine() {
		return Fine;
	}
	public void setFine(double fine) {
		Fine = fine;
	}
	public double getDue_Date() {
		return Due_Date;
	}
	public void setDue_Date(double due_Date) {
		Due_Date = due_Date;
	}
	
	
}
