package com.apolis.startapp.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1234")
	private int id;
	@Value("John")
	private String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
