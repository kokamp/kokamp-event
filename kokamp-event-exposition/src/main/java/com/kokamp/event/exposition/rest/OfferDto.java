package main.java.com.kokamp.event.exposition.rest;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OfferDto {
    private String description;
    private String type;
    private BigDecimal price;
    private String priceCurrency;
    private Boolean available;
}
