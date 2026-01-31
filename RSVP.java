//RSVP Model Class

package models;

public class RSVP {

	private int rsvpID;
	private int eventID;
	private int studentID;
	private String studentName;
	private String studentEmail;
	private String status;
	private String paymentStatus;  //none, pending, paid
	
//constructor
	public RSVP(int rsvpIDParam, int eventIDParam, int studentIDParam, String studentNameParam,
			String studentEmailParam, String statusParam, String paymentStatusParam)
	{
		rsvpID = 	rsvpIDParam;
		eventID = 	eventIDParam;
		studentID = studentIDParam;
		studentName = studentNameParam;
		studentEmail = studentEmailParam;
		status = 	statusParam;
		paymentStatus = paymentStatusParam;
	}

//getters
	public int getRsvpID() 
	{ 
		return rsvpID; 
	}
    
	public int getEventID() 
	{ 
		return eventID; 
	}
    
	public int getStudentID() 
	{ 
		return studentID; 
	}
    
	public String getStudentName() 
	{ 
		return studentName; 
	}
    
    public String getStudentEmail() 
    { 
    	return studentEmail; 
    }
    
    public String getStatus() 
    { 
    	return status; 
    }
    
    public String getPaymentStatus() 
    { 
    	return paymentStatus; 
    }
	
	
//setters
	public void setStatus(String statusParam)
	{
		status = statusParam;
	}
	
	public void setPaymentStatus(String paymentStatusParam)
	{
		paymentStatus = paymentStatusParam;
	}
	
	
//to show how the object looks when printed
	@Override
	public String toString() 
	{
		return studentName + " is registered for Event #" + eventID + ". The RSVP ID is #" + rsvpID + ".";
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
