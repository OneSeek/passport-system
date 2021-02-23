<#import "/spring.ftl" as spring>
<html>
<h1>My Page</h1>
<h3>user name : ${name}</h3>
<ul>
<h3>my products</h3>
<#list products as product>
    <li>${product}</li>
</#list>
</ul>
<br>
<a href="/logout">Logout</a>
</html>