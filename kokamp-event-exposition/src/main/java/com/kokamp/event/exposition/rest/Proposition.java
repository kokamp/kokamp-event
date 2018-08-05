package com.kokamp.event.exposition.rest;

import java.util.List;

public class Proposition {
    private String answerId;
    private List<String> propositionProducts;

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public List<String> getPropositionProducts() {
        return propositionProducts;
    }

    public void setPropositionProducts(List<String> propositionProducts) {
        this.propositionProducts = propositionProducts;
    }

    @Override
    public String toString() {
        return "Proposition{" +
                "answerId='" + answerId + '\'' +
                ", propositionProducts=" + propositionProducts +
                '}';
    }
}
