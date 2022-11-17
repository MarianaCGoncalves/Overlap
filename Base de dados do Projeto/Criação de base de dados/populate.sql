/* mudar nome das equipas */
insert into tags (tag_name) values ('Ferrari'); 
insert into tags (tag_name) values ('Mercedes');
insert into tags (tag_name) values ('RedBull');
insert into tags (tag_name) values ('Mclaren');
insert into tags (tag_name) values ('Alpine');
insert into tags (tag_name) values ('Alfa Romeo');
insert into tags (tag_name) values ('Aston Martin');
insert into tags (tag_name) values ('Haas');
insert into tags (tag_name) values ('Alphatauri');
insert into tags (tag_name) values ('Williams');

insert into tu (tu_tag_id, tu_use_id) values (1,3) -- francisco -> redbull.
insert into tu (tu_tag_id, tu_use_id) values (2,1) -- joana -> ferrari.
insert into tu (tu_tag_id, tu_use_id) values (3,8) -- rafael -> haas.
insert into tu (tu_tag_id, tu_use_id) values (1,1) -- 
insert into tu (tu_tag_id, tu_use_id) values (1,1)

insert into tg (tg_tag_id, tg_gru_id) values (1,1)
insert into tg (tg_tag_id, tg_gru_id) values (1,1)
insert into tg (tg_tag_id, tg_gru_id) values (1,1)
insert into tg (tg_tag_id, tg_gru_id) values (1,1)
insert into tg (tg_tag_id, tg_gru_id) values (1,1)

insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Francisco Costa','','123','fcosta@gmail.com');
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Joana Santos','','123','joanasantos@gmail.com');
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Rafael Montes','','123','montesrafa@gmail.com');
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Andreia André','','123','AA@gmail.com');
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Álvaro Lopes','','123','ALopes@gmail.com');

/*alterar os nomes das equipas e ids */
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Ferrari','Grupo que junta pessoas com interesse na equipa de f1 Ferrari.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mercedes','Grupo que junta pessoas com interesse na equipa de f1 Mercedes.','2');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo RedBull','Grupo que junta pessoas com interesse na equipa de f1 RedBull.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mclaren ','Grupo que junta pessoas com interesse na equipa de f1 Mclaren.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alpine','Grupo que junta pessoas com interesse na equipa de f1 Alpine.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alfa Romeo','Grupo que junta pessoas com interesse na equipa de f1 Alfa Romeo.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Aston Martin','Grupo que junta pessoas com interesse na equipa de f1 Aston Martin.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Haas','Grupo que junta pessoas com interesse na equipa de f1 Haas.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alphatauri','Grupo que junta pessoas com interesse na equipa de f1 Alphatauri.','1');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Williams','Grupo que junta pessoas com interesse na equipa de f1 Williams.','1');


insert into ug(ug_use_id, ug_gru_id) values ()

insert into events (eve_ug_id, eve_dt, eve_ts, eve_evt_id) values ()

insert into message (mes_ug_id, mes_ts, mes_text) values ()


insert into estado (est_name) values ('Vai ao evento.'); -- fazer enum.
insert into estado (est_name) values ('Vai chegar atrasado.');
insert into estado (est_name) values ('Não vai ao evento.');
insert into estado (est_name) values ('Cancelou.');

insert into uge (uge_ug_id, uge_eve_id) values ()

insert into eveonline (eve_on_name, eve_on_desc, eve_on_dt, eve_on_eve_id) values ()

insert into evefisico (eve_fi_name, eve_fi_desc, eve_fi_dt, eve_fi_eve_id) values ()

insert into localizacao (local_name, local_point) values () -- utilizando a variavel point do PostGIS.

insert into evefilocal (eve_filocal_evefi_id, eve_filocal_local_id) values ()

-- tipo de evento : enumeracao?

insert into ugestado (ugest_uge_id, ugest_est_id) values ()

insert into comment (comm_mes_id, comm_ug_id, comm_mes_text) values ()

insert into follows ( fol_use_idA, fol_use_idB) values ()
