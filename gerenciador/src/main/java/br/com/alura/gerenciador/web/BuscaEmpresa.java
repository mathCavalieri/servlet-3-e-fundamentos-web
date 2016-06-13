package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class BuscaEmpresa implements Tarefa{

	public BuscaEmpresa() {
	}
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
String filtro = request.getParameter("filtro");
		
		EmpresaDAO empresaDAO = new EmpresaDAO();
		Collection<Empresa> buscaPorSimilaridade = empresaDAO.buscaPorSimilaridade(filtro);
		
		request.setAttribute("empresas", buscaPorSimilaridade);
		return "/WEB-INF/paginas/buscaEmpresa.jsp";
	}
}
