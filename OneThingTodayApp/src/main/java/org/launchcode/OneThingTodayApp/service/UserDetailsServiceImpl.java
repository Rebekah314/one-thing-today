package org.launchcode.OneThingTodayApp.service;

import org.launchcode.OneThingTodayApp.models.Member;
import org.launchcode.OneThingTodayApp.util.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private CustomPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Member member = new Member();
		
		//hard-coding a user to return (for now) [TODO update this]
		member.setDisplayName(username);
		member.setPassword(passwordEncoder.getPasswordEncoder().encode("rebekah"));
		member.setId(1L);
		
		return member;
	}
	
	

}
