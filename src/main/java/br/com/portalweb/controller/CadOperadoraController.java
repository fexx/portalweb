package br.com.portalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.impl.CadOperadoraDAO;
import br.com.portalweb.dao.impl.CadOperadoraInfoDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraInfo;

@Controller
@RequestMapping("/cadOperadora")
public class CadOperadoraController {

	@Autowired
	private CadOperadoraDAO cadOperadoraDAO;

	@Autowired
	private CadOperadoraInfoDAO cadOperadoraInfoDAO;
	
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

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public @ResponseBody List<CadOperadoraInfo> teste() throws Exception {
		List<CadOperadoraInfo> listaCadOperadora = cadOperadoraInfoDAO.list();
		return listaCadOperadora;
		
	}	
}
