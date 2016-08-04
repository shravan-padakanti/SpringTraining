package entity;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private int noOfCyclinders;
	private int cc;
	private int hp;
	
	public int getNoOfCyclinders() {
		return noOfCyclinders;
	}
	public void setNoOfCyclinders(int noOfCyclinders) {
		this.noOfCyclinders = noOfCyclinders;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
