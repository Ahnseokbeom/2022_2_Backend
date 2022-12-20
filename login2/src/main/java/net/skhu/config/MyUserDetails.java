package net.skhu.config;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;
import net.skhu.entity.User;

@Data
public class MyUserDetails implements UserDetails {
	private static final long serialVersionUID = 1L;
	final boolean accountNonExpired = true;
	final boolean accountNonLocked = true;
	final boolean credentialsNonExpired = true;
	final String password;
	final String username;
	final boolean isEnabled;
	Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
	User user;

	public MyUserDetails(User user) {
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		if (user.getRoles() != null) {
			String[] roles = user.getRoles().split(" +");
			for (String role : roles)
				if (role.length() > 1)
					authorities.add(new SimpleGrantedAuthority(role));
		}
		this.username = user.getLoginName();
		this.password = user.getPassword();
		this.isEnabled = user.isEnabled();
		this.user = user;
	}
}