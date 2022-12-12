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


### 4.4-Arquitetura da solução
Overlap estará dividida em três partes: 

Base de Dados, onde serão armazenados os dados dos utilizadores, assim como dos clubes desportivos.
API, é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona.
Aplicação Móvel, utilizador vai estar em contato direto com a interface da aplicação, onde estarão presentes as funcionalidades como por exemplo: login, entrar num grupo, marcar um evento(…). 
A API vai permitir a comunicação entre a base de dados e a aplicação móvel.

### 4.5-Tecnologias a utilizar

* SpringBoot: https://spring.io/projects/spring-boot

* VS Code: https://code.visualstudio.com/

* Figma (MockUps): https://www.figma.com/

* PgAdmin: https://www.pgadmin.org/download/

* AndroidStudio: https://developer.android.com/studio

*  RetroFit2: https://square.github.io/retrofit/

* Swagger: https://swagger.io/

## 5-Planeamento e calendarização
![Gráfico de Gantt](https://user-images.githubusercontent.com/99985414/197419120-f6f43024-4839-44cc-b5d2-2b93a6847acd.png)

Os membros realizarão cada tarefa em conjunto.

## 6-Modelo do Domínio
![Modelo de Dominio](https://user-images.githubusercontent.com/99985414/197419185-7647822e-1095-434f-9ac7-930511062fed.png)

## 7- Diagrama de Classes
![BASE DE DADOS _ POO-POO ATUALIZADO drawio](https://user-images.githubusercontent.com/99985414/205518885-5a9fa97c-343e-4d04-8c1c-d521cdae2d0c.png)

## 8-Bibliografia

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
