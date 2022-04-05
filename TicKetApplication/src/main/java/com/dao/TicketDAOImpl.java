package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.entities.Ticket;
@Component
public class TicketDAOImpl implements TicketDAO {
	
	List<Ticket> ticketList;
	public TicketDAOImpl() {
		ticketList=new ArrayList<Ticket>();
	}

	@Override
	public void addTicket(Ticket ticket) {
		ticketList.add(ticket);
	  

	}

	@Override
	public Ticket findTicket(String ticketName) {
		for(Ticket t:ticketList) {
			if(t.getTicketName()==ticketName) {
				return t;
			}
		}
		return null;
	}

	@Override
	public List<Ticket> findAllTicket() {
		return ticketList;
		
	}

	@Override
	public boolean updateTicket(Ticket ticket) {
		for(int i=0;i<ticketList.size();i++) {
			if(ticketList.get(i).getTicketName()==ticket.getTicketName()) {
				ticketList.set(i, ticket);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteTicket(Ticket ticket) {
		for(int i=0;i<ticketList.size();i++) {
			if(ticketList.get(i).getTicketName()==ticket.getTicketName()) {
				ticketList.set(i, null);
				return true;
			}
		}
		return false;
	}

}
