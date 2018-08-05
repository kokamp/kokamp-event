package com.kokamp.event.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Offer {
	private String description;
	private String type;
	private BigDecimal price;
	private String priceCurrency;
	private Boolean available;
	
	

}
