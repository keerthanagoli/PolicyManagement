package com.PMSProject.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Policy")
public class Policy {
	@Id
	private String Policy_id;
	@Column(name="policy_name")
	private String Policy_Name;
	@Column(name="policy_type")
	private String policy_type;
	@Column(name="start_date")
	private Date Start_Date;
	@Column(name="duration")
	private int Duration;
	@Column(name="initial_deposit")
	private double Intial_Deposit;
	@Column(name="terms_per_year")
	private int Terms_Per_Year;
	@Column(name="term_amount")
	private int Term_Amount;
	@Column(name="interest")
	private double Interest;
	@ManyToOne
	private Company company;
	@OneToMany(mappedBy="policy")
	private List<User_Enrolled_Policy> peu =new ArrayList<>();
	
	public List<User_Enrolled_Policy> getPeu() {
		return peu;
	}
	public void setPeu(List<User_Enrolled_Policy> peu) {
		this.peu = peu;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getPolicy_id() {
		return Policy_id;
	}
	public void setPolicy_id(String policy_id) {
		Policy_id = policy_id;
	}
	public String getPolicy_Name() {
		return Policy_Name;
	}
	public void setPolicy_Name(String policy_Name) {
		Policy_Name = policy_Name;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public double getIntial_Deposit() {
		return Intial_Deposit;
	}
	public void setIntial_Deposit(double intial_Deposit) {
		Intial_Deposit = intial_Deposit;
	}
	public int getTerms_Per_Year() {
		return Terms_Per_Year;
	}
	public void setTerms_Per_Year(int terms_Per_Year) {
		Terms_Per_Year = terms_Per_Year;
	}
	public int getTerm_Amount() {
		return Term_Amount;
	}
	public void setTerm_Amount(int term_Amount) {
		Term_Amount = term_Amount;
	}
	public double getInterest() {
		return Interest;
	}
	public void setInterest(double interest) {
		Interest = interest;
	}
	
}
	
	
