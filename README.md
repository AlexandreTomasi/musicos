# musicos
API que disponibiliza dados sobre artistas e álbuns


Importando o projeto no Spring Tool Suite 4
file->import->maven-> existing Maven projects
Para baixar as libs do maven faça
Clique no projeto com botao direito e depois em
Maven-> update Project -> ok
Sera baixado todas as libs e plugins necessarios.

Na primeira execução será criado o banco de dados.
Para dar carga no banco:
Abra o postgre pgAdmin 4 e vai ate o pulic do database postgres
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