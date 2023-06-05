<h1>Spring Boot CRUD RESTful API (Java)</h1>

<p>A Java-based Spring Boot RESTful API that connects to a database and implements CRUD operations through RESTful endpoints. It leverages technologies like RestController, JPA/Hibernate, MySQL, and follows the principles of Dependency Injection and Inversion of Control (IoC). The project demonstrates the ability to design scalable and maintainable APIs using Java and Spring Boot, with a separate DAO layer for data access and a Service Layer for business logic encapsulation.</p>

<h2>Features</h2>

<ul>
  <li>Retrieve a list of all employees</li>
  <li>Retrieve an employee by ID</li>
  <li>Add a new employee</li>
  <li>Update an existing employee</li>
  <li>Delete an employee by ID</li>
</ul>

<h2>Technologies Used</h2>

<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>MySQL</li>
  <li>Maven</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>

<ul>
  <li>Java Development Kit (JDK) 8 or later</li>
  <li>MySQL database</li>
</ul>

<h3>Installation</h3>

<ol>
  <li>Clone the repository:</li>
</ol>

<pre><code>git clone https://github.com/your-username/spring-boot-crud-rest-api.git
</code></pre>

<ol start="2">
  <li>Navigate to the project directory:</li>
</ol>

<pre><code>cd spring-boot-crud-rest-api
</code></pre>

<ol start="3">
  <li>Open the <code>application.properties</code> file in <code>src/main/resources</code> and configure the MySQL database connection properties:</li>
</ol>

<pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
</code></pre>

<ol start="4">
  <li>Build the project using Maven:</li>
</ol>

<pre><code>mvn clean package
</code></pre>

<ol start="5">
  <li>Run the application:</li>
</ol>

<pre><code>mvn spring-boot:run
</code></pre>

<ol start="6">
  <li>The application will be accessible at: <code>http://localhost:8080/api</code></li>
</ol>

<h2>API Endpoints</h2>

<h3>Retrieve all employees</h3>

<ul>
  <li><strong>URL:</strong> <code>/api/employees</code></li>
  <li><strong>Method:</strong> GET</li>
  <li><strong>Response:</strong> List of employees in JSON format</li>
</ul>

<h3>Retrieve an employee by ID</h3>

<ul>
  <li><strong>URL:</strong> <code>/api/employees/{employeeId}</code></li>
  <li><strong>Method:</strong> GET</li>
  <li><strong>Path Variable:</strong> employeeId (integer)</li>
  <li><strong>Response:</strong> Employee details in JSON format</li>
</ul>

<h3>Add a new employee</h3>
<ul>
  <li><strong>URL:</strong> <code>/api/employees</code></li>
  <li><strong>Method:</strong> POST</li>
  <li><strong>Request Body:</strong> Employee details in JSON format (excluding ID)</li>
  <li><strong>Response:</strong> Newly added employee details in JSON format</li>
</ul>
<h3>Update an existing employee</h3>
<ul>
  <li><strong>URL:</strong> <code>/api/employees</code></li>
  <li><strong>Method:</strong> PUT</li>
  <li><strong>Request Body:</strong> Updated employee details in JSON format (including ID)</li>
  <li><strong>Response:</strong> Updated employee details in JSON format</li>
</ul>
<h3>Delete an employee by ID</h3>
<ul>
  <li><strong>URL:</strong> <code>/api/employees/{employeeId}</code></li>
  <li><strong>Method:</strong> DELETE</li>
  <li><strong>Path Variable:</strong> employeeId (integer)</li>
  <li><strong>Response:</strong> Deletion confirmation message</li>
</ul>
