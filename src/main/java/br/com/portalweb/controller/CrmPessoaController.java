package br.com.portalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.CrmPessoaDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CrmPessoa;

@Controller
@RequestMapping("/crmPessoa")
public class CrmPessoaController {

	@Autowired
	private CrmPessoaDAO crmPessoaDAO;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<CrmPessoa> editarNome() throws DAOException {
		List<CrmPessoa> listaCrmPessoa = crmPessoaDAO.list();
		return listaCrmPessoa;
	}
	
}
