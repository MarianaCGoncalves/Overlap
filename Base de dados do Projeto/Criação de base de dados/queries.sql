select use_name from users, tags, usertag where tag_id = tu_tag_id and tu_use_id =use_id and tag_id=1 -- Mostra os users que têm a tag da Ferrari. 

R:  "Gustavo Costa"
    "Manuel Gusmão"

select use_name from users where use_name like 'M%' -- Users cujo os nomes começam por M.

R:  "Manuel Gusmão"
    "Maria Pereira"

select gru_name, gru_at from grupos --Ver a atividade de todos os grupos.

R:  "Grupo Ferrari"	true
    "Grupo Mercedes"	true
    "Grupo RedBull"	true
    "Grupo Mclaren "	true
    "Grupo Alpine"	true
    "Grupo Alfa Romeo"	true
    "Grupo Aston Martin"	true
    "Grupo Haas"	true
    "Grupo Alphatauri"	true
    "Grupo Williams"	true

select eve_name, locat_name from eventos, evefisico, evephylocat, localizacao where eve_phy_id= eve_phylocat_evephy_id and eve_phylocat_locat_id = locat_id
and locat_id = 1 and eve_id = eve_phy_eve_id -- Nome do evento fisico na localização de Santos.

R:  "Assistir a corrida em Santos!"	"Santos"

select * from eventos, evefisico where eve_id= eve_phy_eve_id -- Obter apenas os eventos fisicos.

R:    1	"Assistir a corrida em Santos!"	4	"Assistir a corrida em Santos que começa às 15 horas. Vamos nos encontrar ao pé da Taska da Txika às 14:45h!"	"2022-09-10 13:23:25"	3	1	1
      3	"Beber um café"	5	"Vamos beber um café no Patio café, para falar sobre as estrategias da Alpine."	"2022-09-25 14:30:25"	2	2	5

select * from eventos, eveonline where eve_id= eve_on_eve_id -- Obter apenas os eventos online.

R:    2	"WatchParty"	6	"WatchParty no grupo de discord! Link do grupo:"	"2022-10-10 14:10:25"	3	1	6	"2022-10-10"


