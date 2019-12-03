INSERT INTO contact_details (id, email_address, cell_no)
VALUES (1, 'dimakzela@gmail.com', '0730914101');

INSERT INTO address (id, town, suburb, area_code)
VALUES (1, 'Midrand', 'Ebony Park Ext 6', 1632);

INSERT INTO personal_info (id, first_name, middle_name, last_name, date_of_birth, contact_details, address)
VALUES (1, 'Dimakatso','Piet', 'Bopape', PARSEDATETIME('26 Jul 2016','dd MMM yyyy','en'), 1, 1);
