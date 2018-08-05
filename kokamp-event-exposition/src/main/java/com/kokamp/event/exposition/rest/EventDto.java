package com.kokamp.event.exposition.rest;

import com.kokamp.event.domain.entity.Location;
import com.kokamp.event.domain.entity.Offer;
import com.kokamp.event.domain.entity.Organiser;
import lombok.Data;
import main.java.com.kokamp.event.exposition.rest.LocationDto;
import main.java.com.kokamp.event.exposition.rest.OfferDto;

import java.time.ZonedDateTime;
import java.util.List;
@Data
public class EventDto {
    private String id;
    private String name;
    private String description;
    private LocationDto location;
    //"startDate": "2018-12-06T19:00:00+00:00",
    // "endDate": "2018-12-06T23:00:00+00:00",
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private List<OfferDto> offers ;
    private List<String> imageUrls;
    private List<Organiser> organisers;

}
