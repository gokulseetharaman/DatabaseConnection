package com.login.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.login.demo.entity.UserEntity;
import com.login.demo.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositaryTests {

	@Autowired
	private UserRepository repo;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void testCreateUser() {
		UserEntity user = new UserEntity();
		user.setEmail("gokul_7803g2@gmail.com");
		user.setFirstname("Gokul");
		user.setLastname("Seetharaman");
		user.setPhonenumber("6382902691");
		user.setPassword("goookulll");

		UserEntity savedUser = repo.save(user);

		UserEntity exixtUser = entityManager.find(UserEntity.class, savedUser.getId());

		assertThat(exixtUser.getEmail()).isEqualTo(user.getEmail());

	}
	@Test
	public void testFindUserByEmail () {
		String email = "gokulgsj2003@gmail.com";
		
		UserEntity user = repo.findByEmail(email);
		
		assertThat(user).isNotNull();
	}

}
