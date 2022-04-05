package com.dao;
import java.util.List;

import com.model.entities.*;
public interface TicketDAO {
	
	void addTicket(Ticket ticket);
	Ticket findTicket(String ticketName);
	List<Ticket> findAllTicket();
	boolean updateTicket(Ticket ticket);
	boolean deleteTicket(Ticket ticket);
	

}
