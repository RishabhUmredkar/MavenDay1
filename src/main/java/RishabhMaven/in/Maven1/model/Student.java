package RishabhMaven.in.Maven1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="maven_tbl")
public class Student {

	
@Id
@GeneratedValue
private int roll;

@Column(name ="sname")
private String name;
private String address;






public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public Student(int roll, String name, String address) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}




}
