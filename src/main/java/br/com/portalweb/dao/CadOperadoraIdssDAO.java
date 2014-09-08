package br.com.portalweb.dao;

import java.util.List;

import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraIdss;

public interface CadOperadoraIdssDAO extends DAO<CadOperadoraIdss, Long>{

	public List<CadOperadoraIdss> listaIdssOperadora(CadOperadora cadOperadora) throws DAOException;
	
	public CadOperadoraIdss idssOperadoraAtivo(CadOperadora cadOperadora) throws DAOException;
	
}
