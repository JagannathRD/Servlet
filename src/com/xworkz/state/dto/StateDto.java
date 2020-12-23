package com.xworkz.state.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="state_dto_table")
public class StateDto implements Serializable {
	
	 public StateDto() {
		System.out.println("Created..."+this.getClass().getSimpleName() );
	}
	
	@Id
	@Column(name="s_name")
	private String name;
	@Column(name="s_pop")
	private long population;
	@Column(name="language")
	private String language;
	@Column(name="s_capital")
	private String capital;
	@Column(name="s_country")
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
