create table tags (
    tag_id SERIAL not null,
    tag_name VARCHAR(40) not null,
    primary key (tag_id)
);
--1 para zero = um para muitos a key fica do lado que nao é sempre

create table tu (
    tu_id SERIAL not null,
    tu_tag_id int not null,
    tu_use_id int not null,
    primary key (tu_id)
);

create table tg (
    tg_id SERIAL not null,
    tg_tag_id int not null,
    tg_gru_id int not null,
    primary key (tg_id)
);

create table users (
    use_id SERIAL not null,
    use_name VARCHAR(40) not null, 
    use_acc_age date not null,
    use_password VARCHAR(30) not null, 
    use_mail VARCHAR(50) not null, 
    primary key (use_id)
);

create table grupos(
    gru_id SERIAL not null,
    gru_use_id int not null, --moderador
    gru_name VARCHAR(60) not null,
    gru_desc VARCHAR(120),
    gru_create_age date not null,
    gru_last_post_age TIMESTAMP,
    gru_at boolean not null, /* 0 - ativo | 1 - inativo */
    primary key (gru_id)
);

create table ug(
    ug_id SERIAL not null,
    ug_use_id int not null,
    ug_gru_id int not null,
    primary key (ug_id)
);

create table mensagem(
    mes_id SERIAL not null,
    mes_ug_id int not null,
    mes_ts TIMESTAMP not null,
    mes_text text,
    primary key (mes_id)
);

create table eventos(
    eve_id SERIAL not null,
    eve_ug_id int not null,
    eve_dt TIME not null,
    eve_ts TIMESTAMP not null,
    eve_evt_id int not null,
    primary key (eve_id)
);

create table tipoevento(
    evt_id SERIAL not null,
    evt_name VARCHAR(40),
    primary key (evt_id)
);

create table uge (
    uge_id SERIAL not null,
    uge_ug_id int not null,
    uge_eve_id int not null,
    primary key (uge_id)
);

create table eveonline (
    eve_on_id SERIAL not null,
    eve_on_name VARCHAR(40) not null,
    eve_on_desc VARCHAR(80),
    eve_on_dt date not null,
    eve_on_eve_id int not null,
    primary key (eve_on_id)
);

create table evefisico (
    eve_fi_id SERIAL not null,
    eve_fi_name VARCHAR(60) not null,
    eve_fi_desc VARCHAR(80), 
    eve_fi_dt date not null,
    eve_fi_eve_id int not null,
    primary key (eve_fi_id)
); 

create table localizacao (
    local_id SERIAL not null,
    local_name VARCHAR(20) not null,
    local_lon  VARCHAR(60) not null, --Double not char
    local_lat VARCHAR(60) not null,  --Double not char
    primary key (local_id)

);

create table evefilocal (
    eve_filocal_id SERIAL not null,
    eve_filocal_evefi_id int not null,
    eve_filocal_local_id int not null,
    primary key (eve_filocal_id)
);

create table estado (
    est_id SERIAL not null,
    est_name VARCHAR(1), -- | cancelou - C | vai - V | vai mas atrasado - v | não vai - N |
    primary key (est_id)
);

create table ugestado (
    ugest_id SERIAL not null,
    ugest_uge_id int not null,
    ugest_est_id int not null,
    primary key (ugest_id)
);

create table comment (
    comm_id SERIAL not null,
    comm_mes_id int not null,
    comm_ug_id int not null,
    comm_mes_text text,
    primary key (comm_id)
); 

create table follows (
    fol_id SERIAL not null,
    fol_use_idA int not null,
    fol_use_idB int not null,
    primary key (fol_id)
);

alter table tu
add constraint tu_fk_tags
foreign key (tu_tag_id) references tags(tag_id)      /* tu (muitos para um) tags */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table tu
add constraint tu_fk_users
foreign key (tu_use_id) references users(use_id)    /* tu (muitos para um) users */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table tg
add constraint tg_fk_tags
foreign key (tg_tag_id) references tags(tag_id)      /* tg (muitos para um) tags */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table tg
add constraint tg_fk_grupos
foreign key (tg_gru_id) references grupos(gru_id)   /* tg (muitos para um) grupos */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table grupos 
add constraint grupos_fk_users
foreign key (gru_use_id) references users(use_id)   /* grupos (muitos para um) users */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table ug 
add constraint ug_fk_grupos
foreign key (ug_gru_id) references grupos(gru_id)   /* ug (muitos para um) grupos */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table ug
add constraint ug_fk_users
foreign key (ug_use_id) references users(use_id)    /* ug (muitos para um) users */
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table uge 
add constraint uge_fk_ug
foreign key (uge_ug_id) references ug(ug_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table uge 
add constraint uge_fk_eventos
foreign key (uge_eve_id) references eventos(eve_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table eventos
add constraint eventos_fk_ug
foreign key (eve_ug_id) references ug(ug_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table eventos 
add constraint eventos_fk_tipoevento
foreign key (eve_evt_id) references tipoevento(evt_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table ugestado
add constraint ugestado_fk_uge
foreign key (ugest_uge_id) references uge(uge_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table ugestado 
add constraint ugestado_fk_estado
foreign key (ugest_est_id) references estado(est_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table comment 
add constraint comment_fk_ug
foreign key (comm_ug_id) references ug(ug_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table comment 
add constraint comment_fk_mensagem
foreign key (comm_mes_id) references mensagem(mes_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table mensagem
add constraint mensagem_fk_ug
foreign key (mes_ug_id) references ug(ug_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table follows
add constraint follows_fk_users 
foreign key (fol_use_idA) references users(use_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table follows
add constraint follows_fk_users 
foreign key (fol_use_idB) references users(use_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table eveonline
add constraint eveonline_fk_eventos
foreign key (eve_on_eve_id) references eventos(eve_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table evefisico
add constraint evefisico_fk_eventos
foreign key (eve_fi_eve_id) references eventos(eve_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table evefilocal
add constraint evefilocal_fks_evefisico
foreign key (eve_filocal_evefi_id) references (eve_fi_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table evefilocal
add constraint evefilocal_fks_localizacao
foreign key (eve_filocal_local_id) references (local_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;