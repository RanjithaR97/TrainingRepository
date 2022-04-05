package TicKetApplication;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.TicketService;
import com.model.entities.Ticket;

public class TicketAPp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.configurations");
		context.scan("com.dao");
		context.refresh();
		TicketService service=context.getBean(TicketService.class);
		Ticket t1=new Ticket();
		t1.setSource("Bangalore");
		t1.setDestination("Chennai");
		t1.setTicketName("Passengerticket");
		t1.setTicketCost(150);
		t1.setBookTicket("Booked");
		
		Ticket t2=new Ticket();
		t2.setSource("Kerala");
		t2.setDestination("Mumbai");
		t2.setTicketName("SleepingCoachticket");
		t2.setTicketCost(800);
		t2.setBookTicket("Booked");
		
		Ticket t3=new Ticket();
		t3.setSource("Andhra");
		t3.setDestination("Maharashtra");
		t3.setTicketName("ACTicket");
		t3.setTicketCost(1500);
		t3.setBookTicket("Booked");
		service.add(t1);
		service.add(t2);
		service.add(t3);
		
		List<Ticket> ticketList=service.findAll();
		for(Ticket t:ticketList) {
			System.out.println(t.getSource());
			System.out.println(t.getDestination());
			System.out.println(t.getTicketName());
			System.out.println(t.getTicketCost());
			System.out.println(t.getBookTicket());
		}
		t3.setTicketCost(1200);
		service.update(t3);
		System.out.println(service.find("ACTicket").getSource()+"for"+service.find("ACTicket").getTicketCost());
		
	}

}
