package br.com.portalweb.dao;

import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraInfo;

public interface CadOperadoraInfoDAO extends DAO<CadOperadoraInfo, Long>{

	public CadOperadoraInfo getCadOperadoraInfoAtivo(CadOperadora cadOperadora);
	
}
