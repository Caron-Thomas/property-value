package com.propvalue.property;

public enum UnitType {
    APTO_TYPE(1, "Apartamento tipo"),
    GARDEM(2, "Gardem"),
    PENTHOUSE(3, "Cobertura"),
    DUPLEX(4, "Duplex");

    private final int scale;
    private final String desciption;

    UnitType(int scale, String desciption) {
        this.scale = scale;
        this.desciption = desciption;
    }

    public int getScale() {
        return scale;
    }

    public String getDesciption() {
        return desciption;
    }
}
