//Event Model Class

//This model will represent a single event record
package models;

public class Event {

	private int 	eventID;
	private String 	eventName;
	private String 	description;
	private String 	venue;
	private String 	date;
	private int 	capacity;
	private String  status;  //draft, approved, or published
	
	
//constructor
	public Event(int eventIDParam, String eventNameParam,String descriptionParam, String venueParam, 
			String dateParam, int capacityParam)
	{
		eventID = 		eventIDParam;
		eventName =		eventNameParam;
		description = 	descriptionParam;
		venue =			venueParam;
		date = 			dateParam;
		capacity = 		capacityParam;
		status = "Draft"; 
	}

	
//getters
	public int getEventID()
	{
		return eventID;
	}
	
	public String getEventName()
	{
		return eventName;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getVenue()
	{
		return venue;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public String getStatus()
	{
		return status;
	}
	
//setters
	public void setEventName (String eventNameParam)
	{
		eventName = eventNameParam;
	}
	
	public void setDescription(String descriptionParam) 
	{ 
		description = descriptionParam; 
	}
    
	public void setVenue(String venueParam) 
	{ 
		venue = venueParam; 
	}
   
	public void setDate(String dateParam) 
	{ 
		date = dateParam; 
	}
    
	public void setCapacity(int capacityParam) 
	{ 
		capacity = capacityParam; 
	}
    
	public void setStatus(String statusParam) 
	{ 
		status = statusParam; 
	}

	
//show how the object looks when printed
	@Override
	public String toString()
	{
		return eventName + " (EventID: " + eventID + ") " + " at " + venue + " on " + date;
	}
	
	


}
