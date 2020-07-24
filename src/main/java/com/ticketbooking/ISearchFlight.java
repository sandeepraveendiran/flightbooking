package com.ticketbooking;

import java.util.Map;

public interface ISearchFlight {
	
	public Map<String, Object> searchFlight(String s_sourceCity,String s_destinationCity,String s_travelDate, String s_returnDate)
	        throws Exception;
}

