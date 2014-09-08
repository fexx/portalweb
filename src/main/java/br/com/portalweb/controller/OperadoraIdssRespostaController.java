package br.com.portalweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.portalweb.dao.impl.OperadoraRespostaIdssDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadoraIdss;
import br.com.portalweb.model.OperadoraRespostaIdss;

@Controller
@RequestMapping("/cadOperadoraIdssResposta")
public class OperadoraIdssRespostaController {

	@Autowired
	private OperadoraRespostaIdssDAO operadoraIdssRespostaDAO;
	
	@Transactional
	@RequestMapping(value = "/operadoraIdssResposta", method = RequestMethod.POST , headers = {"content-type=application/json"})
	public @ResponseBody List<OperadoraRespostaIdss> operadoraIdss(@RequestBody CadOperadoraIdss operadoraIdssVal) throws DAOException {
		List<OperadoraRespostaIdss> operadoraIdssLista = operadoraIdssRespostaDAO.listaCadOperadoraRespostas(operadoraIdssVal);
		return operadoraIdssLista;
		
	}	
	

	@Transactional
	@RequestMapping(value = "/editarCadOperadoraIdssRespostas", method = RequestMethod.PUT, headers = {"content-type=application/json"})
	public @ResponseBody void editarCadOperadoraIdssResposta(@RequestBody List<OperadoraRespostaIdss> operadoraIdssRespostas) throws DAOException {
		//cadOperadoraIdssDAO.update(operadoraIdss);
		
		if (!operadoraIdssRespostas.isEmpty()){
			
			for (OperadoraRespostaIdss resposta : operadoraIdssRespostas){
				operadoraIdssRespostaDAO.update(resposta);
			}
			
		}
		
	}
	
}
