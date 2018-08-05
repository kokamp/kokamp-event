package main.java.com.kokamp.event.exposition.rest;

import lombok.Data;

@Data
public class AddressDto {
    private String type;
    //: "Arena Square",
    private String streetAddress;
    //addressLocality : "LONDON"
    private String addressLocality;
    //"postalCode": "HA9 0AA",
    private String postalCode;
    //"addressCountry": "United Kingdom"
    private String addressCountry;
}
