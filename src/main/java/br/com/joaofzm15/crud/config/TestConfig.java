package br.com.joaofzm15.crud.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.joaofzm15.crud.entities.Category;
import br.com.joaofzm15.crud.entities.Order;
import br.com.joaofzm15.crud.entities.User;
import br.com.joaofzm15.crud.entities.enums.OrderStatus;
import br.com.joaofzm15.crud.repositories.CategoryRepository;
import br.com.joaofzm15.crud.repositories.OrderRepository;
import br.com.joaofzm15.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yusaku Fujiki", "playmaker@gmail.com", "(11)9999-1234", "hardPassword");
		User u2 = new User(null, "LeBum Blames", "kingjames@yahoo.com", "(31)9999-1234", "1234");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		
		Category c1 = new Category(null, "Key");
		Category c2 = new Category(null, "Sport Ball");
		Category c3 = new Category(null, "Smartphone");

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
	}

}
