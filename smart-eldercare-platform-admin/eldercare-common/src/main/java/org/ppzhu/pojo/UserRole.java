package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

  private Long userRoleId;
  private Long userId;
  private Long roleId;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
