package br.com.portalweb.dao.impl;

import java.util.List;

import br.com.portalweb.dao.generic.DAOBase;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraIdss;

public interface CadOperadoraIdssDAO extends DAOBase<CadOperadoraIdss, Long>{

	public List<CadOperadoraIdss> listaIdssOperadora(CadOperadora cadOperadora) throws DAOException;
	
}
