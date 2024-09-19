package com.propvalue.property;

public record PropertyDTO (
    Long id,
    String zipCode,
    String streetName,
    int buildingNumber,
    String block,
    String unit,
    String neighborhood,
    UnitType unitType,
    LocalInfra localInfra,
    BuildingFeatures buildingFeatures,
    UnitFeatures unitFeatures
) {
}


