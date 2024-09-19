CREATE TABLE IF NOT EXISTS local_infra (
                                           id BIGINT NOT NULL,
                                           asphalt BOOLEAN NOT NULL,
                                           curbs_and_gutters BOOLEAN NOT NULL,
                                           sewage BOOLEAN NOT NULL,
                                           septic_tank BOOLEAN NOT NULL,
                                           route_type INT NOT NULL,
                                           PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS building_features (
                                                id BIGINT NOT NULL,
                                                construction_standard INT NOT NULL,
                                                units_per_floor INT NOT NULL,
                                                levels INT NOT NULL,
                                                units_per_block INT NOT NULL,
                                                blocks_quantity INT NOT NULL,
                                                age INT NOT NULL,
                                                elevators_quantity INT NOT NULL,
                                                conservation DECIMAL(5, 1)NOT NULL,
                                                building_items INT NOT NULL,
                                                all_hour_security_desk BOOLEAN NOT NULL,
                                                PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS unit_features (
                                            id BIGINT NOT NULL,
                                            private_area DECIMAL(10, 2) NOT NULL, -- Definido como decimal para áreas
                                            total_area DECIMAL(10, 2) NOT NULL,
                                            private_terrace_area DECIMAL(10, 2),
                                            bedrooms INT NOT NULL,
                                            living_rooms INT NOT NULL,
                                            social_bathrooms INT NOT NULL,
                                            private_bathrooms INT NOT NULL,
                                            washroom INT,
                                            service_area DECIMAL(10, 2),
                                            closet INT,
                                            office INT,
                                            balcony INT,
                                            storage INT,
                                            is_service_area_separate BOOLEAN NOT NULL,
                                            garage INT,
                                            unit_items INT NOT NULL,
                                            conservation DECIMAL(5, 1) NOT NULL,
                                            PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS property (
                                        id BIGINT NOT NULL,
                                        zip_code VARCHAR(9),
                                        street_name VARCHAR(250),
                                        building_number VARCHAR(10),
                                        block VARCHAR(15),
                                        unit VARCHAR(10),
                                        neighborhood VARCHAR(250),
                                        unit_type INT NOT NULL,
                                        local_Infra_id BIGINT NOT NULL,
                                        building_Features_id BIGINT NOT NULL,
                                        unit_features_id BIGINT NOT NULL,
                                        PRIMARY KEY (id),
                                        FOREIGN KEY (local_infra_id) REFERENCES local_infra(id),
                                        FOREIGN KEY (building_features_id) REFERENCES building_features(id),
                                        FOREIGN KEY (unit_features_id) REFERENCES unit_features(id)
    )