package br.com.portalweb.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.OperadoraRespostaIdssDAO;
import br.com.portalweb.model.CadOperadoraIdss;
import br.com.portalweb.model.OperadoraRespostaIdss;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("OperadoraRespostaIdssDAO")
public class JPAOperadoraRespostaIdss extends JPADAO<OperadoraRespostaIdss, Long> implements OperadoraRespostaIdssDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<OperadoraRespostaIdss> clazz;

	@Override
	protected Class<OperadoraRespostaIdss> getClazz() {
		return OperadoraRespostaIdss.class;
	}

	public List<OperadoraRespostaIdss> listaCadOperadoraRespostas(CadOperadoraIdss cadOperadoraIdss){		
		List<OperadoraRespostaIdss> lista = new ArrayList<OperadoraRespostaIdss>();
		
		TypedQuery<OperadoraRespostaIdss> jpql = this.manager.createQuery(" from " + OperadoraRespostaIdss.class.getSimpleName()
				+ " where operadoraIdss = :cadOperadoraIdssVal " , OperadoraRespostaIdss.class
			);
		jpql.setParameter("cadOperadoraIdssVal", cadOperadoraIdss);
		
		lista = jpql.getResultList();
		return lista;
	}
	
}
