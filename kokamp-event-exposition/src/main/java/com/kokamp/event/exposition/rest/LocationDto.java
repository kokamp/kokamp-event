package main.java.com.kokamp.event.exposition.rest;

import lombok.Data;

@Data
public class LocationDto {
    private String type;
    private AddressDto address;
}
