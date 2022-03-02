package br.com.joaofzm15.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.joaofzm15.crud.entities.User;
import br.com.joaofzm15.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yusaku Fujiki", "playmaker@gmail.com","(11)9999-1234", "hardPassword");
		User u2 = new User(null, "LeBum Blames", "kingjames@yahoo.com","(31)9999-1234", "1234");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}
