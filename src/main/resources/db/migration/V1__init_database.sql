# drop table if exists book;
# drop table if exists book_seq;

create table book (
                      id bigint not null,
                      isbn varchar(255),
                      publisher varchar(255),
                      title varchar(255),
                      author_id bigint,
                      primary key (id)
) engine=InnoDB;

create table book_seq (
    next_val bigint
) engine=InnoDB;

insert book_seq values (1);