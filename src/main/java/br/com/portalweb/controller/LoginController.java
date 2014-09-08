package br.com.portalweb.controller;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.portalweb.dao.UsuarioDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.Usuario;
import br.com.portalweb.utils.SHA;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private SHA sha;
	
	
	@RequestMapping("/login/usuario")
	public void usuario(Usuario usuario) throws NoResultException, IllegalArgumentException, AuthenticationException, DAOException{
		Usuario usuarioBD = usuarioDAO.buscaPorEmail(usuario.getEmail());
		
		
		if(usuarioBD != null){
				if(sha.matches(usuarioBD.getSenha(), usuario.getSenha())){
					
				}
			
		}else{
			
		}
	}
	

}
