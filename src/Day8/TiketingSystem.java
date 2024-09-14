package Day8;
import java.util.List;
import java.util.Scanner;


public class TiketingSystem {
    private static int numberEvent;

    public static void run(List<Event> eventList, Scanner scanner) {
        Object Utils = scanner.nextLine();
        int numberEvents = Integer.parseInt(Utils + "");
        if (numberEvent >= eventList.size()) {
            System.out.println("Event is not available.");
            System.out.println();
            return;
        }
        if (eventList.get(numberEvent).getSingleTicket() == 0) {
            System.out.println("Ticket sold out.");
            System.out.println();
            return;
        }
    }
}

