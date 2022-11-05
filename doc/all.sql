--drop table if exists `test`;
--create table  `test` (
--    `id` bigint not null ,
--    `name` varchar(50) ,
--    `password` varchar(50) ,
--    primary key (`id`)
--) engine=innodb default charset=utf8mb4;

drop table if exists `demo`;
create table `demo` (
    `id` bigint not null ,
    `name` varchar(50) ,
    primary key (`id`)
) engine=innodb default charset=utf8mb4;