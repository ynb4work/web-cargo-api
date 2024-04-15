CREATE SCHEMA web_cargo;

    CREATE TABLE web_cargo.order (
                                             uuid UUID PRIMARY KEY,
                                             dateField DATE,
                                             quantity DOUBLE PRECISION,
                                             units VARCHAR(10),
                                             products VARCHAR(50),
                                             legalEntities VARCHAR(50),
                                             counterParty VARCHAR(100),
                                             unloadingAddresses VARCHAR(255),
                                             mapsLocation VARCHAR(100),
                                             phoneNumberConsignee VARCHAR(20),
                                             fullName VARCHAR(100),
                                             cost DOUBLE PRECISION,
                                             descriptions TEXT
    );