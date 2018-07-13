package net.bemy.dao;

import net.bemy.model.User;

public interface UserDetailsDao {

	User findUserByUsername(String username);
}
