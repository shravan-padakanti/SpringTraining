package entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Clerk {
	
	private String ssn;
	private String name;
	private Date startDate;
	private Date terminantionDate;
	
	private boolean active;
	
	public Clerk(){
		
	}

	public Clerk(String ssn, String name, Date startDate, /*Date terminantionDate,*/ boolean active) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.startDate = startDate;
		//this.terminantionDate = terminantionDate;
		this.active = active;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getTerminantionDate() {
		return terminantionDate;
	}

	public void setTerminantionDate(Date terminantionDate) {
		this.terminantionDate = terminantionDate;
	}
	
	public boolean isActive(){
		return active;
	}
	
}
