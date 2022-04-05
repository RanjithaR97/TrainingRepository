package com.configurations;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dao.*;
import com.model.entities.*;
@Component
public class AppConfigurations {
	@Bean
	public TicketDAOImpl getDAOImpl() {
		TicketDAOImpl impl=new TicketDAOImpl();
		return impl;
		
	}
	@Bean
	public Ticket getTicket() {
		Ticket t=new Ticket();
		t.setSource("Bangalore");
		t.setDestination("Chennai");
		t.setTicketName("PassengerTicket");
		t.setTicketCost(500);
		t.setBookTicket("Booked");
		return t;
	}

	
}
