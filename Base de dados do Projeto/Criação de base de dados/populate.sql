insert into tags (tag_name) values ('Ferrari'); -- Ferrari será a tag 1
insert into tags (tag_name) values ('Mercedes'); -- Mercedes será a tag 2
insert into tags (tag_name) values ('RedBull'); -- RedBull será a tag  3 
insert into tags (tag_name) values ('Mclaren'); -- Mclaren será a tag 4
insert into tags (tag_name) values ('Alpine'); -- Alpine será a tag 5
insert into tags (tag_name) values ('Alfa Romeo'); -- Alfa Romeo será a tag 6
insert into tags (tag_name) values ('Aston Martin'); -- Aston Martin será a tag 7
insert into tags (tag_name) values ('Haas'); -- Haas será a tag 8
insert into tags (tag_name) values ('Alphatauri'); -- Alphatauri será a tag 9
insert into tags (tag_name) values ('Williams'); -- Williams será a tag 10

insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Gustavo Costa', to_date('2022.05.06','YYYY.MM.DD'),'123','gcosta@gmail.com'); -- Criação do utilizador Gustavo Costa.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Joana Pinto', to_date('2022.05.07','YYYY.MM.DD'),'123','joanapinto@gmail.com'); -- Criação do utilizador Joana Pinto.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Francisco Andrade', to_date('2022.01.10','YYYY.MM.DD'),'123','frandrade@gmail.com'); -- Criação do utilizador Francisco Andrade.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Manuel Gusmão', to_date('2022.02.26','YYYY.MM.DD'),'123','MG@gmail.com'); -- Criação do utilizador Manuel Gusmão.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Pablo Diaz', to_date('2022.07.06','YYYY.MM.DD'),'123','PDiaz@gmail.com'); -- Criação do utilizador Pablo Diaz.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Maria Pereira', to_date('2022.10.06','YYYY.MM.DD'),'123','maripe@gmail.com'); -- Criação do utilizador Maria Pereira.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('José Almeida', to_date('2022.05.06','YYYY.MM.DD'),'123','JAlmeida@gmail.com'); -- Criação do utilizador José Almeida.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Frederico Pinheiro', to_date('2022.09.05','YYYY.MM.DD'),'123','pinheiro@gmail.com'); -- Criação do utilizador Frederico Pinheiro.
insert into users (use_name, use_acc_age, use_pass, use_mail) values ('Júlia Pinheiro', to_date('2022.08.03','YYYY.MM.DD'),'123','juliapinheiro@gmail.com'); -- Criação do utilizador Júlia Pinheiro.

insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Ferrari','Grupo que junta pessoas com interesse na equipa de f1 Ferrari.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Ferrari.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mercedes','Grupo que junta pessoas com interesse na equipa de f1 Mercedes.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Mercedes.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo RedBull','Grupo que junta pessoas com interesse na equipa de f1 RedBull.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo RedBull.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Mclaren ','Grupo que junta pessoas com interesse na equipa de f1 Mclaren.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Mclaren.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alpine','Grupo que junta pessoas com interesse na equipa de f1 Alpine.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Alpine.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alfa Romeo','Grupo que junta pessoas com interesse na equipa de f1 Alfa Romeo.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Alfa Romeo.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Aston Martin','Grupo que junta pessoas com interesse na equipa de f1 Aston Martin.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Aston Martin.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Haas','Grupo que junta pessoas com interesse na equipa de f1 Haas.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Haas.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Alphatauri','Grupo que junta pessoas com interesse na equipa de f1 Alphatauri.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Alphatauri.
insert into grupos (gru_name, gru_desc, gru_create_age, gru_last_post_age, gru_at) values ('Grupo Williams','Grupo que junta pessoas com interesse na equipa de f1 Williams.',to_date('2022.09.9','YYYY.MM.DD'),TO_TIMESTAMP ('2022-09-10 09:30:25', 'YYYY-MM-DD HH24:MI:SS'),TRUE); -- Criação do grupo Williams.

insert into usertag (tu_tag_id, tu_use_id) values (1,1); -- Gustavo Costa - Ferrari
insert into usertag (tu_tag_id, tu_use_id) values (6,3); -- Francisco Andrade - Alfa Romeo
insert into usertag (tu_tag_id, tu_use_id) values (8,2); -- Joana Pinto - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (1,4); -- Manuel Gusmão - Ferrari
insert into usertag (tu_tag_id, tu_use_id) values (6,5); -- Pablo Diaz - Alfa Romeo
insert into usertag (tu_tag_id, tu_use_id) values (5,6); -- Maria Pereira - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (5,7); -- José Almeida - Alpine
insert into usertag (tu_tag_id, tu_use_id) values (3,8); -- Frederico Pinheiro - RedBull
insert into usertag (tu_tag_id, tu_use_id) values (3,9); -- Júlia Pinheiro - RedBull

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

insert into usergroup (ug_use_id, ug_gru_id) values (1,1); -- Gustavo Costa - Grupo Ferrari.
insert into usergroup (ug_use_id, ug_gru_id) values (2,6); -- Francisco Andrade - Grupo Alfa Romeo.
insert into usergroup (ug_use_id, ug_gru_id) values (3,8); -- Joana Pinto - Alpine.
insert into usergroup (ug_use_id, ug_gru_id) values (4,1); -- Manuel Gusmão - Ferrari.
insert into usergroup (ug_use_id, ug_gru_id) values (5,6); -- Pablo Diaz - Alfa Romeo.
insert into usergroup (ug_use_id, ug_gru_id) values (6,5); -- Maria Pereira - Alpine.
insert into usergroup (ug_use_id, ug_gru_id) values (7,5); -- José Almeida - Alpine.
insert into usergroup (ug_use_id, ug_gru_id) values (8,3); -- Frederico Pinheiro - RedBull.
insert into usergroup (ug_use_id, ug_gru_id) values (9,3); -- Júlia Pinheiro - RedBull.

insert into mensagem (mes_ug_id, mes_date, mes_text, mes_use_id) values (1, TO_TIMESTAMP ('2022-09-22 14:10:25', 'YYYY-MM-DD HH24:MI:SS'),'Alguém quer almoçar para depois ir ver a corrida?', 4); -- Manuel pergunta no grupo.

insert into comment (comm_mes_id, comm_ug_id, comm_mes_text) values (1,1,'Eu quero! Queres combinar algum sitio para almoçar?'); -- Gustavo responde à mensagem do Manuel. (No grupo da Ferrari).

insert into eventos (eve_ug_id, eve_name, eve_desc, eve_evt_id, eve_ts) values (4, 'Assistir a corrida em Santos!', 'Assistir a corrida em Santos que começa às 15 horas. Vamos nos encontrar ao pé da Taska da Txika às 14:45h!',3, TO_TIMESTAMP ('2022-09-10 13:23:25', 'YYYY-MM-DD HH24:MI:SS')); --Evento no grupo da Ferrari criado pelo Manuel Gusmão.
insert into eventos (eve_ug_id, eve_name, eve_desc, eve_evt_id, eve_ts) values (6,'WatchParty','WatchParty no grupo de discord! Link do grupo:',3, TO_TIMESTAMP ('2022-10-10 14:10:25', 'YYYY-MM-DD HH24:MI:SS')); --Evento no grupo da Alfa Romeo criado pelo Pablo Diaz. )
insert into eventos (eve_ug_id, eve_name, eve_desc, eve_evt_id, eve_ts) values (5,'Beber um café', 'Vamos beber um café no Patio café, para falar sobre as estrategias da Alpine.',2, TO_TIMESTAMP ('2022-09-25 14:30:25', 'YYYY-MM-DD HH24:MI:SS')); --Evento no grupo da Alpine criado pelo José Almeida )

insert into tipoevento (evt_name) values ('WatchParty Online');
insert into tipoevento (evt_name) values ('WatchParty');
insert into tipoevento (evt_name) values ('Encontro Social');

insert into eveonline (eve_on_ug_id, eve_on_dt, eve_on_eve_id) values (6,to_date('2022.10.10','YYYY.MM.DD'),2); -- Evento Online da Alfa Romeo.

insert into evefisico (eve_phy_ug_id, eve_phy_dt, eve_phy_eve_id) values (1, to_date('2022.09.22','YYYY.MM.DD'),1); --Evento fisico do grupo Ferrari.
insert into evefisico (eve_phy_ug_id, eve_phy_dt, eve_phy_eve_id) values (5, to_date('2022.07.25','YYYY.MM.DD'),3); --Evento fisico do grupo Alpine.

-- utilizando a variavel point do PostGIS.
insert into localizacao (locat_name, locat_point) values ('Santos', Point(38.707093, -9.152712)); -- Localização Santos.
insert into localizacao (locat_name, locat_point) values ('Belém', Point(38.697414, -9.199386));-- Localização Belém.
insert into localizacao (locat_name, locat_point) values ('Algés', Point(38.700895, -9.230866));-- Localização Algés.
insert into localizacao (locat_name, locat_point) values ('Oeiras', Point(38.696764, -9.314625)); -- Localização Oeiras.
insert into localizacao (locat_name, locat_point) values ('Caxias', Point(38.702858, -9.269295));-- Localização Caxias.

insert into usergroupevent (uge_ug_id, uge_eve_id) values (4,1); -- Manuel Gusmão participa no evento da Ferrari.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (1,1); -- Gustavo Costa participa no evento da Ferrari.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (7,2); -- José Almeida participa no evento do grupo da Alpine.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (6,2); -- Maria Pereira participa no evento do grupo da Alpine.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (3,2); -- Joana Pinto participa no evento do grupo da Alpine.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (5,3); -- Pablo Diaz participa no evento do grupo da Alfa Romeo.
insert into usergroupevent (uge_ug_id, uge_eve_id) values (2,3); -- Francisco Andrade participa no evento do grupo da Alfa Romeo.

insert into ugestatus (ugest_uge_id, ugest_st_id) values (1,1); -- Manuel Gusmão vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (2,1); -- Gustavo Costa vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (3,1); -- José Almeida vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (4,1); -- Maria Pereira vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (5,1); -- Joana Pinto vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (6,1); -- Pablo Diaz vai ao evento.
insert into ugestatus (ugest_uge_id, ugest_st_id) values (7,1); -- Francisco Andrade vai ao evento.

insert into status (st_name) values ('V'); -- Vai ao evento.
insert into status (st_name) values ('N'); -- Não vai ao evento.
insert into status (st_name) values ('C'); -- Cancelou.

insert into evephylocat (eve_phylocat_evephy_id, eve_phylocat_locat_id) values (1,1); --Primeiro evento fisico da ferrari está localizado em Santos.
insert into evephylocat (eve_phylocat_evephy_id, eve_phylocat_locat_id) values (2,3); --Primeiro evento fisico da Alpine está localizado em Algés.

insert into follows (fol_use_id_a, fol_use_id_b) values (1,4); -- Gustavo segue o Manuel.
insert into follows (fol_use_id_a, fol_use_id_b) values (4,1); -- Manuel segue o Gustavo.
insert into follows (fol_use_id_a, fol_use_id_b) values (3,6); -- Joana segue a Maria.
insert into follows (fol_use_id_a, fol_use_id_b) values (6,3); -- Maria segue a Joana.
