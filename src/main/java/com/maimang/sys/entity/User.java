package com.maimang.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  private Long id;
  @NonNull private String userName;
  @NonNull private String password;
  private String role;
  private String permission;
  // 状态
  @TableField(exist = false)
  private String status;
}
