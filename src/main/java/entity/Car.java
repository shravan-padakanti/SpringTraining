package entity;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private Engine engine;
	private String model;
	private int cost;
	private String color;
	
	public Car(Engine engine, String model, int cost, String color) {
		super();
		this.engine = engine;
		this.model = model;
		this.cost = cost;
		this.color = color;
	}
	
	public Car(){
		
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
