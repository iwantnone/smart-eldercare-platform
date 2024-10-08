package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Long userId;
  private String username;
  private String password;
  private String email;
  private String phone;
  private String isActive;
  private String remark;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

  private List<Role> roles;


}
