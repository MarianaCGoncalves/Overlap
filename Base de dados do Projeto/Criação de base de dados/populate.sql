insert into tags (tag_name) values ('Ferrari'); -- 1
insert into tags (tag_name) values ('Mercedes'); -- 2
insert into tags (tag_name) values ('RedBull'); -- 3
insert into tags (tag_name) values ('Mclaren'); -- 4
insert into tags (tag_name) values ('Alpine'); -- 5
insert into tags (tag_name) values ('Alfa Romeo'); -- 6
insert into tags (tag_name) values ('Aston Martin'); -- 7
insert into tags (tag_name) values ('Haas'); -- 8
insert into tags (tag_name) values ('Alphatauri'); -- 9
insert into tags (tag_name) values ('Williams'); -- 10

insert into usertag (tu_tag_id, tu_use_id) values (1,1); -- Gustavo Costa - Ferrari, RedBull
insert into usertag (tu_tag_id, tu_use_id) values (2,6); -- Francisco Andrade - Alfa Romeo
insert into usertag (tu_tag_id, tu_use_id) values (3,8); -- Joana Pinto - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (4,1); -- Manuel Gusmão - Ferrari
insert into usertag (tu_tag_id, tu_use_id) values (5,6); -- Pablo Diaz - Alfa Romeo, RedBull
insert into usertag (tu_tag_id, tu_use_id) values (6,5); -- Maria Pereira - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (7,5); -- José Almeida - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (8,3); -- Frederico Pinheiro - RedBull, Ferrari
insert into usertag (tu_tag_id, tu_use_id) values (9,3); -- Júlia Pinheiro - RedBull, Ferrari

insert into grouptag (tg_tag_id, tg_gru_id) values (1,1); -- Ferrari - Grupo Ferrari
insert into grouptag (tg_tag_id, tg_gru_id) values (2,2); -- Mercedes - Grupo Mercedes
insert into grouptag (tg_tag_id, tg_gru_id) values (3,3); -- RedBull - Grupo RedBull
insert into grouptag (tg_tag_id, tg_gru_id) values (4,4); -- Mclaren - Grupo Mclaren
insert into grouptag (tg_tag_id, tg_gru_id) values (5,5); -- Alpine - Grupo Alpine
insert into grouptag (tg_tag_id, tg_gru_id) values (6,6); -- Alfa Romeo - Grupo Alfa Romeo
insert into grouptag (tg_tag_id, tg_gru_id) values (7,7); -- Aston Martin - Grupo Aston Martin
insert into grouptag (tg_tag_id, tg_gru_id) values (8,8); -- Haas - Grupo Haas
insert into grouptag (tg_tag_id, tg_gru_id) values (9,9); -- Alphatauri - Grupo Alphatauri
insert into grouptag (tg_tag_id, tg_gru_id) values (10,10); -- Williams - Grupo Williams

insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Gustavo Costa','','123','gcosta@gmail.com'); -- Criação do utilizador Gustavo Costa
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Joana Pinto','','123','joanapinto@gmail.com'); -- Criação do utilizador Joana Pinto
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Francisco Andrade','','123','frandrade@gmail.com'); -- Criação do utilizador Francisco Andrade
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Manuel Gusmão','','123','MG@gmail.com'); -- Criação do utilizador Manuel Gusmão
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Pablo Diaz','','123','PDiaz@gmail.com'); -- Criação do utilizador Pablo Diaz
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Maria Pereira','','123','maripe@gmail.com'); -- Criação do utilizador Maria Pereira
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('José Almeida','','123','JAlmeida@gmail.com'); -- Criação do utilizador José Almeida
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Frederico Pinheiro','','123','pinheiro@gmail.com'); -- Criação do utilizador Frederico Pinheiro
insert into user (use_name, use_acc_age, use_pass, use_mail) values ('Júlia Pinheiro','','123','juliapinheiro@gmail.com'); -- Criação do utilizador Júlia Pinheiro

insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Ferrari','Grupo que junta pessoas com interesse na equipa de f1 Ferrari.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mercedes','Grupo que junta pessoas com interesse na equipa de f1 Mercedes.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo RedBull','Grupo que junta pessoas com interesse na equipa de f1 RedBull.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mclaren ','Grupo que junta pessoas com interesse na equipa de f1 Mclaren.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alpine','Grupo que junta pessoas com interesse na equipa de f1 Alpine.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alfa Romeo','Grupo que junta pessoas com interesse na equipa de f1 Alfa Romeo.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Aston Martin','Grupo que junta pessoas com interesse na equipa de f1 Aston Martin.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Haas','Grupo que junta pessoas com interesse na equipa de f1 Haas.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alphatauri','Grupo que junta pessoas com interesse na equipa de f1 Alphatauri.','0');
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Williams','Grupo que junta pessoas com interesse na equipa de f1 Williams.','0');

insert into usergroup (ug_use_id, ug_gru_id) values (1,1); -- Gustavo Costa - Grupo Ferrari
insert into usergroup (ug_use_id, ug_gru_id) values (2,6); -- Francisco Andrade - Grupo Alfa Romeo
insert into usergroup (ug_use_id, ug_gru_id) values (3,8); -- Joana Pinto - Alpine
insert into usergroup (ug_use_id, ug_gru_id) values (4,1); -- Manuel Gusmão - Ferrari
insert into usergroup (ug_use_id, ug_gru_id) values (5,6); -- Pablo Diaz - Alfa Romeo
insert into usergroup (ug_use_id, ug_gru_id) values (6,5); -- Maria Pereira - Alpine
insert into usergroup (ug_use_id, ug_gru_id) values (7,5); -- José Almeida - Alpine
insert into usergroup (ug_use_id, ug_gru_id) values (8,3); -- Frederico Pinheiro - RedBull
insert into usergroup (ug_use_id, ug_gru_id) values (9,3); -- Júlia Pinheiro - RedBull

insert into event (eve_ug_id, eve_dt, eve_ts, eve_evt_id) values (1, to_date('2022.09.22','YYYY.MM.DD'), , ); --Evento no grupo da ferrari.

insert into message (mes_ug_id, mes_ts, mes_text) values (1, ,'Alguém quer almoçar para depois ir ver a corrida?'); -- Manuel pergunta no grupo.

insert into comment (comm_mes_id, comm_ug_id, comm_mes_text) values (1,1,'Eu quero! Queres combinar algum sitio para almoçar?'); -- Gustavo responde à mensagem do Manuel. (No grupo da Ferrari).

insert into status (st_name) values ('Vai ao evento.'); 
insert into status (st_name) values ('Não vai ao evento.');
insert into status (st_name) values ('Cancelou.');

insert into usergroupevent (uge_ug_id, uge_eve_id) values (4,1); --Manuel Gusmão criou o primeiro evento do grupo da Ferrari

insert into eveonline (eve_on_name, eve_on_desc, eve_on_dt, eve_on_eve_id) values ('WatchParty!', 'WatchParty no grupo de discord! Link do grupo: ',to_date('2022.09.22','YYYY.MM.DD'), );

insert into evefisico (eve_phy_name, eve_phy_desc, eve_phy_dt, eve_phy_eve_id) values ('Assistir a corrida em Santos!', 'Assistir a corrida em Santos que começa às 15 horas. Vamos nos encontrar ao pé da Taska da Txika às 14:45h!', to_date('2022.07.06','YYYY.MM.DD'),1);

insert into localizacao (local_name, local_point) values ('Santos', 38.707093, -9.152712); -- utilizando a variavel point do PostGIS.
insert into localizacao (local_name, local_point) values ('Belém', 38.697414, -9.199386);
insert into localizacao (local_name, local_point) values ('Algés', 38.700895, -9.230866);
insert into localizacao (local_name, local_point) values ('Oeiras', 38.696764, -9.314625); 
insert into localizacao (local_name, local_point) values ('Caxias', 38.702858, -9.269295);

insert into evephylocat (eve_phylocat_evephy_id, eve_phylocat_locat_id) values ();

-- tipo de evento : enumeracao?

insert into ugestado (ugest_uge_id, ugest_est_id) values ();

insert into follows (fol_use_idA, fol_use_idB) values (1,4); -- Gustavo segue o Manuel.
insert into follows (fol_use_idA, fol_use_idB) values (4,1); -- Manuel segue o Gustavo.
insert into follows (fol_use_idA, fol_use_idB) values (3,6); -- Joana segue a Maria.
insert into follows (fol_use_idA, fol_use_idB) values (6,3); -- Maria segue a Joana.
