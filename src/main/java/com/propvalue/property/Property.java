package com.propvalue.property;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public record Property(
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       Long id,
       @NotEmpty
       String zipCode,
       String streetName,
       @PositiveOrZero
       int buildingNumber,
       String block,
       String unit,
       String neighborhood,
       String unitType,
       long local_infra_id,
       long building_features_id,
       long unit_features_id
    ) {
}
