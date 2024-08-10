-- Create the Customer table
CREATE TABLE customer (
                          customer_id VARCHAR(20) PRIMARY KEY
);

-- Create the Contact table
CREATE TABLE contact (
                         hash_contact VARCHAR(30) PRIMARY KEY,
                         contact_type VARCHAR(30)
);

-- Create the relationship table for Customer and Contact
CREATE TABLE customer_id_contact_hash (
                                          customer_id VARCHAR(30),
                                          contact_hash VARCHAR(30),
                                          PRIMARY KEY (customer_id, contact_hash),
                                          FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
                                          FOREIGN KEY (contact_hash) REFERENCES contact(hash_contact)
);
