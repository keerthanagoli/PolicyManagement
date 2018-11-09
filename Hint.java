package com.PMSProject.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Hint")
public class Hint {
@Id
@Column(name="hint_id")
 private int hint_id;
@Column(name="hint_des")
@OneToMany(mappedBy="hint")
private List<User> User = new ArrayList<>(); 
public List<User> getUser() {
	return User;
}
public void setUser(List<User> user) {
	User = user;
}
private String hint_des;


public int getHint_id() {
	return hint_id;
}
public void setHint_id(int hint_id) {
	this.hint_id = hint_id;
}
public String getHint_des() {
	return hint_des;
}
public void setHint_des(String hint_des) {
	this.hint_des = hint_des;
}

}
