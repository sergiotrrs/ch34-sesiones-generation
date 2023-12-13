package com.citibanamex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AtmLogger {
	private LocalDateTime dateTime;
	private String activity;
	private double amount;
	
	private AtmLogger(String activity,  double amount) {
		this.activity = activity;
		this.amount = amount;
		this.dateTime = LocalDateTime.now();
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String toString() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = this.dateTime.format(formatter);
		StringBuilder builder = new StringBuilder();
		builder.append(formattedDateTime);
		builder.append(" - activity= ");
		builder.append( getActivity() );
		builder.append(", amount= ");
		builder.append( getAmount() );	
		return builder.toString();
	}
	
	public static AtmLogger depositRegister(double amount) {
		return new AtmLogger("deposit", amount); 
	}
	
	public static AtmLogger withdrawRegister(double amount) {
		return new AtmLogger("withdraw", amount); 
	}

	public static AtmLogger errorRegister(double amount) {
		return new AtmLogger("error", amount); 
	}
	
	

}
