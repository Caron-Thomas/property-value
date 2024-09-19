package com.propvalue.property;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PropertyRepository {

    private static final Logger log = LoggerFactory.getLogger(PropertyRepository.class);
    private final JdbcClient jdbcClient;

    public PropertyRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Property> findAll() {
        return jdbcClient.sql(
                "SELECT * FROM property"
                )
                .query(Property.class)
                .list();
    }


    public Optional<Property> findById(Long id) {
        return jdbcClient.sql(
                "SELECT * FROM property where id = :id"
        )
                .param("id", id)
                .query(Property.class)
                .optional();
    }

    public void create(Property property) {
        var created = jdbcClient.sql(
                "INSERT INTO property(id, zip_code, street_name, building_number, block, unit, neighborhood,unit_type,local_infra_id,building_features_id,unit_features_id) values(?,?,?,?,?,?,?,?,?,?,?)"
                )
                .param(1, property.id())
                .param(2, property.zipCode())
                .param(3,property.streetName())
                .param(4,property.buildingNumber())
                .param(5,property.block())
                .param(6,property.unit())
                .param(7,property.neighborhood())
                .param(8,2)
                .param(9,3)
                .param(10,4)
                .param(11,2)
                .update();

        Assert.state(created ==1, "Failed to create property " + property.streetName());
    }

    public void update(Property property, Long id) {
        var updated = jdbcClient.sql("UPDATE property SET id = ?, zip_code = ?, street_name = ?, building_number = ?, block = ?, unit = ?, neighborhood = ? WHERE  id = ?")
                .param(List.of(property.id(), property.zipCode(), property.streetName(),property.buildingNumber(),property.block(),property.unit(),property.neighborhood(), id))
                .update();

        Assert.state(updated ==1, "Failed to update property " + property.streetName());
    }


    public void delete(Long id) {
        var deleted = jdbcClient.sql("DELETE FROM property WHERE id = :id")
                .param("id", id)
                .update();

        Assert.state(deleted ==1, "Failed to update property " + id);
    }
}
