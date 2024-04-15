CREATE SCHEMA web_cargo;

    CREATE TABLE web_cargo.order (
                                     id UUID PRIMARY KEY,
                                     dateField DATE,
                                     quantity DOUBLE PRECISION,
                                     units VARCHAR(255),
                                     product VARCHAR(255),
                                     legalEntity VARCHAR(255),
                                     counterparty VARCHAR(255),
                                     unloading_addresses VARCHAR(255),
                                     maps_location VARCHAR(255),
                                     phone_number_consignee VARCHAR(255),
                                     full_name VARCHAR(255),
                                     cost DOUBLE PRECISION,
                                     descriptions VARCHAR(255)
    );