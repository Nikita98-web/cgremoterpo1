package com.techjava.ticketbooking.services;

import java.util.List;
import java.util.Optional;

import com.techjava.ticketbooking.model.Ticket;



public interface TicketBookingService {

	Ticket findTicketByEmail(String email);
    Iterable<Ticket> getAllTickets();
    Ticket findTicketById(Integer ticketId);
    Ticket updateEmailById(Integer ticketId, String email);
    boolean deleteTicketById(Integer ticketId);
    Ticket  createTicket(Ticket ticket);
    List<Ticket> findByPassengerName(String pname);

}
