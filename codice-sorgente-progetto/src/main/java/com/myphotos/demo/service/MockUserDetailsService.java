package com.myphotos.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MockUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (username.equals("admin") == false) {
			
			throw new UsernameNotFoundException(username + " not found");
		}
		
		return new UserDetails() {
			
			@Override
			public boolean isEnabled() {
				return true;
			}
			
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			
			@Override
			public String getUsername() {
				return username;
			}
			
			@Override
			public String getPassword() {
				return "{noop}admin";
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {

				List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
				authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
				
				return authorities;
			}
		};
	}

}
