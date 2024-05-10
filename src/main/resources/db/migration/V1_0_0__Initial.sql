create table notification (id bigserial not null, message text, title varchar(255) not null, actions jsonb, primary key (id));
