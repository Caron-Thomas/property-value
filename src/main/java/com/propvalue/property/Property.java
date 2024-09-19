package com.propvalue.property;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;


public record Property(
        Long id,
        @NotEmpty
        String zipCode,
        String streetName,
        @PositiveOrZero
        //@Column(name = "building_number" )
        int buildingNumber,//number,
        String block,
        String unit,
        String neighborhood,

        UnitType unitType,

        LocalInfra localInfra,

        BuildingFeatures buildingFeatures,

        UnitFeatures unitFeatures
    ) {
}
