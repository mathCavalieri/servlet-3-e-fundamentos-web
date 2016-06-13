<html>
<head>
<style type="text/css">
	
	body{
		background-color:#54d;
		color: #fff;
		margin:10px;
		padding:10px;
	}

</style>
</head>
<body>
    Bem vindo ao nosso gerenciador de empresas!
<form action="fazTudo?tarefa=NovaEmpresa" method="post">
    Nome: <input type="text" name="nome" /><br />
    <input type="submit" value="Enviar" />
</form>

<form action="login" method="post">
    Email: <input type="text" name="email" /><br />
    Senha: <input type="password" name="senha" /><br />
    <input type="submit" value="Login" />
</form>

<form action="fazTudo?tarefa=Logout" method="post">
    <input type="submit" value="Logout" />
</form>

<br>

</body>
</html>