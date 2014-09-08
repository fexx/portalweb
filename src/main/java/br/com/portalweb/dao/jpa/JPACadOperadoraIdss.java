package br.com.portalweb.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.CadOperadoraIdssDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.CadOperadora;
import br.com.portalweb.model.CadOperadoraIdss;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("cadOperadoraIdssDAO")
public class JPACadOperadoraIdss extends JPADAO<CadOperadoraIdss, Long> implements CadOperadoraIdssDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<CadOperadoraIdss> clazz;

	@Override
	protected Class<CadOperadoraIdss> getClazz() {
		return CadOperadoraIdss.class;
	}

	public List<CadOperadoraIdss> listaIdssOperadora(CadOperadora cadOperadora) throws DAOException {
		
		List<CadOperadoraIdss> lista = new ArrayList<CadOperadoraIdss>();
		TypedQuery<CadOperadoraIdss> jpql = this.manager.createQuery(" from " + CadOperadoraIdss.class.getSimpleName()
				+ " where operadora = :cadOperadoraVal " , CadOperadoraIdss.class
			);
		jpql.setParameter("cadOperadoraVal", cadOperadora);
		
		lista = jpql.getResultList();
		return lista;
	}

	public CadOperadoraIdss idssOperadoraAtivo(CadOperadora cadOperadora) throws DAOException {
		
		CadOperadoraIdss cadOperadoraIdss = new CadOperadoraIdss();
		
		TypedQuery<CadOperadoraIdss> jpql = this.manager.createQuery(" from " + CadOperadoraIdss.class.getSimpleName()
				+ " where operadora = :cadOperadoraVal and status = :statusVal " , CadOperadoraIdss.class
			);
		jpql.setParameter("cadOperadoraIdssVal", cadOperadora);
		jpql.setParameter("statusVal", "ATIVO");
		
		cadOperadoraIdss = (CadOperadoraIdss)jpql.getSingleResult();
		
		return cadOperadoraIdss;
	}
	
}