package br.edu.atitus.api_sample.services;

import br.edu.atitus.api_sample.entities.UserEntity;

public class UserService {
	
	public UserEntity save(UserEntity user) throws Exception {
		if (user == null)
			throw new Exception("Objeto não pode ser nulo");
		
		if (user.getName() == null || user.getName().isEmpty())
			throw new Exception("Nome Inválido");
		user.setName(user.getName().trim());
		
		
		if (user.getEmail() == null || user.getEmail().isEmpty())
			throw new Exception("E-mail inválido");
		user.setEmail(user.getEmail().trim().toLowerCase());
		// TODO validar o e-mail (texto@texto.texto) => utilize REGEX
		
		if (user.getPassword() == null 
				|| user.getPassword().isEmpty()
				|| user.getPassword().length() < 8)
			throw new Exception("Password inválido");
		// TODO validar a força da senha (Caracteres maiusculos, minisculos e numerais)
			
		if (user.getType() == null)
			throw new Exception("Tipo de usuário inválido");

	
	// TODO invocar método save da camda repository
		
		return user;
	}

}
