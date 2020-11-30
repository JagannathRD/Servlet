package com.xworkz.flipkart.dto;

import java.io.Serializable;

import javax.persistence.*;
;

@Entity

@Table(name="flipkart_table")
public class ServletFlipkartDTO implements Serializable {
	
	public ServletFlipkartDTO() {
		System.out.println("flipkart created");
	}

	@Id
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="price")
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
