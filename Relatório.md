*TeamUP 


**Breve descrição da app-

É um aplicativo onde as pessoas inserem os seus gostos desportivos, como por exemplo as suas equipas favoritas, podendo assim encontrarem-se com outras pessoas que partilham os mesmos gostos. 

**Descrição dos objetivos–

	A ideia da aplicação surgiu através devido a falta de pessoas que compartilham o mesmo gosto desportivo. Para isso criou-se TeamUp, uma aplicação que visa encontrar pessoas que partilham o mesmo gosto desportivo: 

	 * Usuários que gostam de basquete e são dos Lakers irão encontrar grupos com pessoas que partilham o mesmo gosto.

	A aplicação foi pensada para um público que abrange a idade entre os 18-30, jovens adultos, mas incentivamos todas a todas as idades a experimentar a nossa aplicação.

Aplicações com o mesmo intuito que o TeamUp:

 * MatchApp, aplicação grátis que permite ver todo o tipo de informação relacionado somente com futebol.

 * SportsBuddy, mais focado no encontro desportivo.

 * Sporty

 * Sportsvite -website only (vão encerrar)




6.
	
	O utilizador após entrar na aplicação vai encontrar uma caixa de texto onde irá inserir o seu nome de utilizador, o seu email e a palavra passe para a sua conta, a seguir ao terminar este processo o utilizador poderá escolher os desportos que deseja seguir e as suas equipas favoritas. 
	Ao abrir a aplicação o utilizador poderá ver a sua “Home page” onde se encontram os grupos no qual se juntou, se o utilizador não estiver em nenhum grupo será sugerido grupos onde pessoas com gostos semelhantes se encontram.
	O utilizador encontrará 3 botões na parte inferior do ecrã, uma lupa, uma casa e um sinal de gps, respetivamente. Na lupa conseguirá procurar mais grupos caso deseje explorar os seus gostos desportivos. Na casa voltará a sua “Home page” e por fim tem o sinal de gps no qual pode ver os eventos que estão a decorrer perto da sua localização. 
	Estes eventos previamente mencionados são criados nos grupos onde utilizadores do tal grupo decidiram a localização onde se iriam encontrar e com uma breve descrição do evento, ex: Partida de Basquete em Alcântara. Não será preciso um método de verificação que pertence ao dito grupo pois o objetivo da aplicação é encontrar pessoas com o mesmo gosto desportivo, mesmo que a pessoa não esteja na aplicação.

	Por exemplo, o Gustavo, um jovem adulto, pretende conhecer novas pessoas para falar sobre futebol. Instala TeamUP, cria uma conta com o seu email, nome e palavra-passe, e de seguida coloca que está interessado em futebol e coloca a sua equipa favorita, Benfica. Após se registar, é-lhe recomendado grupos de futebol, ele decide juntar-se a um grupo, e daí começa a conviver através do chat do grupo. 
	O Benfica vai jogar no sábado e o Gustavo gostava imenso de ir ver a sua equipa favorita a jogar, no chat que tinha entrado, pergunta se alguém estaria interessado em ir ver o jogo com ele. Ele recebe mensagens no chat do grupo, de pessoas interessadas, o João e o Francisco. Então o Gustavo combina com eles a localização perto do estádio da Luz. 
	De outra perspetiva, o Manuel não gosta nada do Benfica, e queria jogar uma partida amistosa de futebol com os seus amigos, porém todos os seus amigos são benfiquistas e vão ficar a ver o jogo, então, o Manuel decide instalar TeamUP, regista-se com email, nome e palavra-passe, seleciona o desporto que gosta, que neste caso seria  futebol, coloca a sua equipa favorita, Porto, e após o registo é recomendado alguns grupos de futebol, ele entra num, e vê os “eventos do grupo” e repara que existe uma partida amistosa de futebol às 18 horas, num campo perto da casa dele. Decide participar no evento, as pessoas que pretendem ir ao evento recebem uma notificação a dizer que o Manuel vai participar.
 
7.
i
	A aplicação TeamUP consiste em encontrar pessoas com os mesmos gostos desportivos. Ao entrarem na aplicação, encontram grupos com o gosto equivalente e começam a conviver. Consequentemente encontram-se para assistir a jogos do desporto,  e até mesmo para praticarem desporto juntas. 

ii.
	Para a realização da aplicação TeamUP, será necessário enquadrar as diversas UCs. Necessitamos de uma base de dados para gerir os dados dos utilizadores -nome, email, género, idade- assim como armazenar dados de equipas desportivas. Uma interface para o utilizador interagir com a aplicação, feita no Android Studio, com todas as funcionalidades necessárias para satisfazer o usuário, por exemplo escolher a equipa favorita, juntar-se a grupos do seu interesse, alterar o seu perfil. Consequentemente para estabelecer uma comunicação entre estes dois (base de dados e interface da app), precisamos de uma API REST, pois é utilizada para estruturar qualquer modelo de aplicações web/móvel para os dias atuais, onde existe um alto volume de trocas de dados processados de forma assíncrona.




iii.
	Para requisitos técnicos, teremos a funcionalidade de autenticação de usuário - por email - , incluir/alterar/apagar informação do utilizador caso o mesmo deseje, barra de pesquisa para o utilizador poder pesquisar por mais grupos do seu interesse, Geolocalização, ao pesquisar grupos do seu interesse aparecer aqueles apenas com usuários perto de si (exemplo: usuário de algés ao pesquisar grupos de futebol perto de si encontrará grupos com usuários de algés/ belém/ cruz quebrada). Nesses grupos existirá uma funcionalidade de chat, para os utilizadores falarem entre si e eventualmente criar “eventos”, para assistir a jogos da equipa favorita ou para combinar partidas casuais. Após o registo do usuário, haverá uma funcionalidade de recomendar grupos de acordo com os interesses do usuário.

iv.
	TeamUP é dividida em três partes: Database, Application programming interface (API) e Interface da APP.

v.
	TeamUP será maioritariamente desenvolvida em VS Code, para a interface da app será utilizado Android Studio. API REST usará Java, Spring Boot. E por fim, para controlar os dados dos utilizadores será usado SQL postgres. 
