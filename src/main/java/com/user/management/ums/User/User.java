package com.user.management.ums.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long userId;
  @Column(name = "user_name", nullable = false)
  private String username;
  @Column(name="email", nullable = false)
  private String email;


  public User() {
  }

  public User(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public Long getUserId() {
    return this.userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User userId(Long userId) {
    setUserId(userId);
    return this;
  }

  public User username(String username) {
    setUsername(username);
    return this;
  }

  public User email(String email) {
    setEmail(email);
    return this;
  }

  @Override
  public String toString() {
    return "{" +
      " userId='" + getUserId() + "'" +
      ", username='" + getUsername() + "'" +
      ", email='" + getEmail() + "'" +
      "}";
  }

  
}
