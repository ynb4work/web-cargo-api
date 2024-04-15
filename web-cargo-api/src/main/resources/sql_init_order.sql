CREATE SCHEMA IF NOT EXISTS web_cargo;

CREATE TABLE IF NOT EXISTS web_cargo.order (
    id UUID PRIMARY KEY,
    localdate DATE,
    quantity DOUBLE PRECISION,
    unit VARCHAR(255),
    product VARCHAR(255),
    typesoflegalentity VARCHAR(255),
    counterparty VARCHAR(255),
    "unloading-addresses" VARCHAR(255),
    "map-location" VARCHAR(255),
    "phone-number-consignee" VARCHAR(255),
    "full-name" VARCHAR(255),
    cost DOUBLE PRECISION,
    descriptions VARCHAR(255)
);



-- test info

-- INSERT INTO web_cargo."order"
-- (id, localdate, quantity, unit, product, typesoflegalentity, counterparty, "unloading-addresses", "map-location", "phone-number-consignee", "full-name", "cost", descriptions)
-- VALUES
-- ('123e4567-e89b-12d3-a456-426614174000', '2023-12-16', 23.0, 'TN', 'ASPHALT', 'TOV', 'Some Company', 'Радуга 2А', '76.67630, 33.654334', '+380991234567', 'Балкин А.А.', 2233.0, 'отгрузить асфальт'),
-- ('223e4567-e89b-12d3-a456-426614174001', '2023-11-25', 15.0, 'PSC', 'STONES', 'PP', 'Some Company', 'Маршала 10', '51.123456, 36.654321', '+380991111111', 'Иванов И.И.', 1500.0, 'отгрузить щебень'),
-- ('323e4567-e89b-12d3-a456-426614174002', '2023-10-15', 30.0, 'M3', 'SAND', 'FOP', 'Another Company', 'Лесная 1', '55.67890, 37.54321', '+380992222222', 'Сидоров С.С.', 3000.0, 'отгрузить песок');
