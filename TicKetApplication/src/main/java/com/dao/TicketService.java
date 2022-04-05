package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.entities.Ticket;

@Service
public class TicketService {
	@Autowired
	TicketDAO ticketDAOImpl;
	
	public void add(Ticket ticket) {
		ticketDAOImpl.addTicket(ticket);
	}
	public  Ticket find(String ticketName) {
		return ticketDAOImpl.findTicket(ticketName);
	}
	public List<Ticket> findAll(){
		return ticketDAOImpl.findAllTicket();
		
	}
	public boolean update(Ticket ticket) {
		return ticketDAOImpl.updateTicket(ticket);
		
	}
	public boolean delete(Ticket ticket) {
		return ticketDAOImpl.deleteTicket(ticket);
	}
	

}
