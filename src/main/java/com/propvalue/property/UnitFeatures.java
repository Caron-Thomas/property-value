package com.propvalue.property;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record UnitFeatures(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        double privateArea,
        double totalArea,
        double privateTerraceArea,
        int bedRooms,
        int livingRooms,
        int socialBathRooms,
        int washRooms,
        int closet,
        int office,
        int balcony,
        int storage,
        boolean isServiceAreaSeparate,
        int garage,
        int unityItems,
        Conservation unitConservation
) {
}
