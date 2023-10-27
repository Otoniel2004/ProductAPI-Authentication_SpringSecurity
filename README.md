<h1>ProductAPI-Authentication_SpringSecurity</h1>
<h3>API de gerenciamente de produtos com Authenticação de Usuário</h3>
<h3>Funções:</h3>
<ul>
  <li>Postagem de produtos;</li>
  <li>Visualização de todos os produtos;</li>
  <ul>
     <li>Link de cada produto.</li>
  </ul>
  <li>Visualização de um único produto;</li>
  <ul>
     <li>Link de todos os produtos.</li>
  </ul>
  <li>Excluir produto;</li>
  <li>Modificar produto;</li>
  <li>Identificação (ID) de cada produto;</li>
  <li>Registro de usuário;</li>
  <ul>
     <li>Token exclusivo para cada usuário.</li>
  </ul>
  <li>Login com a conta do usuário;</li>
</ul>
<h3>Observações:</h3>
<ul>
  <li><p>Só é possivel editar produtos somente como administrador (ADMIN)</p></li>
  <li><p>Antes de utilizar a API certifiquece de colocar a URL JDBC, Username (Padrão: postgres) e Senha (Password) no arquivo de texto "application.properties"</p>
  <p>Caminho: (<code>src\main\resources</code>)</p></li>
</ul>
<h3>Comandos:</h3>
<ul>
  <li><code>.baseURL/products</code> - POST - Postagem de produtos;</li>
  <li><code>.baseURL/products</code> - GET - Visualização de todos os produtos;</li>
  <li><code>.baseURL/products/{id}</code> - GET - Visualização de um único produto;</li>
  <li><code>.baseURL/products/{id}</code> - DEL - Excluir produto;</li>
  <li><code>.baseURL/products/{id}</code> - PUT - Modificar produto;</li>
  <li><code>.baseURL/auth/register</code> - POST - Fazer Registro de um novo usuário ("user", "password", "role");</li>
  <li><code>.baseURL/auth/login</code> - POST - Fazer Login ("user", "password").</li>
</ul>
<h3>URL Base Padrão:</h3>
<ul>
     <li><h4>http//localhost:8080</h4></li>
</ul>
