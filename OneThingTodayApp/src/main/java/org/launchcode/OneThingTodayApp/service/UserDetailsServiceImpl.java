package org.launchcode.OneThingTodayApp.service;

import org.launchcode.OneThingTodayApp.models.Member;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Member member = new Member();
		
		//hard-coding a user to return (for now) [TODO update this]
		member.setDisplayName(username);
		member.setPassword("rebekah");
		member.setId(1L);
		
		return member;
	}
	
	

}
