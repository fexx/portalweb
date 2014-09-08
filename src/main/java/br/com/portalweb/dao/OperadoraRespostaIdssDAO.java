package br.com.portalweb.dao;

import java.util.List;

import br.com.portalweb.model.CadOperadoraIdss;
import br.com.portalweb.model.OperadoraRespostaIdss;

public interface OperadoraRespostaIdssDAO extends DAO<OperadoraRespostaIdss, Long>{

	public List<OperadoraRespostaIdss> listaCadOperadoraRespostas(CadOperadoraIdss cadOperadoraIdss);
	
}
