drop table if exists book;
drop table if exists author;

create table book (
                      id BIGINT GENERATED ALWAYS AS IDENTITY not null,
                      isbn varchar(255),
                      publisher varchar(255),
                      title varchar(255),
                      author_id bigint,
                      primary key (id)
) engine=InnoDB;

create table author (
                        id BIGINT GENERATED ALWAYS AS IDENTITY not null,
                        last_name varchar(255),
                        first_name varchar(255),
                        primary key (id)
) engine=InnoDB;