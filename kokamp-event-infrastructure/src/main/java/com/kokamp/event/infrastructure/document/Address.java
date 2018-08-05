package com.kokamp.event.infrastructure.document;

import lombok.Data;

@Data
public class Address {
	// postal
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
