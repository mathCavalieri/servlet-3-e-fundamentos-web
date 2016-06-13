package br.com.alura.gerenciador.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa implements Tarefa{
	

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String nome = request.getParameter("nome");

		EmpresaDAO dao = new EmpresaDAO();
		Empresa empresa = new Empresa(nome);
		dao.adiciona(empresa);
		
		request.setAttribute("nome", empresa.getNome());
		return "/WEB-INF/paginas/novaEmpresa.jsp";
	}

}
