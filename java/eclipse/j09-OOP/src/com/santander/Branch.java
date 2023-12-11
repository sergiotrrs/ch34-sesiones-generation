package com.santander;

import java.util.ArrayList;

public class Branch {
    int serialNumber;
    ArrayList< Atm > atms; // branch has atms
    String address;
    static int counter;
    
    Branch(String address){
    	this.address = address;
    	this.atms = new ArrayList<>();
    	this.serialNumber = ++counter;
    }
    
    void addAtm( Atm newAtm ) {
    	this.atms.add( newAtm );
    }
    
    String details() {
    	String message = this.serialNumber + " " 
    					+ this.address;
    	
    	for(Atm atm : atms ) {
    		message += "\n Atm:" + atm.serialNumber 
    				+ " $" + atm.balance; 
    	}    	
    	return message;
    }
	
}
