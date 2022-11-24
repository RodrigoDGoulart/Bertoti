# Analisando sites com Critérios de Interação
Fonte: <a href="https://www.w3.org/WAI/WCAG21/quickref/">How to Meet WCAG</a>

## Heurística 1.4.1 - Uso de cores (Use of color)
O critério é a respeito do uso de cores dentro do site. Além da estética utilizando a paleta de cores correta em relação à marca, deve-se atentar também ao contraste dos elementos dentro da interface, onde não fica só estéticamente mais bonito como também ajuda usuários daltônicos ou com problemas de visão referente a cor devido 
No caso, é de se perceber que o site da Udemy não tem muito contraste, utilizando cores brancas como fundo, preto para as letras e bordas de elementos e por final o roxo para alguns detalhes e destaques de alguns elementos. Como destaque negativo podemos observar o menu (destacado em vermelho). É de se observar que o menu contém sub-items que aparecem ao passar o mouse sobre o menu, os itens aparentes em questão estão com fundo escuro e cor da letra branca, compensando a mesma heurística de uso de cores.

<p align="center">Menu do site Udemy (Destacado em vermelho)</p>
<img src="https://user-images.githubusercontent.com/90328897/186432531-75ddbc01-f7c4-4402-9de2-027085df118a.png" />
<p align="center">Fonte: Autoria própria</p>

<p align="center">Sub-itens do menu do site (Destacado em verde)</p>
<img src="https://user-images.githubusercontent.com/90328897/186433589-de2b1427-95f6-449c-b462-00188c595a7c.png" />
<p align="center">Fonte: Autoria própria</p>

## Heurística 2.4.1 - Desvio de blocos (Bypass blocks)
Em relação à navegação do site com o teclado (usando a tecla `tab` por exemplo), uma das heurísticas é de possuir alguma opção de pular partes repetidas como listas, filtros, menus, etc. Entretanto, é observável no site do Repassa, a ausência desta funcionalidade, onde quando se chega na parte dos filtros, é preciso passar por todas as linhas para ir para a próxima seção do site.

<p align='center'>GIF de navegação pelo teclado no site Repassa</p>

<p align='center'><img src='https://user-images.githubusercontent.com/90328897/203680958-f58659d8-60ee-4350-8726-414da0535278.gif' /></p>

<p align="center">Fonte: Autoria própria</p>

## Heurística 2.4.3 - Ordem de foco (Focus order)
No mesmo assunto de navegabilidade com teclado e/ou programas de leitura de texto para deficiente visuais, existe a heurística de determinar um sentido na ordem de foco na aplicação, onde deve-se priorizar o sentido e facilidade no uso. É perceptível a ausência desta heurística no site de notícias da UFSC, onde ao chegar no conteúdo princial do site, a ordem de foco é perdida, dificultando o acesso ao conteúdo princial por meio da navegabilidade por teclado

<p align='center'>GIF de navegação pelo teclado no site de notícias UFSC</p>
<p align='center'>
<img src='https://user-images.githubusercontent.com/90328897/203682260-f1eb60e9-6911-4423-a818-b412135a9f05.gif' />
</p>
<p align="center">Fonte: Autoria própria</p>

## Heurística 2.4.7 - Foco visível (Focus visible)
Com o intuito de guiar o usuário que está navegando o site pelo teclado, é importante indicar ao mesmo onde ele está, destacando o elemento que está em foco. O site do Clube da Medalha já não cumpre esta heurística, pois mesmo com o foco, os únicos elementos que reagem ao receberem foco são os de inserção de texto, os botões e outros elementos já não reagem quando focados.

<p align='center'>Site Clube da medalha com elemento de login em foco. Observa-se que o elemento não possui nenhum destaque</p>
<p align='center'><img src='https://user-images.githubusercontent.com/90328897/203683354-f0ecc06e-b51e-425a-a41b-1091f55dd5a0.png' /></p>
<p align="center">Fonte: Autoria própria</p>

## Heurística 3.1.3 - Palavras fora do comum (Unusual words)
Ás vezes, dependendo do conteúdo do site, pode haver palavras não amplamente conhecidas. A heurística indica a necessidade de haver algum indicador explicando essas palavras. Um ótimo exemplo é o próprio Wikipédia, onde certas palavras levam para outros artigos que explicam essa própria palavra

<p align='center'>Site da wikipédia, com um pop-up explicando a palavra em questão. A palavra também é clicável, levando ao próprio artigo.</p>
<p align='center'><img src='https://user-images.githubusercontent.com/90328897/203757477-34b1bb65-8c09-48a6-866c-ddeace9815aa.png' /></p>
<p align="center">Fonte: Autoria própria</p>

## Heurística 3.3.1 - Identificação de erro (Error identification)
A identificação do erro é importante para o usuário se guiar e muitas vezes resolver o próprio problema ou compreender que é um erro interno, como o servidor. Um exemplo de aplicação desta heurística é o erro de login, quando o usuário tenta acessar uma conta que não existe ou colocou a senha errada. Um site que aplicou esta heurística foi o Clube da Medalha, indicando o erro de e-mail inválido

<p align='center'>Site do Clube da medalha, indicando erro de e-mail inválido</p>
<p align='center'><img src='https://user-images.githubusercontent.com/90328897/203759121-bccaaca3-37dd-443b-b729-3066d81e1bba.png' /></p>
<p align="center">Fonte: Autoria própria</p>
