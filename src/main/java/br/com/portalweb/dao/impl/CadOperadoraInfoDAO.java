package br.com.portalweb.dao.impl;

import br.com.portalweb.dao.generic.DAOBase;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraInfo;

public interface CadOperadoraInfoDAO extends DAOBase<CadOperadoraInfo, Long>{

	public CadOperadoraInfo getCadOperadoraInfoAtivo(CadOperadora cadOperadora);
	
}
