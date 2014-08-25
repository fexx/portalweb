package br.com.portalweb.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.impl.CadOperadoraDAO;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CrmPessoa;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("cadOperadoraDAO")
public class JPACadPessoa extends JPADAO<CadOperadora, Long> implements CadOperadoraDAO{

	@PersistenceContext
	private EntityManager manager;

	protected Class<CrmPessoa> clazz;

	@Override
	protected Class<CadOperadora> getClazz() {
		return CadOperadora.class;
	}
	
}
