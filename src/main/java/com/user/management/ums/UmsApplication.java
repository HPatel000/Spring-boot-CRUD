package com.user.management.ums;

import com.user.management.ums.User.User;
import com.user.management.ums.User.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User("user1", "user1@email.com");
		User user2 = new User("user2", "user2@email.com");
		User user3 = new User("user3", "user3@email.com");
		User user4 = new User("user4", "user4@email.com");
		userRepository.saveAll(java.util.List.of(user1, user2, user3, user4));
		
	}

}
