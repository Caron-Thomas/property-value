package com.propvalue.property;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PropertyRepository {

    private List<Property> properties = new ArrayList<>();

    public List<Property> findAll() {
        return properties;
    }

    public Optional<Property> findById(Long id){
        return properties.stream()
                .filter(property -> property.id().equals(id))
                .findFirst();
    }

    public void create(Property property) {
        properties.add(property);
    }

    public void update(Property property, Long id) {
        Optional<Property> existingProperty = findById(id);
        existingProperty.ifPresent(value -> properties.set(properties.indexOf(value), property));
    }

    public void delete(Long id) {
        properties.removeIf(property -> property.id().equals(id));
    }



    @PostConstruct
    private void init() {
        properties.add( new Property(
                1L,
                "80.250-000",
                "Teste",
                2,
                "4B",
                "156",
                "Cristo Rei",
                UnitType.APTO_TYPE,
                new LocalInfra(true,
                        true,
                        true,
                        false,
                        LocalInfra.RouteType.PRINCIPAL),
                new BuildingFeatures(BuildingFeatures.ConstructionStandard.HIGH,
                        2,
                        4,
                        4,
                        3,
                        2,
                        5,
                        Conservation.GOOD_SHAPE,
                        11,
                        true),
                new UnitFeatures(55.77F,
                        123.55f,
                        0f,
                        3,
                        1,
                        1,
                        0,
                        1,
                        0,
                        0,
                        0,
                        false,
                        0,
                        Conservation.GOOD_SHAPE)
                )
        );

        properties.add(new Property(
                2L,
                "80.250-000",
                "Teste",
                2,
                "4B",
                "155",
                "Cristo Rei",
                UnitType.APTO_TYPE,
                new LocalInfra(true,
                        true,
                        true,
                        false,
                        LocalInfra.RouteType.PRINCIPAL),
                new BuildingFeatures(BuildingFeatures.ConstructionStandard.HIGH,
                        2,
                        4,
                        4,
                        3,
                        2,
                        5,
                        Conservation.NEED_PAINTING,
                        11,
                        true),
                new UnitFeatures(55.77F,
                        123.55f,
                        0f,
                        3,
                        1,
                        1,
                        0,
                        1,
                        0,
                        0,
                        0,
                        false,
                        0,
                        Conservation.GOOD_SHAPE))
        );
    }
}
