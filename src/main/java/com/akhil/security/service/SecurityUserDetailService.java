package com.akhil.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.akhil.security.model.User;
import com.akhil.security.repository.MySqlRepository;

@Service
public class SecurityUserDetailService implements UserDetailsService {

	@Autowired
	private MySqlRepository repository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		User user = repository.findByName(name);

		if (user == null) {
			throw new UsernameNotFoundException("Invalid User");
		}

		return new UserAccess(user);
	}

}
