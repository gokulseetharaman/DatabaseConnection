package com.login.demo.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.demo.entity.UserEntity;
import com.login.demo.repository.UserRepository;
import com.login.demo.userDetails.CustomUser;

public class UserServiceDetails implements UserDetailsService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity user = repo.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("user not found ");
		}
		return new CustomUser(user);
	}

}
