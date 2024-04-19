CREATE SCHEMA IF NOT EXISTS web_cargo;

CREATE TABLE IF NOT EXISTS web_cargo.order (
                                               id UUID PRIMARY KEY,
                                               local_date DATE,
                                               quantity DOUBLE PRECISION,
                                               unit VARCHAR(255),
                                               product VARCHAR(255),
                                               legal_entity VARCHAR(255),
                                               counterparty VARCHAR(255),
                                               unloading_address VARCHAR(255),
                                               map_location VARCHAR(255),
                                               phone_number_consignee VARCHAR(255),
                                               full_name VARCHAR(255),
                                               cost DOUBLE PRECISION,
                                               descriptions VARCHAR(255)
);



-- test info

-- INSERT INTO web_cargo."order"
-- (id, local_date, quantity, unit, product, legal_entity, counterparty, unloading_address, map_location, phone_number_consignee, full_name, "cost", descriptions)
-- VALUES
-- ('123e4567-e89b-12d3-a456-426614174011', '2023-12-16', 23.0, 'TN', 'ASPHALT', 'TOV', 'Some Company', 'Радуга 2А', '76.67630, 33.654334', '+380991234567', 'Балкин А.А.', 2233.0, 'отгрузить асфальт'),
-- ('223e4567-e89b-12d3-a456-426614174021', '2023-11-25', 15.0, 'PCS', 'STONES', 'PP', 'Some Company', 'Маршала 10', '51.123456, 36.654321', '+380991111111', 'Иванов И.И.', 1500.0, 'отгрузить щебень'),
-- ('323e4567-e89b-12d3-a456-426614174033', '2023-10-15', 30.0, 'M3', 'SAND', 'FOP', 'Another Company', 'Лесная 1', '55.67890, 37.54321', '+380992222222', 'Сидоров С.С.', 3000.0, 'отгрузить песок');
