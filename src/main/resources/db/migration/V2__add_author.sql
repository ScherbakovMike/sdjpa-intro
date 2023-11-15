
create table author (
                        id bigint not null,
                        last_name varchar(255),
                        first_name varchar(255),
                        primary key (id)
) engine=InnoDB;

create table author_seq (
    next_val bigint
) engine=InnoDB;

insert into author_seq values (1)
