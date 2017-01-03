drop table app_user;


create table app_user (
	email				VARCHAR(256),
	first_name			VARCHAR(32),
	last_name			VARCHAR(32),
	app_user_id 		RAW(16) NOT NULL,
	login_id			VARCHAR(32),
	pswd				VARCHAR(32),
	pswd_last_chng_dt	TIMESTAMP(6),
	last_login_dt		TIMESTAMP(6));

	
ALTER TABLE app_user
	ADD CONSTRAINT UQ_app_user UNIQUE (app_user_id);