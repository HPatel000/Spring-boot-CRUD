package com.user.management.ums.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> getAllUsers() {
    
    return userRepository.findAll();
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
    
  }

  @Override
  public User getUserById(Long userId) {
    return userRepository.findById(userId).get();
  }

  @Override
  public void updateUser(User user, Long userId) {
    
    User oldUser = userRepository.getById(userId);
    oldUser.setEmail(user.getEmail());
    oldUser.setUsername(user.getUsername());

    userRepository.save(oldUser);
    
  }
  
}
