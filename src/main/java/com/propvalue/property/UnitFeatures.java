package com.propvalue.property;

public record UnitFeatures(
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
