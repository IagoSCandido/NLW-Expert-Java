CREATE TABLE public.students (
    id BIGSERIAL NOT NULL, email VARCHAR(30) NOT NULL, CONSTRAINT pk_students PRIMARY KEY (id)
);

CREATE TABLE public.alternatives (
    id BIGSERIAL NOT NULL, description VARCHAR(255), is_correct BOOLEAN, CONSTRAINT pk_alternatives PRIMARY KEY (id)
);

CREATE TABLE public.alternatives (
    id BIGSERIAL NOT NULL, description VARCHAR(255), is_correct BOOLEAN, CONSTRAINT pk_alternatives PRIMARY KEY (id)
)