package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts car results into two groups: corporate and non-corporate.
 * Each group is sorted by category and rental cost.
 */
public class GroupSorter extends Objective {

    public GroupSorter() {
    }

    @Override
    protected void process(Context context) {
        List<CarResult> carResults = context.getCarResults();
        if (carResults == null || carResults.isEmpty()) {
            return;
        }

        // Separate into corporate and non-corporate groups
        List<CarResult> corporate = new ArrayList<>();
        List<CarResult> nonCorporate = new ArrayList<>();
        for (CarResult carResult : carResults) {
            if (carResult.isCorporateSupplier()) {
                corporate.add(carResult);
            } else {
                nonCorporate.add(carResult);
            }
        }

        // Sort each group by category and rental cost
        Comparator<CarResult> comp = Comparator.comparing(CarResult::getCategory)
            .thenComparingDouble(CarResult::getRentalCost);
        corporate.sort(comp);
        nonCorporate.sort(comp);

        List<CarResult> sorted = new ArrayList<>();
        sorted.addAll(corporate);
        sorted.addAll(nonCorporate);

        // Set the sorted car results back to the context
        context.setCarResults(sorted);
    }
}
