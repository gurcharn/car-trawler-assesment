package com.cartrawler.assessment.car;

import java.util.List;
import java.util.Objects;

public class CarResult {

    private static final List<String> CORPORATE_SUPPLIERS = List.of("AVIS", "BUDGET", "ENTERPRISE", "FIREFLY", "HERTZ", "SIXT", "THRIFTY");

    private final String description;
    private final String supplierName;
    private final String sippCode;
    private final double rentalCost;
    private final FuelPolicy fuelPolicy;
    
	public enum FuelPolicy {
        FULLFULL,
        FULLEMPTY
    };
    
    public CarResult(String description, String supplierName, String sipp, double cost, FuelPolicy fuelPolicy) {
        this.description = description;
        this.supplierName = supplierName;
        this.sippCode = sipp;
        this.rentalCost = cost;
        this.fuelPolicy = fuelPolicy;
    }
    
    public String getDescription() {
        return this.description;        
    }
    
    public String getSupplierName() {
        return this.supplierName;        
    }
    
    public String getSippCode() {
        return this.sippCode;        
    }
    
    public double getRentalCost() {
        return this.rentalCost;        
    }
    
    public FuelPolicy getFuelPolicy() {
        return this.fuelPolicy;
    }

    public String toString() {
        return this.supplierName + " : " +
            this.description + " : " +
            this.sippCode + " : " +
            this.rentalCost + " : " +
            this.fuelPolicy;
    }

    // Added some extra methods here
    public String getCategory() {
        char first = this.getSippCode().charAt(0);
        return switch (first) {
            case 'M' -> "Mini";
            case 'E' -> "Economy";
            case 'C' -> "Compact";
            default -> "Other";
        };
    }

    public boolean isCorporateSupplier() {
        return CORPORATE_SUPPLIERS.contains(this.supplierName.toUpperCase());
    }

    public boolean isNonCorporateSupplier() {
        return !CORPORATE_SUPPLIERS.contains(this.supplierName.toUpperCase());
    }

    public String uniqueId() {
        Integer hashCode = Objects.hash(this.description, this.supplierName, this.sippCode, this.fuelPolicy);
        return String.valueOf(hashCode);
    }
}
