package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.*;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_table_chaining")
public class ProductDTO implements Serializable{

	@Id
	@GenericGenerator(name="ref", strategy="increment")
	@GeneratedValue(generator="ref")
	
	private int id;
	@Column(name="brand_name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	@Column(name="sum")
	private double sum;
	
	
	public ProductDTO() {
		System.out.println("cretaed "+this.getClass().getSimpleName());
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getSum() {
		return sum;
	}


	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
