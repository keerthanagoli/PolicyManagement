package com.PMSProject.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
@Id
private String Company_Id;
@Column(name="company_name")
private String Company_Name;
@OneToMany(mappedBy="company")
List<Policy> policies = new ArrayList<>();public List<Policy> getPolicies() {
	return policies;
}
public void setPolicies(List<Policy> policies) {
	this.policies = policies;
}
public String getCompany_Id() {
	return Company_Id;
}
public void setCompany_Id(String company_Id) {
	Company_Id = company_Id;
}
public String getCompany_Name() {
	return Company_Name;
}
public void setCompany_Name(String company_Name) {
	Company_Name = company_Name;
}

}
