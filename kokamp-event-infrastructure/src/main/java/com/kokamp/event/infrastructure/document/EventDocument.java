package com.kokamp.event.infrastructure.document;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
 * 
 */
@Data
@Document(collection = "event")

public class EventDocument {
	@Id
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
