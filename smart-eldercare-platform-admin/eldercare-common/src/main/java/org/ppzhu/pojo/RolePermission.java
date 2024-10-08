package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色权限
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePermission {

  private long rolePermissionId;
  private long permissionId;
  private long roleId;
  private long createdBy;
  private java.sql.Timestamp createdAt;
  private long updatedBy;
  private java.sql.Timestamp updatedAt;

}
