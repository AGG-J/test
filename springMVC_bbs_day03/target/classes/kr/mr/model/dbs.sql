use sample;

create table tbl_board(
	bid int auto_increment primary key,
    subject varchar(100) not null,
    contents varchar(3000) not null,
    hit int,
    writer varchar(30) not null,
    regDate datetime default now() not null    
);

drop table tbl_board;

insert into tbl_board(subject, contents, writer)
values('test','테스트','ad');

select * from tbl_board;