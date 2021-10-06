package com.bookingMicroservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Booking")
public class Book {
	
	
	private String firstName;
	private String lastName;
	private String gender;
	private long phoneNumber;
	private String email;
	private int numberOfTickets;
	private String airportFrom;
	private String airportTo;
	
	public Book(){
		
	}
	
	
	public Book(String firstName, String lastName, String gender, long phoneNumber, String email, int numberOfTickets,
			String airportfrom, String airportto) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.numberOfTickets = numberOfTickets;
		this.airportFrom = airportfrom;
		this.airportTo = airportto;
	}


	public String getAirportFrom() {
		return airportFrom;
	}

	public void setAirportFrom(String airportfrom) {
		this.airportFrom = airportfrom;
	}

	public String getAirportTo() {
		return airportTo;
	}

	public void setAirportTo(String airportto) {
		airportTo = airportto;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}




	
	
}
