package br.com.portalweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.CadOperadoraInfoDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraInfo;

@Controller
@RequestMapping("/cadOperadoraInfo")
public class CadOperadoraInfoController  {

	@Autowired
	private CadOperadoraInfoDAO cadOperadoraInfoDAO;
	
	@Transactional
	@RequestMapping(value = "/operadoraInfo", method = RequestMethod.POST , headers = {"content-type=application/json"})
	public @ResponseBody CadOperadoraInfo operadoraInfo(@RequestBody CadOperadora operadoraVal) throws DAOException {
		CadOperadoraInfo operadoraInfo = cadOperadoraInfoDAO.getCadOperadoraInfoAtivo(operadoraVal);
		return operadoraInfo;
		
	}	

	@Transactional
	@RequestMapping(value = "/editarCadOperadoraInfo", method = RequestMethod.PUT, headers = {"content-type=application/json"})
	public @ResponseBody void editarCadOperadora(@RequestBody CadOperadoraInfo operadoraInfo) throws DAOException {
		cadOperadoraInfoDAO.update(operadoraInfo);
	}
	
}
