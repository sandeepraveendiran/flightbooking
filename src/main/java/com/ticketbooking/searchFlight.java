package com.ticketbooking;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ticketbooking.pojo.searchListDC;

@Component
public class searchFlight implements ISearchFlight{

	public Map<String, Object> searchFlight(String s_sourceCity,String s_destinationCity,String s_travelDate, String s_returnDate) throws Exception {
		// TODO Auto-generated method stub
		searchListDC searchList = new searchListDC();
		searchList.setFlightNumber("12345");
		searchList.setAirlineName("kingfisher");
		searchList.setDuration("2hrs");
		searchList.setDepartureArrival("11.00 a.m to 1.00 pm");
		searchList.setNumberOfStops("1");
		searchList.setPrice("Rs.7500");
		searchList.setTotalNumberOfResult("2");
		System.out.println("Details are fetching");
		if(s_sourceCity.equals("chennai")&&s_destinationCity.equals("thailand")&&s_travelDate.equals("24/07/2020")&&s_returnDate.equals("30/07/2020") )
		{
		System.out.println("Please Find the Search List Result:" +searchList);
		}
		else
		{
		System.out.println("Currently not flight available due to covid 19");	
		}
		return null;
	}


}
