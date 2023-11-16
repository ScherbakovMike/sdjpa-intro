drop table if exists book;
drop table if exists book_seq;
drop table if exists author;
drop table if exists author_seq;

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

insert into book_seq values (1);
