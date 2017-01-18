package com.example.springapi.service;

import com.example.springapi.entity.Title;
import com.example.springapi.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author manhnt
 */

@Service("userService")
public class DummyUserServiceImpl implements UserService {
	public User getUserById(String id) {
		return new User("wa", "Wazi", "Armstrong", Title.MR);
	}
}
