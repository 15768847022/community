create table question
(
	id int auto_increment,
	title varchar(50) null,
	description TEXT null,
	gmt_create BIGINT null,
	gmt_modified BIGINT null,
	creator int null,
	comment_count int default 0 null,
	view_count int default 0 null,
	like_count int default 0 null,
	tag varchar(256) null,
	constraint question_pk
		primary key (id)
);

