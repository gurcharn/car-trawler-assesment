package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Removes duplicate car results based on unique ID.
 * This is the first step in the chain of objectives.
 */
public class DuplicateRemover extends Objective {

    public DuplicateRemover() {
    }

    @Override
    public void process(Context context) {
        if (context==null || context.getCarResults()==null || context.getCarResults().isEmpty()) {
            return;
        }

        // Use a LinkedHashMap to maintain insertion order
        Map<String, CarResult> unique = new LinkedHashMap<>();
        for (CarResult carResult : context.getCarResults()) {
            unique.putIfAbsent(carResult.uniqueId(), carResult);
        }

        // Convert the values of the map back to a list
        context.setCarResults(new ArrayList<>(unique.values()));
    }
}
