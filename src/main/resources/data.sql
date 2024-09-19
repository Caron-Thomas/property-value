INSERT INTO local_infra (id, asphalt, curbs_and_gutters, sewage, septic_tank, route_type)
VALUES    (1, TRUE, TRUE, TRUE, FALSE, 1),
          (2, TRUE, TRUE, FALSE, TRUE, 2),
          (3, FALSE, FALSE, TRUE, FALSE, 1),
          (4, TRUE, FALSE, TRUE, TRUE, 3);

INSERT INTO building_features (id, construction_standard, units_per_floor, levels, units_per_block, blocks_quantity, age, elevators_quantity, conservation, building_items, all_hour_security_desk)
VALUES    (1, 3, 4, 10, 40, 4, 15, 2, 8.5, 12, TRUE),
          (2, 2, 6, 8, 48, 6, 20, 3, 7.2, 15, TRUE),
          (3, 1, 3, 12, 36, 3, 5, 1, 9.0, 8, FALSE),
          (4, 3, 8, 15, 60, 7, 10, 4, 8.8, 18, TRUE);

INSERT INTO unit_features (id, private_area, total_area, private_terrace_area, bedrooms, living_rooms, social_bathrooms, private_bathrooms, washroom, service_area, closet, office, balcony, storage, is_service_area_separate, garage, unit_items, conservation)
VALUES    (1, 75.50, 100.75, 20.00, 3, 1, 2, 1, 1, 5.50, 1, 0, 1, 1, TRUE, 2, 12, 9.0),
          (2, 90.00, 120.50, 25.00, 4, 2, 2, 2, 1, 6.00, 2, 1, 0, 0, FALSE, 1, 15, 8.5),
          (3, 65.00, 80.00, 15.00, 2, 1, 1, 1, 0, 4.00, 1, 0, 1, 0, TRUE, 1, 10, 7.8),
          (4, 110.00, 150.00, 30.00, 5, 2, 3, 3, 1, 8.00, 3, 1, 1, 1, TRUE, 3, 20, 9.5);
INSERT INTO property (id, zip_code, street_name, building_number, block, unit, neighborhood, unit_type, local_infra_id, building_features_id, unit_features_id)
VALUES    (1, '12345-678', 'Main Street', '100', 'A', '101', 'Downtown', 1, 1, 1, 1),
          (2, '23456-789', 'Second Avenue', '200', 'B', '202', 'Uptown', 2, 2, 2, 2),
          (3, '34567-890', 'Third Blvd', '300', 'C', '303', 'Midtown', 3, 3, 3, 3),
          (4, '45678-901', 'Fourth Road', '400', 'D', '404', 'Suburb', 4, 4, 4, 4);
