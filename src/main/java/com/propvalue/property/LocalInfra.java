package com.propvalue.property;

public record LocalInfra(
        boolean asphalt,
        boolean curbsAndGutters,
        boolean sewage,
        boolean septicTank,
        RouteType routeType
) {
    public enum RouteType{
        PRINCIPAL(3, "Via arterial/Principal"),
        SECONDARY(2, "Via Coletora/Importante"),
        LOCAL(1, "Via Local");

        private final int scale;
        private final String description;

        RouteType(int scale, String description) {
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
