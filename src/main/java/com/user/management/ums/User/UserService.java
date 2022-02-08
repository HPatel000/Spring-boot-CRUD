package com.user.management.ums.User;

import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  void saveUser(User user);
  
}
