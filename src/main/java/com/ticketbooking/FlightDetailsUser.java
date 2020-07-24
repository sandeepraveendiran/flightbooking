package com.ticketbooking;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ticketbooking.pojo.userDetailsDC;


@Controller

public class FlightDetailsUser {
	
	@Autowired
	ISearchFlight searchFlightDetails;
	
	String s_sourceCity = "chennai";
	String s_destinationCity = "thailand";
	String s_travelDate = "24/07/2020";
	String s_returnDate = "30/07/2020";
	
	
	Map<String, Object> UserDetails(String s_sourceCity,String s_destinationCity,String s_travelDate, String s_returnDate)
	       
	        throws Exception {
	   
		return searchFlightDetails.searchFlight( s_sourceCity, s_destinationCity, s_travelDate,  s_returnDate);
	}

     

	

}
