package org.generation.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.generation.app.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//STEP 5 Convertir un tipo User a UserDetails
public class UserDetailsImpl implements UserDetails {

	private User user;
	
	public UserDetailsImpl( User user ) {
		this.user = user;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<>();		
		authorities.add(  new SimpleGrantedAuthority( "ROLE_"+this.user.getRole().getName() ));
		// authorities.add(  new SimpleGrantedAuthority( "ROLE_ADMIN" ));
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.user.isActive();
	}
	
	public String fullName() {
		return this.user.getFirstName() +  " " + this.user.getLastName();
	}

}
