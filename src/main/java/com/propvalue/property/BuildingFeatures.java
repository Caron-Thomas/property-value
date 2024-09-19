package com.propvalue.property;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record BuildingFeatures(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
       ConstructionStandard constructionStandard,
       int unitsPerFloor,
       int levels,
       int unitsPerBlock,
       int blockQuantity,
       int age,
       int elevatorsQuantity,
       Conservation buildingConservation,
       int buildingItems,
       boolean allHourSecurityDesk
) {
    public enum ConstructionStandard {
        LOW(1, "Baixo"),
        POPULAR(2, "Popular"),
        NORMAL_LOW(3, "Normal Baixo"),
        NORMAL_HIGH(4, "Normal Alto"),
        HIGH(5, "Alto Padrão");

        private final int scale;
        private final String description;

        ConstructionStandard(int scale, String description) {
            this.scale = scale;
            this.description = description;
        }

        public int getScale() {
            return scale;
        }

        public String getDescription() {
            return description;
        }
    }
}
