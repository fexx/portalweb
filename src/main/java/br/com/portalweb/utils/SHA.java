package br.com.portalweb.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SHA implements PasswordEncoder{

	@Override
	public String encode(CharSequence senha) {
		 BCryptPasswordEncoder passwordEncoder   = new BCryptPasswordEncoder();
	        return passwordEncoder.encode(senha);
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		 return encodedPassword.equals(encode(rawPassword));
	}

}
