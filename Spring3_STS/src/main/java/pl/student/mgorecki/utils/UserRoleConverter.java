package pl.student.mgorecki.utils;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.student.mgorecki.domain.UserRole;
import pl.student.mgorecki.service.UserService;

public class UserRoleConverter implements Converter<String, Set<UserRole>> {

	@Autowired
	UserService userService;
	
	@Override
	public Set<UserRole> convert(String source) {
		
		Set<UserRole> userRoleList = new HashSet<UserRole>(0);
		
			userRoleList.add(userService.getUserRole(Integer.parseInt(source)));
		
		return userRoleList;
	}

}
