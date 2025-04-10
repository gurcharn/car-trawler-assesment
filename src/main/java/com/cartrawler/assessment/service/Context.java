package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;

import java.util.List;

public class Context {

    private List<CarResult> carResults;

    public Context(List<CarResult> carResults) {
        this.carResults = carResults;
    }

    public List<CarResult> getCarResults() {
        return carResults;
    }

    public void setCarResults(List<CarResult> carResults) {
        this.carResults = carResults;
    }
}
