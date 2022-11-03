# TeamUP

### Membros deste Repositório:
* Duarte Cavaleiro	20211026 
* Mariana Gonçalves	20210539
* Miguel Bernardo	20211066


## 1-Descrição da app

### 1.1-Breve Descrição
TeamUp é uma aplicação onde os utilizadores  inserem os seus gostos desportivos, como por exemplo as suas equipas favoritas, podendo assim encontrarem-se com outros utilizadores que partilham os mesmos gostos.

### 1.2-Objetivos
A ideia da aplicação surgiu devido a falta de pessoas que partilham o mesmo gosto desportivo num grupo social. Para responder a esta necessidade foi criada a aplicação TeamUP, uma aplicação que consiste em encontrar pessoas que partilham o mesmo gosto desportivo.

### 1.3-Funcionalidades
A aplicação TeamUP consiste em muitas funções sendo a principal e mais importante, a opção de conseguir juntar-se a um grupo da sua equipa favorita podendo assim comunicar com adeptos e partilhar os seus pontos de vista. Outra função presente na nossa aplicação é a disponibilidade das pessoas presentes no grupo conseguirem-se encontrar num local para praticar um desporto escolhido pelos próprios.

### 1.4-Público Alvo
A nossa aplicação tem como público alvo pessoas entre os 18 e 50 anos de idade que tenham interesses desportivos e tenham algum tempo livre (alguma condição para se movimentar e disponibilidade para praticar desporto).


## 2-Apps semelhantes

No desenvolvimento da nossa app, de forma a  evitarmos falhas e possivelmente copyright, decidimos pesquisar sobre apps que se encontram no mesmo mercado que o TeamUP, conseguimos encontrar algumas  com o mesmo foco desportivo, no entanto nenhuma dessas apps ofereciam as mesmas funcionalidades e experiência que a nossa.

Aplicações com o mesmo intuito que o TeamUp:

* MatchApp, aplicação grátis espanhola  que permite ver todo o tipo de informação sobre uma equipa de futebol a sua escolha permitindo ver os próximos jogos da equipa em que torneio participa ,que jogadores fazem parte dela entre outras informações.

* SportsBuddy, uma app onde podes falar com pessoas com diferentes interesses desportivos.

* Sporty, aplicação italiana que não permitia entrar pois era necessário uma parceria de um ginásio.


## 3-Guião
Após entrar na aplicação, o utilizador vai encontrar uma caixa de texto onde irá  inserir o nome, email e palavra-passe para a sua conta, em seguida o utilizador poderá escolher os desportos que deseja seguir e as equipas favoritas.
Após o registo na aplicação o utilizador poderá ver a Home Page onde se encontram os grupos  aos quais se juntou, caso o utilizador não esteja em nenhum grupo, serão sugeridos grupos onde pessoas com gostos semelhantes se encontram.
O utilizador encontrará três botões na parte inferior do ecrã, uma lupa, uma casa e um sinal GPS no qual poderá visualizar os eventos que estão a decorrer perto da sua localização.
Os eventos são criados nos grupos, nos quais os membros definem uma localização para o decorrer do mesmo. 
Não será preciso um método de verificação que pertence ao grupo, pois o objetivo da aplicação é encontrar pessoas com o mesmo gosto desportivo, mesmo que a pessoa não esteja a utilizar o TeamUP.

### Breve introdução das personas:

* Gustavo Costa, 40 anos, é do Benfica e trabalha no bar SPOT no Bairro Alto. 
* Francisco Andrade, 27 anos, adepto do Benfica, trabalha como professor assistente na Faculdade de Belas Artes em Lisboa.
* Joana Pinto, 19 anos, Benfiquista e está a tirar um curso de fotografia no IADE.
* Manuel Gusmão, 24 anos, Portista e trabalha como sapateiro.

Por exemplo, o Gustavo, um jovem adulto, pretende conhecer novas pessoas para falar sobre futebol. Instala o TeamUP, cria uma conta com o seu email, nome e palavra-passe, e de seguida coloca que está interessado em futebol e coloca a sua equipa favorita, Benfica. Após o registo , é-lhe recomendado grupos relacionados com futebol, o utilizador decide juntar-se ao grupo do Benfica e daí começa a interagir através do chat do grupo. O Benfica vai jogar no sábado e o Gustavo gostava imenso de ir ver a sua equipa favorita a jogar. No grupo que tinha entrado, pergunta no chat se alguém estaria interessado em acompanhá-lo. Uns minutos se passam e recebe mensagens no chat do grupo, de pessoas interessadas, a Joana e o Francisco. O Gustavo combina a localização com os outros utilizadores perto do estádio da Luz.
De outra perspetiva, o Manuel não gosta nada do Benfica, e queria jogar uma partida amistosa de futebol com os seus amigos, porém todos os seus amigos são benfiquistas e vão ver o jogo então, o Manuel decide instalar TeamUP, regista-se com o email, nome, e palavra-passe, seleciona o desporto que gosta, que neste caso seria futebol, coloca a sua equipa favorita, Porto, e após o registo são recomendados alguns grupos de futebol, ele entra num e vê os “eventos de grupo” e repara que existe uma partida amistosa de futebol às 18 horas, num campo perto da casa dele. Decide participar no evento, as pessoas que pretendem ir ao evento recebem uma notificação a dizer que o Manuel vai participar.


## 4-Solução
### 4.1- Descrição genérica da solução implementada
Devido ao objetivo da nossa aplicação de ajudar os seus utilizadores a encontrarem outras pessoas com os mesmos gostos desportivos e facilitar encontros para a prática de desporto, a nossa aplicação utiliza geolocalização para habilitar os utilizadores a declararem-se a eventos desportivos e a encontrar outros eventos de utilizadores.  
 
### 4.2-Enquadramento das Unidades Curriculares
Para a realização da aplicação TeamUP, será necessário enquadrar as diversas UCs. Necessitamos de uma base de dados para gerir os dados dos utilizadores (nome, email, género, idade) assim como armazenar dados de equipas desportivas. Uma interface para o utilizador interagir com a aplicação, feita no Android Studio, com todas as funcionalidades necessárias para satisfazer o usuário, por exemplo escolher a equipa favorita, juntar-se a grupos do seu interesse, alterar o seu perfil. Consequentemente para estabelecer uma comunicação entre estes dois (base de dados e interface da app), precisamos de uma API REST, pois é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona. Por fim, a unidade curricular Competências Comunicacionais terá um grande impacto nas apresentações que haverá ao longo do semestre.

### 4.3-Requisitos técnicos
Java: usado para desenvolver a REST API e a aplicação móvel.

SQLpostgres: para gerir os dados dos utilizadores.


### 4.4-Arquitetura da solução
TeamUP estará dividida em três partes: 

Base de Dados, onde serão armazenados os dados dos utilizadores, assim como dos clubes desportivos.
API, é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona.
Aplicação Móvel, utilizador vai estar em contato direto com a interface da aplicação, onde estarão presentes as funcionalidades como por exemplo: login, entrar num grupo, marcar um evento(…). 
A API vai permitir a comunicação entre a base de dados e a aplicação móvel.

### 4.5-Tecnologias a utilizar

SpringBoot: https://spring.io/projects/spring-boot

VS Code: https://code.visualstudio.com/

Figma (MockUps): https://www.figma.com/

PgAdmin: https://www.pgadmin.org/download/

AndroidStudio: https://developer.android.com/studio


## 5-Planeamento e calendarização
![Gráfico de Gantt](https://user-images.githubusercontent.com/99985414/197419120-f6f43024-4839-44cc-b5d2-2b93a6847acd.png)

Os membros realizarão cada tarefa em conjunto.

### Modelo do Domínio
![Modelo de Dominio](https://user-images.githubusercontent.com/99985414/197419185-7647822e-1095-434f-9ac7-930511062fed.png)


## 6-Bibliografia

MatchApp: https://play.google.com/store/apps/details?id=com.justteamup.matchapp&hl=en_US&gl=US

SportsBuddy: https://play.google.com/store/apps/details?id=org.buddyapps.sportsbuddy&hl=pt_PT&gl=US

Sporty:
https://apps.apple.com/pt/app/sporty/id1585635348?l=en

SpringBoot: 
https://spring.io/projects/spring-boot

VS Code: 
https://code.visualstudio.com/

Figma (MockUps):
https://www.figma.com/

PgAdmin:
https://www.pgadmin.org/download/

AndroidStudio:
https://developer.android.com/studio

Gráfico deGantt: 
https://www.officetimeline.com/online/gantt-chart-maker
