# --drop table if exists `test`;
# --create table  `test` (
# --    `id` bigint not null ,
# --    `name` varchar(50) ,
# --    `password` varchar(50) ,
# --    primary key (`id`)
# --) engine=innodb default charset=utf8mb4;
#
# --drop table if exists `demo`;
# --create table `demo` (
# --    `id` bigint not null ,
# --    `name` varchar(50) ,
# --    primary key (`id`)
# --) engine=innodb default charset=utf8mb4;
use wikidev;
drop table if exists `ebook`;
create table `ebook` (
    `id` bigint not null  comment 'id',
    `name` varchar(50) comment '名称' ,
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description`  varchar (200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='电子书';


insert into `ebook` (id, name, description) values (1, 'Spring Boot入门教程', '零基础入门Java开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (2, 'Python 入门教程', '零基础入门 Python 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (3, 'Mysql 入门教程', '零基础入门 Mysql 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (4, 'Vue 入门教程', '零基础入门 Vue 开发，企业级应用开发最佳首选框架');