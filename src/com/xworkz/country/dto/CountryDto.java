package com.xworkz.country.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="country_dto_table")
public class CountryDto implements Serializable {
	
	public CountryDto() {
		System.out.println("Craeated..."+this.getClass().getSimpleName());
	}
	
	@Id
	@Column(name="c_name")
	private String name;
	@Column(name="c_pop")
	private long population;
	@Column(name="continent")
	private String continent;
	@Column(name="c_area")
	private long area;
	
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
}
