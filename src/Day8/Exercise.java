package Day8;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exercise {
        private List<Event> eventList = new ArrayList<>();
    private Object Utils;
    private Exercise TicketProcessing;
    private java.lang.Object Object;

    public Exercise() {
            this.eventList.add(new Event("Jakarta Fair", 5, 20000));
            this.eventList.add(new Event("Garuda Travel Fair", 1, 30000));
        }

        public void run() {
            System.out.println("1.Check Events");
            System.out.println("2.Book Ticket");
            System.out.println("3.Check All Sold Tickets");
            System.out.println("4.Exit");
            System.out.println();
            Scanner scanIn = new Scanner(System.in);
            int selection = 0;
            try {
                Utils.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (selection) {
                case 1:
                    List<Event> eventList1 = this.eventList;
                    run();
                    break;
                case 2:
                    TicketProcessing.run(this.eventList, scanIn);
                    run();
                    break;
                case 3:
                    checkTicket(scanIn);
                    run();
                    break;
                case 4:
                    checkAllTickets();
                    run();
                    break;
                case 5:
                    System.out.println("Program closed.");
                    break;
                default:
                    System.out.println("not available");
                    run();
            }
            Object clone = Objects.equals(Utils, Object);
        }

    private void run(List<Event> eventList, Scanner scanIn) {
    }

    public void checkTicket(Scanner scanner) {
            String id = Utils.wait();
            TiketAccount ticket = null;
            for (Event e : this.eventList) {
                if (e.getSingleTicket(id) != null) {
                    ticket = (TiketAccount) e.getSingleTicket(id);
                    break;
                }
            }
            if (ticket != null) {
                System.out.println("User : " + TiketAccount.getUser());
                System.out.println("Event : " + TiketAccount.getEvent());
                System.out.println("Price : " + TiketAccount.getPrice());
                System.out.println();
            } else {
                System.out.println("Ticket not found.");
                System.out.println();
            }
        }

        public void checkAllTickets() {
            List<Ticketing> ticketableList = new ArrayList<>();
            for (Event e : this.eventList) {
                ticketableList.addAll(e.getAllTickets());
            }
            if (ticketableList.isEmpty()) {
                System.out.println("Tickets not found.");
                System.out.println();
            } else {
                for (Ticketing ticketing : ticketableList) {
                    System.out.println("User : " + TiketAccount.getUser());
                    System.out.println("Event : " + TiketAccount.getEvent());
                    System.out.println("Price : " + TiketAccount.getPrice());
                    System.out.println();
            }
        }
    }
}
