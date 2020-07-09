package com.example.demo.model.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	 private Long id; 
	 private String model;
	 private String brand;
	 private int year;
	 private String color;
	 private Double tank;
	 private Double measure;
	 private Double autonomy;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getMeasure() {
		return measure;
	}
	public void setMeasure(Double measure) {
		this.measure = measure;
	}
	public Double getTank() {
		return tank;
	}
	public void setTank(Double tank) {
		this.tank = tank;
	}
	public Double getAutonomy() {
		return autonomy;
	}
	public void setAutonomy(Double autonomy) {
		this.autonomy = autonomy;
	}
}