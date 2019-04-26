package com.maimang.sys.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sys_user")
@RequiredArgsConstructor
public class User {
  @Id @GeneratedValue private Long id;
  @NonNull
  private String userName;
  @NonNull
  private String password;
  @NonNull
  private String role;
  @NonNull
  private String permission;
  @Transient private String notDb;
}
