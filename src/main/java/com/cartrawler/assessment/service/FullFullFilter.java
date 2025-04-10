package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    * Filter that removes all FuelType.FULLFULL cars that are priced above the median price within their groups
 */
public class FullFullFilter extends Objective {

    public FullFullFilter() {
    }

    @Override
    protected void process(Context context) {
        if (context==null || context.getCarResults()==null || context.getCarResults().isEmpty()) {
            return;
        }

        List<CarResult> carResults = new ArrayList<>(context.getCarResults());

        // Separate into corporate and non-corporate groups
        List<CarResult> corporate = carResults.stream().filter(CarResult::isCorporateSupplier).collect(Collectors.toList());
        List<CarResult> nonCorporate = carResults.stream().filter(CarResult::isNonCorporateSupplier).collect(Collectors.toList());

        // List to hold car results to be removed
        List<CarResult> toRemove = new ArrayList<>();

        // Apply filtering on both corporate and non-corporate
        processGroup(corporate, toRemove);
        processGroup(nonCorporate, toRemove);

        // Remove the cars that are FULLFULL and above the median price
        carResults.removeAll(toRemove);

        // Set the filtered car results back to the context
        context.setCarResults(carResults);
    }

    // Process a group of car results to filter out FULLFULL cars above the median price
    private void processGroup(List<CarResult> group, List<CarResult> toRemove) {
        List<Double> prices = group.stream()
            .map(CarResult::getRentalCost)
            .sorted()
            .toList();

        double median = calculateMedian(prices);

        // Cars that are FULLFULL and above the median price will be added toRemove list
        group.stream()
            .filter(carResult -> carResult.getFuelPolicy().equals(CarResult.FuelPolicy.FULLFULL))
            .filter(carResult -> carResult.getRentalCost() > median)
            .forEach(toRemove::add);
    }

    // Calculate the median of a sorted list of prices
    private double calculateMedian(List<Double> prices) {
        if (prices.size() % 2 == 0) {
            return (prices.get(prices.size() / 2 - 1) + prices.get(prices.size() / 2)) / 2.0;
        } else {
            return prices.get(prices.size() / 2);
        }
    }
 }
