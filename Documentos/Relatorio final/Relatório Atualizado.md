# Overlap

### Membros deste Repositório:
* Duarte Cavaleiro	20211026 
* Mariana Gonçalves	20210539
* Miguel Bernardo	20211066


## 1-Descrição da app

### 1.1-Breve Descrição
Overlap é uma aplicação sobre Fórmula 1 onde os utilizadores poderão encontrar-se com outros para falarem sobre Fórmula 1 e ver as corridas de F1.

### 1.2-Objetivos
A ideia da aplicação surgiu devido ao aumento da popularidade de F1 e como ainda não há uma aplicação para encontrar pessoas que também gostam de F1, Overlap foi criada para responder a esta necessidade.

### 1.3-Funcionalidades
A aplicação Overlap consiste em muitas funções sendo a principal e mais importante, a opção de conseguir juntar-se a um grupo da sua equipa favorita, ou de um piloto favorito, podendo assim comunicar-se com outros fãs e partilhar as suas opiniões. Outra função presente na nossa aplicação é a disponibilidade das pessoas presentes no grupo conseguirem-se encontrar num local para ver as corridas ou até mesmo só para partilharem as suas opiniões pessoalmente.

### 1.4-Público Alvo
A nossa aplicação tem como público alvo pessoas entre os 18 e 50 anos de idade que tenham interesse em Fórmula 1.


## 2-Apps semelhantes

Como foi previamente referido, não existem aplicações daí o desenvolvimento da nossa.
	Algumas aplicações de Fórmula 1 que existem são as aplicações oficiais da FIA (Federação Internacional do Automóvel)
A aplicação mais importante e mais conhecida é a:

* Formula 1:  Onde o utilizador tem acesso a notícias sobre Fórmula 1, as corridas que irão decorrer tal como um Live Feed da corrida a decorrer e apresenta também uma página onde demonstra os pontos que cada piloto e equipa têm.


## 3-Guião
Após entrar na aplicação, o utilizador vai encontrar uma caixa de texto onde irá  inserir o nome, email e palavra-passe para a sua conta, em seguida o utilizador poderá escolher os desportos que deseja seguir e as equipas favoritas.
Após o registo na aplicação o utilizador poderá ver a Home Page onde se encontram os grupos  aos quais se juntou, caso o utilizador não esteja em nenhum grupo, serão sugeridos grupos onde pessoas com gostos semelhantes se encontram.
O utilizador encontrará três botões na parte inferior do ecrã, uma lupa, uma casa e um sinal GPS no qual poderá visualizar os eventos que estão a decorrer perto da sua localização.
Os eventos são criados nos grupos, nos quais os membros definem uma localização para o decorrer do mesmo. 
Não será preciso um método de verificação que pertence ao grupo, pois o objetivo da aplicação é encontrar pessoas com o mesmo gosto desportivo, mesmo que a pessoa não esteja a utilizar o Overlap.

### Breve introdução das personas:

* Gustavo Costa, 40 anos, é da Ferrari e da Red Bull e trabalha no bar SPOT no Bairro Alto. 
* Manuel Gusmão, 24 anos, e torce também pela Ferrari e trabalha como sapateiro.
* Joana Pinto, 19 anos, gosta da Alpine e está a tirar um curso de fotografia no IADE.
* Manuel Gusmão, 24 anos, e torce também pela Ferrari e trabalha como sapateiro.
* Pablo Diaz, 29 anos natural de Sevilha, passa bastante tempo em Portugal devido ao trabalho. Gosta de assistir corridas de F1 casualmente, não tem uma equipa favorita.
* Maria Pereira, 27 anos, trabalha na UberEats. Torce pela Alpine.
* José Almeida, 25 anos, está a treinar para ser piloto de avião. Adora a Alpine.
* Frederico Pinheiro, 38 anos, trabalha nas Finanças. A Red Bull e a Ferrari são as suas equipas favoritas. 
* Júlia Pinheiro, 44 anos, apresentadora na XIC. Seguiu os passos do marido e também torce pela Red Bull e Ferrari.

Um domingo, o Gustavo Costa estava a sair do seu turno da manhã do bar SPOT no Bairro Alto, mas não queria nada perder a corrida nem vê-la sozinho. A corrida começa às 15h em Portugal, então o Gustavo instala o Overlap em busca de companhia para ver a corrida. Faz o registo com o seu email, nome e palavra-passe. Após o registo é-lhe apresentada uma tela para selecionar a sua equipa favorita, na qual o Gustavo seleciona a Ferrari e Red Bull, e a Overlap recomenda-lhe grupos que têm como foco principal a equipa da Ferrari. Ao entrar num grupo da Ferrari, encontra Manuel Gusmão, que também está interessado em ver a corrida com alguém e criou um “evento” marcado para às 14:45h relativamente perto de Santos. Vendo o evento do Manuel, o Gustavo interessa-se e decide participar no evento. Manda mensagem no post do Manuel, a perguntar se poderia ir almoçar com ele enquanto via a corrida, combinam o ponto de encontro num restaurante em Santos. No fim de assistirem a corrida, eles seguem o perfil um do outro. 

Joana Pinto saiu da aula Edição e Design às 17h, e ao sair da faculdade encontrou os habituais trabalhadores da UberEats e ao passar por eles, ouviu mencionarem a última corrida de fórmula 1. Joana não conteve o entusiasmo e mencionou o gosto pela equipa Alpine. Entre os funcionários da UberEats estava Maria Pereira, torcedora também da Alpine. Maria perguntou à Joana se estaria interessada em participar num evento organizado pelo José Almeida na Overlap de amanhã, exclusivo para torcedores da Alpine. Joana desconhecia a aplicação Overlap, e procedeu à criação da conta. Num clique junta-se ao grupo da Alpine, e partilha interesse em participar no evento do dia seguinte. No dia seguinte Joana e Maria destinam-se a Algés, a localização onde marcaram o evento. Encontram-se com o José e os outros e decidem ir ao café mais próximo falar das estratégias da Alpine para as próximas corridas.


## 4-Solução
### 4.1- Descrição genérica da solução implementada
Devido ao objetivo da nossa aplicação de ajudar os seus utilizadores a encontrarem outras pessoas com o mesmo de Fórmula 1, a nossa aplicação utiliza geolocalização para habilitar os utilizadores a encontrarem-se com outros para realizarem os seus eventos relacionados com Fórmula 1.
 
### 4.2-Enquadramento das Unidades Curriculares
Para a realização da aplicação Overlap, será necessário enquadrar as diversas UCs. Necessitamos de uma base de dados para gerir os dados dos utilizadores (nome, email, idade) assim como armazenar dados das equipas. Uma interface para o utilizador interagir com a aplicação, feita no Android Studio, com todas as funcionalidades necessárias para satisfazer o usuário, por exemplo escolher a equipa favorita, juntar-se a grupos do seu interesse, alterar o seu perfil. Consequentemente para estabelecer uma comunicação entre estes dois (base de dados e interface da app), precisamos de uma API REST, pois é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona. Por fim, a unidade curricular Competências Comunicacionais terá um grande impacto nas apresentações que haverá ao longo do semestre.

### 4.3-Requisitos técnicos
Java: usado para desenvolver a REST API e a aplicação móvel.

SQLpostgres: para gerir os dados dos utilizadores.

Modulação de Dados: Para criar o diagrama de entidade-relação do Overlap.

Java teórico: Criar o Diagrama de Classe do Overlap.


### 4.4-Arquitetura da solução
Overlap estará dividida em três partes: 

Base de Dados, onde serão armazenados os dados dos utilizadores, assim como dos clubes desportivos.
API, é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona.
Aplicação Móvel, utilizador vai estar em contato direto com a interface da aplicação, onde estarão presentes as funcionalidades como por exemplo: login, entrar num grupo, marcar um evento(…). 
A API vai permitir a comunicação entre a base de dados e a aplicação móvel.

### 4.5-Tecnologias a utilizar

* Spring Boot: É um framework Open Source que surgiu com o intuito de facilitar as configurações iniciais de um projeto. 

* VS Code: Visual Studio Code é um editor de código desenvolvido pela Microsoft.

* Figma: Plataforma para construção de interfaces e protótipos. Utilizado para realizar MockUps.

* PgAdmin: Ferramenta de gestão para o PostgreSQL.

* Android Studio: Editor de código mas mais focado em desenvolvimento de Android.

* RetroFit2: Permite criar uma ligação mais facilitada Web Service e Android.

* Swagger: É um cliente HTTP seguro, que permite visualizar todos os endpoints disponíveis na API.

* Click Up: Plataforma de gestão e planeamento de projetos.

## 5-Planeamento e calendarização

![image](https://user-images.githubusercontent.com/99985414/212424798-78753aae-7718-4f8a-a409-7623d193d733.png)

Gráfico de Gantt do progresso do Overlap (através do ClickUp).

## 6-Modelo do Domínio
![Modelo de Dominio](https://user-images.githubusercontent.com/99985414/197419185-7647822e-1095-434f-9ac7-930511062fed.png)

## 7- Diagrama de Classes
![BASE DE DADOS _ POO-POO ATUALIZADO drawio](https://user-images.githubusercontent.com/99985414/205518885-5a9fa97c-343e-4d04-8c1c-d521cdae2d0c.png)

## 8- Dicionário de Dados e Guião de Dados (Base de Dados) e Modelo ER
	
### Dicionário de Dados
### Users
Tabela com dados dos users.

| Users | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|use_id|     int   |PK 		| -----|
|use_name|     String   |----- 		| -----|
|use_acc_age|     date   |----- 		| -----|
|use_pass|     String   |----- 		| -----|
|use_mail|     String   |----- 		| -----|

Comentários:

use_acc_age: Data de criação da conta do utilizador.

use_pass: Palavra-passe do utilizador.

### Tags
Tabela das tags consiste em associar cada equipa a uma tag.

| Tags | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|tag_id|     int   |PK 		| -----|
|tag_name|     String   |----- 		| -----|

### TagUser
Tabela de ligação de tags com usuários. Cada usuário pode ter várias tags.
| TagUser | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|tu_id|     int   |PK 		| -----|
|tu_tag_id|     int   |FK 		| -----|
|tu_use_id|     int   |FK		| -----|

Comentários:

tu_tag_id: Atributos de ligação para tabelas TagUser e Tags.

tu_use_id: Atributos de ligação para tabelas TagUser e User.

### TagGroup
Tabela de ligação de tags com grupos. Cada grupo pode ter várias tags.

| TagGroup | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|tg_id|     int   |PK 		| -----|
|tg_tag_id|     int   |FK	| -----|
|tg_use_id|     int   |FK 		| -----|

Comentários: 

tg_tag_id: Atributos de ligação para tabelas TagGroup e Tags.

tg_gru_id: Atributos de ligação para tabelas TagGroup e Groups.

### Grupos
Tabela com os dados dos grupos.

| Grupos | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|gru_id|     int   |PK 		| -----|
|gru_name|  String     |	------	| -----|
|gru_desc|   String     | -----		| -----|
|gru_create_age|Date        |	-----	| -----|
|gru_last_post_age|  Timestamp  |----- 		| Para determinar se o grupo está ativo ou inativo|
|gru_at|    boolean   |	-----| 0: ativo/ 1: inativo|
|gru_use_id| int       | 	FK	| Criador do grupo |

Comentários:

gru_desc: Descrição do grupo.

gru_create_age: Data de criação do grupo.

gru_last_post_age: Timestamp a última mensagem que foi enviada no grupo.

gru_at: Atividade do grupo.

gru_use_id: Atributos de ligação para tabelas Groups e Users. (Utilizador pode criar grupos).

### UserGroup
Tabela de ligação de usuário com grupos. Representa um usuário num certo grupo.

| UserGroup | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|ug_id|     int   |PK 		| -----|
|ug_use_id|     int   |FK	| -----|
|ug_gru_id|     int   |FK 		| -----|

Comentários:

ug_use_id: Atributos de ligação para tabelas UserGroup e Users.

ug_gru_id: Atributos de ligação para tabelas UserGroup e Users.

### Mensagem
Tabela com os dados das mensagens nos grupos.

| Mensagem | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|mes_id|     int   |PK 		| -----|
|mes_ug_id|     int   |FK		| -----|
|mes_date|     Timestamp   |----- 		| -----|
|mes_text|     String   |----- 		| -----|

Comentários:

mes_ug_id: Atributos de ligação para tabelas Message e UserGroup.

mes_use_id: Atributos de ligação para tabelas Message e User.

mes_text: Conteúdo da mensagem.

mes_date: Timestamp da mensagem.

### Eventos
Tabela com os dados dos eventos. 

| Events | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|eve_id|     int   |PK 		| -----|
|eve_ug_id|     int   |FK		| -----|
|eve_name|     String   |----- 		| -----|
|eve_date|     Date   |----- 		| -----|
|eve_desc|     String   |----- 		| -----|

Comentários:

eve_ug_id: Atributos de ligação para tabelas Events e UserGroup.

eve_ts: Data em que será o evento.

eve_desc: Descrição do evento.

eve_dt: Data de criação do evento

### UserGroupsEvent
Tabela de ligação de usuário com grupos e com eventos. Representa um usuário num grupo num certo evento.

| UGE | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|uge_id|     int   |PK 		| -----|
|uge_ug_id|     int   |FK	| -----|
|uge_eve_id|     int   |FK 		| -----|

Comentários:

uge_ug_id: Atributos de ligação para tabelas UserGroupsEvent e UserGroup.

uge_eve_id: Atributos de ligação para tabelas UserGroupsEvent e Events.

### Online Events
Tabela com os dados do evento online.

| Online Events | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|eve_on_id|     int   |PK 		| -----|
|eve_on_ug_id|     int   |FK		| -----|
|eve_on_dt|     date   |----- 		| -----|
|eve_on_eve_id|     int   |FK		| -----|

Comentários:

eve_on_ug_id: Atributos de ligação para tabelas Online Events e UserGroup.

eve_on_eve_id: Atributos de ligação para tabelas Online Events e Eventos.

### Physical Events
Tabela com os dados do evento físico.

| Physical Events | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|eve_phy_id|     int   |PK 		| -----|
|eve_phy_ug_id|     int   |FK		| -----|
|eve_phy_dt|     date   |----- 		| -----|
|eve_phy_eve_id|     int   |FK		| -----|

Comentários:

eve_phy_ug_id: Atributos de ligação para tabelas Physical Events e UserGroup.

eve_phy_evt_id: Atributos de ligação para tabelas Physical Events e Eventos.

### Location
Tabela com os dados da localização.

| Location | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|locat_id|     int   |PK 		| -----|
|locat_name|     String   |------	| -----|
|locat_point|     Point   |----- 		| -----|

Comentários:

locat_point: Coordenadas da localização. (PostGIS utilizado).

### Physical Event Location
Tabela de ligação de eventos fisicos com a localização. Cada evento físico vai ter uma certa localização.

| Physical Event Location | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|eve_phylo_id|     int   |PK 		| -----|
|eve_phylo_eve_phy_id|     int   |FK	| -----|
|eve_phylo_locat_id|     int   | FK	| -----|

Comentários:

eve_phylo_eve_phy_id: Atributos de ligação para tabelas PhysicalEventLocation e Physical Events.

eve_phylo_locat_id: Atributos de ligação para tabelas PhysicalEventLocation e Location.

### Status
Os usuários que vão ao evento vão poder representar o seu estado em relação ao evento. Exemplo: O usuário diz que vai chegar atrasado ao evento. 

| Status | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|st_id|     int   |PK 		| -----|
|st_name|     String   |------	| -----|

### UserGroupsEventStatus
Tabela de ligação de usuário com grupos, eventos e o estado do usuário.

| UserGroupsEventStatus | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|ugest_id|     int   |PK 		| -----|
|ugest_uge_id|     int   |FK	| -----|
|ugest_st_id|     int   | FK	| -----|

Comentários:

ugest_uge_id: Atributos de ligação para tabelas UserGroupsEventStatus e UserGroupsEvent.

ugest_st_id: Atributos de ligação para tabelas UserGroupsEventStatus e Status. 

### Comments
Tabela com os dados dos comentários das mensagens.

| Comment | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|comm_id|     int   |PK 		| -----|
|comm_mes_id|     int   |FK		| -----|
|comm_ug_id|     int   |FK 		| -----|
|comm_mes_text|     String   |----- 		| -----|

Comentários:

comm_mes_id: Atributos de ligação para tabelas Comments e Message. 

comm_ug_id: Atributos de ligação para tabelas Comments e UserGroup. 

### Follows 
Tabela para associar users a outros users.

| Follows | DataType | Restrições | Observações |
| :---: |  :---:   |    :---:   |    :---:    |
|fol_id|     int   |PK 		| -----|
|fol_use_id_a|     int   |FK	| -----|
|fol_use_id_b|     int   | FK	| -----|

Comentários: 

fol_use_idA: Um utilizador A pode seguir o utilizador B.

fol_use_idB: Um utilizador B pode seguir o utilizador A.

### Guião de Dados

Para a realização do guião de dados foi utilizada parte dos guiões e mais duas situações de uso, utilizando as mesmas personas anteriormente descritas.

#### Exemplo de Evento Fisico
Um domingo, o Gustavo Costa estava a sair do seu turno da manhã do bar SPOT no Bairro Alto, mas não queria nada perder a corrida nem vê-la sozinho. A corrida começa às 15h em Portugal, então o Gustavo instala o Overlap em busca de companhia para ver a corrida. Faz o registo com o seu email, nome e palavra-passe. Após o registo é-lhe apresentada uma tela para selecionar a sua equipa favorita, na qual o Gustavo seleciona a Ferrari e Red Bull, e a Overlap recomenda-lhe grupos que têm como foco principal a equipa da Ferrari. Ao entrar num grupo da Ferrari, encontra Manuel Gusmão, que também está interessado em ver a corrida com alguém e criou um “evento” marcado para às 14:45h relativamente perto de Santos. Vendo o evento do Manuel, o Gustavo interessa-se e decide participar no evento. Manda mensagem no post do Manuel, a perguntar se poderia ir almoçar com ele enquanto via a corrida, combinam o ponto de encontro num restaurante em Santos. No fim de assistirem a corrida, eles seguem o perfil um do outro. 

#### Exemplo de Evento Fisico
Joana Pinto saiu da aula Edição e Design às 17h, e ao sair da faculdade encontrou os habituais trabalhadores da UberEats e ao passar por eles, ouviu mencionarem a última corrida de fórmula 1. Joana não conteve o entusiasmo e mencionou o gosto pela equipa Alpine. Entre os funcionários da UberEats estava Maria Pereira, torcedora também da Alpine. Maria perguntou à Joana se estaria interessada em participar num evento organizado pelo José Almeida na Overlap de amanhã, exclusivo para torcedores da Alpine. Joana desconhecia a aplicação Overlap, e procedeu à criação da conta. Num clique junta-se ao grupo da Alpine, e partilha interesse em participar no evento do dia seguinte. No dia seguinte Joana e Maria destinam-se a Algés, a localização onde marcaram o evento. Encontram-se com o José e os outros e decidem ir ao café mais próximo falar das estratégias da Alpine para as próximas corridas.

#### Exemplo de Evento Online
No comboio a caminho de Lisboa, Pablo está aborrecido, às vezes quando não tem nada para fazer costuma assistir a corridas de F1, mas como não está em casa, não o pode fazer. Então pensa na brilhante ideia de criar um evento do tipo Watch Party no grupo Alfa Romeo, RedBull para que os seus amigos possam partilhar a tela e assistirem juntos a corrida. Pablo marca o evento online e na descrição do evento explicita que o evento será no discord, criando um grupo. Porém como criou o evento muito em cima da hora da corrida, nenhum dos seus amigos viu o evento que criou, apenas apareceu uma pessoa no evento no grupo Alfa Romeo, Francisco Andrade que também não tinha nada para fazer e queria assistir a corrida com alguém, juntando-se assim com o Pablo. Francisco de boa vontade partilha a tela do site SportTV e assistem a corrida juntos. 

#### Exemplo de Evento Fisico
O casal Pinheiro estão ambos em dois grupos de F1, Red Bull e Ferrari, e decidem marcar um evento no grupo da Red Bull, pois não lhes apetece conviver com os alguns membros do grupo da Ferrari. Combinam os detalhes do evento e por fim encontram-se em Belém. 

### Modelo ER

![BASE DE DADOS _ POO-BASE DE DADOS drawio](https://user-images.githubusercontent.com/99985414/210554267-c7593359-0683-4564-ad94-7631a28ed4a3.png)

## 9 - Documentação REST 

### Recurso Users (api/users)

|         *Listar todos os users*	|
|:---:	   	|
|	/api/users (**GET**)	|
|	Sucesso (200):
[{"userName":"Gustavo Costa","password":"123","mail":"gcosta@gmail.com","id":1},{"userName":"Joana Pinto","password":"123","mail":"joanapinto@gmail.com","id":2},{"userName":"Francisco Andrade","password":"123","mail":"frandrade@gmail.com","id":3},{"userName":"Manuel Gusmão","password":"123","mail":"MG@gmail.com","id":4},{"userName":"Pablo Diaz","password":"123","mail":"PDiaz@gmail.com","id":5},{"userName":"Maria Pereira","password":"123","mail":"maripe@gmail.com","id":6},{"userName":"José Almeida","password":"123","mail":"JAlmeida@gmail.com","id":7},{"userName":"Frederico Pinheiro","password":"123","mail":"pinheiro@gmail.com","id":8},{"userName":"Júlia Pinheiro","password":"123","mail":"juliapinheiro@gmail.com","id":9}] |
|	Erros:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Criar um user*	|
|:---:	   	|
|	/api/users/registo (**POST**)	|
|	Dados:
{ userName” : “João Pedro” , “password” : “password123” , “mail”: “jp@gmail.com”“ } |
|	Sucesso (200): Retorna o id do user criado.
[{id:16}] |
|	Erros: 
500: Erro de Servidor|

|         *Pesquisar um user pelo id*	|
|:---:	   	|
|	/api/users/id/{use_id} (**GET**)	|
|	**Parâmetros** : **id** :Os users mostrados têm de conter o texto neste parâmetro no id do user.  |
|	Sucesso (200): 
[{"userName":"Gustavo Costa","password":"123","mail":"gcosta@gmail.com","id":1}] |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Pesquisar um user pelo nome*	|
|:---:	   	|
|	/api/users/name/{use_name} (**GET**)	|
|	**Parâmetros** : **nome** :Os users mostrados têm de conter o texto neste parâmetro no nome do user.  |
|	Sucesso (200): 
[{"userName":"Gustavo Costa","password":"123","mail":"gcosta@gmail.com","id":1}] |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Atualizar user pelo id*	|
|:---:	   	|
|	/api/users/update/{use_id} (**PUT**)	|
|	**Parâmetros** : **id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
|	**Dados** : username e password.|
|	Sucesso (200): [“User updated”] |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Verificar se o user tem um nome já utilizado*	|
|:---:	   	|
|	/api/users/name/verification/{name} (**GET**)	|
|	**Parâmetros** : **nome** :Os users mostrados têm de conter o texto neste parâmetro no nome do user. 
|	Sucesso (200): Pode retornar true ou false depedendo do nome que vai verificar|
|	**Erros**: 
409: Conflict (Existe um nome igual ao que introduziu)
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Listar as tags do user pelo o id*	|
|:---:	   	|
|	/api/users/tag/get/by/name/{use_id} (**GET**)	|
|	**Parâmetros** : **id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
|	Sucesso (200): Retorna as tags de um certo user
[{"tagId":1,"tagName":"Ferrari"}]|
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Verificar se o user tem um email já utilizado*	|
|:---:	   	|
|	/api/users/mail/verification/{mail} (**GET**)	|
|	**Parâmetros** : **mail** :Os users mostrados têm de conter o texto neste parâmetro no mail do user. 
|	Sucesso (200): Pode retornar true ou false depedendo do mail que vai verificar|
|	**Erros**: 
409: Conflict (Existe um email igual ao que introduziu)
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Eliminar user pelo id*	|
|:---:	   	|
|	/api/users/{use_id} (**DELETE**)	|
|	**Parâmetros** : **id** :Os users mostrados têm de conter o texto neste parâmetro no id do user.  |
|	Sucesso (200): Retorna usuário eliminado
[{"userName":"Júlia Pinheiro","password":"123","mail":"juliapinheiro@gmail.com","id":9}] |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Login do user*	|
|:---:	   	|
|	/api/users/login (**POST**)	|
|	**Parâmetros** : **mail** :Os users mostrados têm de conter o texto neste parâmetro no mail do user. 
**password** :Os users mostrados têm de conter o texto neste parâmetro no password do user.|
|	Sucesso (200): Retorna id do usuário que fez login.
[{id:"1"}] |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *User entra num grupo*	|
|:---:	   	|
|	/api/users/id/{use_id}/group/add/{gru_id} (**POST**)	|
|	**Parâmetros** : **use_id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
**gru_id** :Os grupos mostrados têm de conter o texto neste parâmetro no id do grupo. |
|	Sucesso (200): Retorna 1 quando adiciona o user ao grupo |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Associar um user a uma tag*	|
|:---:	   	|
|	/api/users/id/{use_id}/tag/add/{tag_id} (**POST**)	|
|	**Parâmetros** : **use_id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
**gru_id** :Os grupos mostrados têm de conter o texto neste parâmetro no id do grupo. |
|	Sucesso (200): Retorna 1, pois a função retorna void |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Eliminar um user de uma tag*	|
|:---:	   	|
|	/api/users/delete/ussertag/{tu_id} (**DELETE**)	|
|	**Parâmetros** : **tu_id** :Os usertags mostrados têm de conter o texto neste parâmetro no id do user. |
|	Sucesso (200): Retorna 1, pois a função retorna void |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Listar os grupos em que o user está*	|
|:---:	   	|
|	/api/users/id/{use_id}/groups (**GET**)	|
|	**Parâmetros** : **use_id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. |
|	Sucesso (200): Retorna os grupos do user. [{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Pesquisar os grupos em que o user está pelo o nome*	|
|:---:	   	|
|	/api/users/id/{use_id}/group/name/{gru_name} (**GET**)	|
|	**Parâmetros** : **use_id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
**gru_name** :Os grupos mostrados têm de conter o texto neste parâmetro do nome do grupo.|
|	Sucesso (200): Retorna os grupos do user. 
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|

|         *Pesquisar os grupos em que o user está pelo o nome da tag*	|
|:---:	   	|
|	/api/users/id/{use_id}/group/tag/name/{tag_name} (**GET**)	|
|	**Parâmetros** : **use_id** :Os users mostrados têm de conter o texto neste parâmetro no id do user. 
**tag_name** :As tags mostradas têm de conter o texto neste parâmetro do nome da tag.|
|	Sucesso (200): Retorna os grupos do user. 
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado) 
500: Erro de Servidor|


### Recurso Grupos (api/groups)

|         *Listar todos os grupos*	|
|:---:	   	|
|	/api/groups (**GET**)	|
|	Sucesso (200):
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"},{"groupId":2,"creatorId":1,"groupName":"Grupo Mercedes","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Mercedes.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"},{"groupId":3,"creatorId":1,"groupName":"Grupo RedBull","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 RedBull.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"},{"groupId":4,"creatorId":1,"groupName":"Grupo Mclaren ","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Mclaren.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"} (…) ] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Pesquisar grupo pelo id*	|
|:---:	   	|
|	/api/groups/{gru_id} (**GET**)	|
|**Parâmetros** : **gru_id** :Os grupos mostrados têm de conter o texto neste parâmetro no id do grupo.	|
|	Sucesso (200):
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Pesquisar grupo pelo nome*	|
|:---:	   	|
|	/api/groups/by/name/{gru_name} (**GET**)	|
|**Parâmetros** : **gru_name** :Os grupos mostrados têm de conter o texto neste parâmetro do nome do grupo.	|
|	Sucesso (200):
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Pesquisar grupo pelo nome da tag*	|
|:---:	   	|
|	/api/groups/by/tag/{tag_name} (**GET**)	|
|**Parâmetros** : **tag_name** :As tags mostradas têm de conter o texto neste parâmetro do nome da tag.	|
|	Sucesso (200):
[{"groupId":1,"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1 Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Associar uma tag a um grupo*	|
|:---:	   	|
|	/api/groups/id/{gru_id}/tag/add/{tag_id} (**POST**)	|
|**Parâmetros** : **gru_id** :Os grupos mostrados têm de conter o texto neste parâmetro no id do grupo.
**tag_id** : As tags mostradas têm de conter o texto neste parâmetro no id do grupo.|
|	Sucesso (200):Retorna 1 pois a função retorna void. |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Dessaciar uma tag a um grupo*	|
|:---:	   	|
|	/api/groups/delete/grouptag/{tg_id} (**DELETE**)	|
|**Parâmetros** : **tg_id** :Os grouptags mostrados têm de conter o texto neste parâmetro no id do grouptag.|
|	Sucesso (200):Retorna 1 pois a função retorna void. |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Criar um grupo*	|
|:---:	   	|
|	/api/groups/create (**POST**)	|
|**Dados** : {"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1  Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}|
|	Sucesso (200):
[{"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1  Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**:
500: Erro de Servidor|

|         *Alterar dados do grupo pelo id*	|
|:---:	   	|
|	/api/groups/update/{gru_id} (**PUT**)	|
|**Parâmetros**:
**id**: Para identificar o grupo para alterar os dados, precisamos do id.|
|	Sucesso (200):
[{"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1  Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**:
500: Erro de Servidor|

|         *Obter a atividade do grupo*	|
|:---:	   	|
|	/api/groups/update/activity/{gru_id} (**GET**)	|
|**Parâmetros**:
**id**: Para identificar a atividade do grupo, precisamos do id.|
|	Sucesso (200): Retorna true ou false 
[{true}]|
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Eliminar o grupo pelo id*	|
|:---:	   	|
|	/api/groups/delete/{gru_id} (**DELETE**)	|
|**Parâmetros**:
**id**: Para eliminar o grupo, precisamos do id.|
|	Sucesso (200):
[{"creatorId":1,"groupName":"Grupo Ferrari","groupDescription":"Grupo que junta pessoas com interesse na equipa de f1  Ferrari.","groupAge":"2022-09-09","activity":true,"lastPost":"2022-09-10T08:30:25.000+00:00"}]|
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

### Recurso Mensagem (api/message)

|         *Criar uma mensagem*	|
|:---:	   	|
|	/api/message/create (**POST**)	|
|**Dados** :  {“messageText”: "Alguém quer almoçar para depois ir ver a corrida?"}|
|	Sucesso (200): [{"messageId":1,"messageText":"Alguém quer almoçar para depois ir ver a corrida?","messageUserId":1,"messageUserGroupId":1,"messageDate":"2022-09-22T14:10:25"}]|
|	**Erros**:
500: Erro de Servidor|

|         *Editar uma mensagem por id*	|
|:---:	   	|
|	/api/message/edit/{mes_id} (**PUT**)	|
|**Parâmetros** : **id**: Para identificar a mensagem que queremos alterar, precisamos do id.  |
|	Sucesso (200): [{“Message edited”}]|
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Listar todas as mensagens por id do grupo*	|
|:---:	   	|
|	/api/message/group/id/{gru_id} (**GET**)	|
|**Parâmetros** : **gru_id**: Para identificar a mensagem que queremos alterar, precisamos do id.  |
|	Sucesso (200): [{"messageId":1,"messageText":"Alguém quer almoçar para depois ir ver a corrida?","messageUserId":1,"messageUserGroupId":1,"messageDate":"2022-09-22T14:10:25"}]|
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

### Recurso Tags (api/tags)

|         *Listar todas as tags*	|
|:---:	   	|
|	/api/tags (**GET**)	|
|	Sucesso (200):
[{"tagId":1,"tagName":"Ferrari"},{"tagId":2,"tagName":"Mercedes"},{"tagId":3,"tagName":"RedBull"},{"tagId":4,"tagName":"Mclaren"},{"tagId":5,"tagName":"Alpine"},{"tagId":6,"tagName":"Alfa Romeo"},{"tagId":7,"tagName":"Aston Martin"},{"tagId":8,"tagName":"Haas"},{"tagId":9,"tagName":"Alphatauri"},{"tagId":10,"tagName":"Williams"}]|
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Procurar tag pelo id*	|
|:---:	   	|
|	/api/tags/id/{tag_id} (**GET**)	|
|	Sucesso (200): **Parâmetros** : **tag_id**: Para pesquisar pelo id da tag.
[{"tagId":1,"tagName":"Ferrari"}] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|         *Procurar tag pelo nome*	|
|:---:	   	|
|	/api/tags/by/name/{tag_name} (**GET**)	|
|	Sucesso (200): **Parâmetros** : **tag_name**: Para pesquisar pelo nome da tag.
[{"tagId":1,"tagName":"Ferrari"}] |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

### Recurso Online Events (api/onlineevents)

|         *Listar todos os eventos online*	|
|:---:	   	|
|	/api/onlineevents (**GET**)	|
|	Sucesso (200): |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|        *Listar todos os eventos online pelo o id do grupo*	|
|:---:	   	|
|	/api/onlineevents/id/{gru_id} (**GET**)	|
|	Sucesso (200): |
|	**Erros**:
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|

|        *Listar todos os eventos online pelo o nome do grupo*	|
|:---:	   	|
|	/api/onlineevents/name/{gru_name} (**GET**)	|
|	Sucesso (200): |
|	**Erros**: 
404: Not Found (O servidor não conseguiu encontrar o recurso solicitado)
500: Erro de Servidor|





## 10 - Manual do Utilizador

Após entrar na aplicação, o utilizador vai encontrar uma caixa de texto onde irá  inserir o nome, email e palavra-passe para a sua conta.

![bc722cbb-9ff9-4190-84a7-e5952bcf240c](https://user-images.githubusercontent.com/99985414/210182145-81f18105-01ee-4e73-83b1-7e60415ea66f.jpg) 

Após o registo na aplicação será pedido ao utilizador para selecionar as equipas em que está interessado.

![image](https://user-images.githubusercontent.com/99985414/213503189-b6636f15-e546-447c-ba55-3e29099f88ce.png)

O utilizador encontrará três botões na parte inferior do ecrã: 

* Ícone de usuario "Friends", onde poderá adicionar os seus amigos.
* Ícone de home "Home", onde verá os grupos que pode entrar.
* Ícone de pin de GPS "Maps", onde verá os eventos de grupos que entrou.

**Home**


![image](https://user-images.githubusercontent.com/99985414/213504229-0cd01569-2eb5-4194-b5e5-ec71c94ed325.png)


Ao entrar num grupo poderá visualizar as mensagens no *groupchat*.


![d72ebffb-247b-49f9-b5d6-b765bbe34288](https://user-images.githubusercontent.com/99985414/213505562-d938eee0-2f25-41cc-9932-a7bf70a40f68.jpg)


De volta à Home Page, o botão vermelho com o "+",  utilizador poderá criar grupos.


![0a2394ca-b79c-4ea7-8552-31e347f8e7c4](https://user-images.githubusercontent.com/99985414/213503713-cc5c6034-a764-451b-8f00-12323259c781.jpg)


**Friends**


![f51ee018-2423-416e-85c1-ce67f40d017a](https://user-images.githubusercontent.com/99985414/213504675-4dfae7e1-9249-46a3-b5d7-16f9f5527d6e.jpg)


**Maps**

Poderá ver os possiveis eventos do grupo.


![image](https://user-images.githubusercontent.com/99985414/213569201-2804b846-3abf-4c6a-8b0a-b53d34b32e09.png)



## 11 - Bibliografia

Formula One Digital Media Limited (2014). Official F1 ® App. Google Play. https://play.google.com/store/apps/details?id=com.softpauer.f1timingapp2014.basic&hl=pt_PT&gl=US

VMware Inc (2002). Spring Boot. Spring Boot.
https://spring.io/projects/spring-boot

Microsoft (2015). Visual Studio Code. Visual Studio Code - Code Editing. Redefined.
https://code.visualstudio.com/

Dylan Field & Evan Wallace (2016). Figma. Figma: the collaborative interface design tool. https://www.figma.com/

PostgreSQL Global Development Group (1996). pgAdmin. pgAdmin - PostgreSQL Tools https://www.pgadmin.org/

Google(2013). Download Android Studio & App Tools.Android Studio. Android Developers. https://developer.android.com/studio

Zeb Evans & Alex Yurkowiski. Click Up (2016). ClickUp™ | One app to replace them all. ClickUp. https://clickup.com/

SquareDev (2013). Retrofit. Square Open Source. https://square.github.io/retrofit/

SmartBear Software (2011). Swagger. Swagger: API Documentation & Design Tools for Teams. https://swagger.io/
