package br.com.portalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.CadOperadoraDAO;
import br.com.portalweb.dao.CadOperadoraIdssDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;

@Controller
@RequestMapping("/cadOperadora")
public class CadOperadoraController {

	@Autowired
	private CadOperadoraDAO cadOperadoraDAO;
	
	@Autowired
	private CadOperadoraIdssDAO cadOperadoraIdssDAO;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<CadOperadora> listarOperadora() throws DAOException {
		List<CadOperadora> listaCadOperadora = cadOperadoraDAO.list();
		
		return listaCadOperadora;
		
	}

	@Transactional
	@RequestMapping(value = "/editarCadOperadora", method = RequestMethod.PUT, headers = {"content-type=application/json"})
	public @ResponseBody void editarCadOperadora(@RequestBody CadOperadora operadora) throws DAOException {
		cadOperadoraDAO.update(operadora);
	}
	
}
