package com.model.entities;

public class Ticket {
	private String ticketName;
	private String source;
	private String destination;
	private String bookTicket;
	private int ticketCost;
	
	public Ticket() {
		
	}
	

	public String getTicketName() {
		return ticketName;
	}


	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}


	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBookTicket() {
		return bookTicket;
	}

	public void setBookTicket(String bookTicket) {
		this.bookTicket = bookTicket;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

}
