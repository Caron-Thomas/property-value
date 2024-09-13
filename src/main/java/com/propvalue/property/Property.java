package com.propvalue.property;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record Property(
        Long id,
        @NotEmpty
        String zipCode,
        String streetName,
        @PositiveOrZero
        int number,
        String block,
        String unit,
        String neighborhood,

        UnitType unitType,

        LocalInfra localInfra,

        BuildingFeatures buildingFeatures,

        UnitFeatures unitFeatures
    ) {
}
