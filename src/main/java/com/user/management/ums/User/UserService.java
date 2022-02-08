package com.user.management.ums.User;

import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  void saveUser(User user);

  User getUserById(Long userId);

  void updateUser(User user, Long userId);
  
}
