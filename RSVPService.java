//RSVP service class
package services;

import models.RSVP;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//this class will provided actions related to RSVP data
public class RSVPService {
	
	private List<RSVP> rsvps;
	private AtomicInteger idCounter;
	
//constructor
	public RSVPService()
	{
		rsvps = new ArrayList<>();
		idCounter = new AtomicInteger(1);
	}
	
//creating a RSVP
	public RSVP createRSVP(int eventIDParam, int studentIDParam, String studentNameParam,
			String studentEmailParam)
	{
		int newId = idCounter.getAndIncrement();
		RSVP r = new RSVP(newId, eventIDParam, studentIDParam, studentNameParam, studentEmailParam,
				"Registered", "None");
		rsvps.add(r);
		System.out.println("RSVP Created: " + r.toString());
		return r;
	}
	
//copy of RSVPs list
	public List<RSVP> getAllRSVPs()
	{
		return new ArrayList<>(rsvps);
	}	

	
//lists all RSVPS for an event
	public List<RSVP> getRSVPsForEvent(int eventIDParam)
	{
		List<RSVP> out = new ArrayList<>();
		for (RSVP r : rsvps)
		{
			if (r.getEventID() == eventIDParam) out.add(r);
		}
		return out;
	}
	
//to check if a student is already registered for an event
	public boolean isAlreadyRegistered(int eventIDParam, int studentIDParam)
	{
		for (RSVP r : rsvps) 
		{
			if (r.getEventID() == eventIDParam && r.getStudentID() == studentIDParam)
			{
				return true;
			}
		}
		return false;
	}
	
	

}
