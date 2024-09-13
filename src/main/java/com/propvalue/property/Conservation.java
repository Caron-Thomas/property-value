package com.propvalue.property;

public enum Conservation {
    NEW("Imóvel novo (até 1 ano)", 1F),
    GOOD_SHAPE("Imóvel com aparência de novo", 1.5F),
    NEED_PAINTING("Aparência de usado, porém sem necessidade de reparos", 2F),
    NEED_A_HAND("Aparência de usado, necessidade de manutenção (consertos em geral)", 2.5F),
    BAD_SHAPE("Necessidade de reparos simples -  manutenção + pintura", 3F);

    private final String description;
    private final float scale;

    Conservation(String description, float scale) {
        this.description = description;
        this.scale = scale;
    }

    public String getDescription() {
        return description;
    }

    public float getScale() {
        return scale;
    }
}
