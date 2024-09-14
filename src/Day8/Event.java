package Day8;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Event {
    private int ticketAvailable;
    private String eventName;
    private double price;
    private List<Event.Ticketable> Ticketable;
    private Object tiket;

    public Event(String garudaTavelFair, int i, int i1) {
        ticketAvailable = i;
        eventName = garudaTavelFair;
        price = i1;
    }

    public void buyTicket(String userName) {
        if (this.ticketAvailable > 0) {
            this.ticketAvailable--;
            Ticketing newTicket = new Ticketing(userName, this.eventName, this.price);

            System.out.println("User : " + newTicket.getUserID());
            System.out.println("Event : " + newTicket.event());
            System.out.println("Price : " + newTicket.price());
            System.out.println("Available Tickets : " + this.ticketAvailable);
            System.out.println();
        } else {
            System.out.println("Ticket sold out.");
            System.out.println();
        }
    }

    public Collection<? extends Ticketing> getAllTickets() {
        getAllTickets();
        return List.of();
    }

    public Ticketable getSingleTicket(String id) {
        boolean exist = false;
        for (Ticketable tiket : this.Ticketable) {
                return tiket;
            }
        return null;
    }

    public void checkTicket(String id) {
        boolean exist = false;
        for (Ticketable t : this.Ticketable) {
            if (Objects.equals(id, tiket)); {
                System.out.println("User : " + t.getUser());
                System.out.println("Event : " + t.getEvent());
                System.out.println("Price : " + t.getPrice());
                System.out.println();
                break;
            }
        }
        if (!exist) {
            System.out.println("Ticket not found for " + this.eventName + ".");
            System.out.println();
        }
    }

    public void checkAllTicket() {
        if (this.Ticketable.isEmpty()) {
            System.out.println("No tickets found for " + this.eventName + ".");
            System.out.println();
        }
        for (Ticketable t : this.Ticketable) {
            System.out.println("User : " + t.getUser());
            System.out.println("Event : " + t.getEvent());
            System.out.println("Price : " + t.getPrice());;
            System.out.println();
        }
    }

    public int getSingleTicket() {
        return this.ticketAvailable;
    }

    private static class Ticketable {
        public String getEvent() {
            return null;
        }
        public String getUser() {
            return null;
        }
        public String getPrice() {
            return null;

        }
    }
}
