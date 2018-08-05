package com.kokamp.event.domain.entity;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

/*
 * 
 */
@Data
public class EventEntity {
	private String id;
	private String name;
	private String description;
	private Location location;
	 //"startDate": "2018-12-06T19:00:00+00:00",
	 // "endDate": "2018-12-06T23:00:00+00:00",
	private ZonedDateTime startDate;
	private ZonedDateTime endDate;
	private List<Offer> offers ;
	private List<String> imageUrls;
	private List<Organiser> organisers;
	
	

}
