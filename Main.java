
import services.EventService;
import services.RSVPService;
import models.Event;
import models.RSVP;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputDevice = new Scanner(System.in);
		EventService eventService = new EventService();
		RSVPService rsvpService = new RSVPService();

		while (true)
		{
			System.out.println("\n\n\n\t\t\t\t\t----SEMS Prototype----");
			System.out.println("1. Create Event");
			System.out.println("2. View Events");
            System.out.println("3. Register for Event (RSVP)");
            System.out.println("4. View RSVPs for Event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = -1;
 
//to prevent a crash if a number isn't entered
            try 
            {
            	choice = Integer.parseInt(inputDevice.nextLine().trim());
            }
            catch (Exception ex)
            {
            	System.out.println("Please enter a number.");
            	continue;
            }
		
		switch (choice) {
			case 1:
				System.out.print("Event name: ");
				String name = inputDevice.nextLine();
				System.out.print("Description: ");
				String desc = inputDevice.nextLine();
				System.out.print("Venue: ");
				String venue = inputDevice.nextLine();
				System.out.print("Date/time (format:'MM-DD-YYYY 00:00AM'): ");
				String date = inputDevice.nextLine();
				System.out.print("Capacity: ");
				int cap = Integer.parseInt(inputDevice.nextLine().trim());
				eventService.createEvent(name, desc, venue, date, cap);
				break;
		
			case 2:
				List<Event> events = eventService.listEvents();
				if (events.isEmpty()) System.out.println("No events found.");
				for (Event e : events) System.out.println(e);
				break;
			
			case 3:
				System.out.print("Enter Event ID to register for: ");
				int eventId = Integer.parseInt(inputDevice.nextLine().trim());
				Event ev = eventService.getEventById(eventId);
				if (ev == null) 
            		{ 
					System.out.println("Event not found."); 
					break; 
            		}
				int capacity = ev.getCapacity();
				int registered = rsvpService.getRSVPsForEvent(eventId).size();
				if (capacity != -1 && registered >= capacity)
            		{
					System.out.println("Event is full.");
					break;
            		}
				System.out.print("Your student ID (ex. 123456): ");
				int studentId = Integer.parseInt(inputDevice.nextLine().trim());
				System.out.print("Your name (first and last): ");
				String sname = inputDevice.nextLine();
            	System.out.print("Your email: ");
            	String semail = inputDevice.nextLine();
            	if (studentId != -1 && rsvpService.isAlreadyRegistered(eventId, studentId)) 
            		{
            		System.out.println("You are already registered.");
            		break;
            		}
            	rsvpService.createRSVP(eventId, studentId, sname, semail);
            	break;
		
			case 4:
				System.out.print("Enter Event ID to list RSVPs: ");
				int eId = Integer.parseInt(inputDevice.nextLine().trim());
				List<RSVP> list = rsvpService.getRSVPsForEvent(eId);
				if (list.isEmpty())
					System.out.println("No RSVPs for this event yet.");
				for (RSVP r : list)
					System.out.println(r);
				break;
			
			case 5:
				System.out.println("Goodbye!");
				inputDevice.close();
				return;

			default:
				System.out.println("Invalid option.");		
		}//end switch
		}//end while
		
	}

}
