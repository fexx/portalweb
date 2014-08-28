package br.com.portalweb.dao.impl;

import java.util.List;

import br.com.portalweb.dao.generic.DAOBase;
import br.com.portalweb.model.CadOperadoraIdss;
import br.com.portalweb.model.OperadoraRespostaIdss;

public interface OperadoraRespostaIdssDAO extends DAOBase<OperadoraRespostaIdss, Long>{

	public List<OperadoraRespostaIdss> listaCadOperadoraRespostas(CadOperadoraIdss cadOperadoraIdss);
	
}
