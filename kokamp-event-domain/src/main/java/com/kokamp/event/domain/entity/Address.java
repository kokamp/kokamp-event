package com.kokamp.event.domain.entity;

import lombok.Data;

@Data
public class Address {
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
