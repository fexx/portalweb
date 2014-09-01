package br.com.portalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.impl.CadOperadoraIdssDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraIdss;
import br.com.portalweb.model.CadOperadoraInfo;

@Controller
@RequestMapping("/cadOperadoraIdss")
public class CadOperadoraIdssController {

	@Autowired
	private CadOperadoraIdssDAO cadOperadoraIdssDAO;

	
	@Transactional
	@RequestMapping(value = "/operadoraIdss", method = RequestMethod.POST , headers = {"content-type=application/json"})
	public @ResponseBody List<CadOperadoraIdss> operadoraIdss(@RequestBody CadOperadora operadoraVal) throws DAOException {
		List<CadOperadoraIdss> operadoraIdssLista = cadOperadoraIdssDAO.listaIdssOperadora(operadoraVal);
		return operadoraIdssLista;
		
	}	

	@Transactional
	@RequestMapping(value = "/editarCadOperadoraIdss", method = RequestMethod.PUT, headers = {"content-type=application/json"})
	public @ResponseBody void editarCadOperadora(@RequestBody CadOperadoraIdss operadoraIdss) throws DAOException {
		cadOperadoraIdssDAO.update(operadoraIdss);
	}
	
}
