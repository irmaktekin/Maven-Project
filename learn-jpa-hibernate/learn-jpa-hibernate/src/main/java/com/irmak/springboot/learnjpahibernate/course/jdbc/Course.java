package com.irmak.springboot.learnjpahibernate.course.jdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
@Id
private long id;
private String name;
private String author;
public Course(long id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}
public Course() {
	super();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
}
}
