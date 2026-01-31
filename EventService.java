//Event Service Class
package services;

import models.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//this service class will provide actions related to event data
public class EventService {

	private List<Event> events;
	private AtomicInteger idCounter;
	
//constructor
	public EventService()
	{
		events = new ArrayList<>();
		idCounter = new AtomicInteger(1);
	}
	
//creating and saving an event
	public Event createEvent(String nameParam, String descParam, String venueParam,
			String dateParam, int capacityParam)
	{
		int newId = idCounter.getAndIncrement();
		Event e = new Event(newId, nameParam, descParam, venueParam, dateParam, capacityParam);
		events.add(e);
		System.out.println("Created: " + e.toString());
		return e;
	}
	
//copy of events list
	public List<Event> listEvents()
	{
		return new ArrayList<>(events);
	}
	
//for searching through event list using EventID
	public Event getEventById(int eventIDParam)
	{
		for (Event e : events) 
		{
			if (e.getEventID() == eventIDParam)
			{
				return e;
			}
		}
		return null;
	}
	
//get the capacity of an event
	public int getCapacity(int eventIDParam)
	{
		Event e = getEventById(eventIDParam);
		if (e == null) return -1;
		return e.getCapacity();
	}
	
//update an event (like changing status to 'approved)
	public boolean updateEventStatus(int eventIDParam, String statusParam)
	{
		Event e = getEventById(eventIDParam);
		if (e == null) return false;
		e.setStatus(statusParam);
		return true;
	}
	
//delete event
public boolean deleteEvent(int eventIDParam)
	{
		Event e = getEventById(eventIDParam);
		if (e == null) return false;
		return events.remove(e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
