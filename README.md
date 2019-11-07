# Projeto Músicos 1.0
Neste projeto é implementado uma API que disponibiliza dados sobre artistas e álbuns. Expondo via API quais álbuns são/tem os cantores e/ou bandas.

Pré-requisitos
Sistema operacional Windows 7/10  64b.
Java 1.8
Ide Spring Tools 4 for Eclipse <https://spring.io/tools>;
Projeto criado no site <https://start.spring.io/ > configurado como:
Maven Project
Linguagem JAVA
Spring Boot 2.2.0
Dependências iniciais: Spring Web Service, Spring Data JPA, H2
Banco de dados PostgreSQL 10 <https://www.postgresql.org/download/>
SoapUi 5.5 (Para testar requisições do Web Service)

Guia de instalação
Instalacao do postGre utilize a senha padrao:
login:admin
senha:admin.
Importando o projeto na IDE do Spring Tool Suite 4
file->import->maven-> existing Maven projects
Para baixar as libs do maven faça
Clique no projeto com botao direito e depois em Maven-> update Project -> ok
Sera baixado todas as libs e plugins necessarios.
Para excutar o sistema abra a classe "CustomersAdministrationApplication" e execute usando Spring Boot App.
Na primeira execução será criado o banco de dados.
Para dar carga no banco:
Abra o postgre pgAdmin 4 e vai ate o public do database postgres
com clique do botao direito no public clique em query tool
agora só copiar o script do carga.sql localizado na raiz do projeto e colar no editor e executar.


Consumindo o WebService usando SoapUI.
Abra o SoapUI clique em File-> new SOAP projects. Na tela que abriu coloque a URL 
http://localhost:8080/ws/musicos.wsdl no campo inicial WSDL e clica em OK.
Pronto agora é só passar os parametros necessarios nos request da consulta que preferir.
Para consultar artista por nome:
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:emp="http://EmpresaAlexandre.com.br">
   <soapenv:Header/>
   <soapenv:Body>
      <emp:ConsultaArtistaNomeRequest>
         <emp:nomeArtista>FULANO</emp:nomeArtista>
         <emp:ordem>ASC</emp:ordem>
      </emp:ConsultaArtistaNomeRequest>
   </soapenv:Body>
</soapenv:Envelope>
Caso queira consultar artista por tamanho do nome do artista.
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:emp="http://EmpresaAlexandre.com.br">
   <soapenv:Header/>
   <soapenv:Body>
      <emp:ConsultaArtistaTamanhoRequest>
         <emp:tamanhoNome>12</emp:tamanhoNome>
         <emp:ordem>asc</emp:ordem>
      </emp:ConsultaArtistaTamanhoRequest>
   </soapenv:Body>
</soapenv:Envelope>

Api publicas como consultar.
Ao pesquisar essa URL "http://localhost:8080/artistas/search"
Vai aparecer as api publicas disponiveis criadas.
"http://localhost:8080/artistas/search/findByNomeOrderByNomeAsc{?name}"
"http://localhost:8080/artistas/search/findByNomeOrderByNomeDesc{?name}"
"http://localhost:8080/artistas/search/deleteById{?id}"
"http://localhost:8080/artistas/search/findById{?id}"
Quando usado o "@RepositoryRestResource" na classe CustomerRepository a ferramenta ja cria um CRUD para ser usado (GET, POST, PUT, DELETE);
POST (inserir)
http://localhost:8080/artistas/
Corpo em json { "id":??, "nome":"???" }

GET (consultar) lista todos
http://localhost:8080/artistas/

GET (consultar) por ID
http://localhost:8080/artistas/search/findById?id=?





