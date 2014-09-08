package br.com.portalweb.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.CrmPessoaDAO;
import br.com.portalweb.model.CrmPessoa;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("crmPessoaDAO")
public class JPACrmPessoa extends JPADAO<CrmPessoa, Long> implements CrmPessoaDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<CrmPessoa> clazz;

	@Override
	protected Class<CrmPessoa> getClazz() {
		return CrmPessoa.class;
	}
}
