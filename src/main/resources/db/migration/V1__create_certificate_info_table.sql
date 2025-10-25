CREATE TABLE certificate_info (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(255) NOT NULL,
    description TEXT,
    notes TEXT,
    certificate_url VARCHAR(512),
    date_of_certification DATE,
    status VARCHAR(50)
);
