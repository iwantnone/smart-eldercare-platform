package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 权限
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

  private Long permissionId;
  private String permissionName;
  private String permissionTag;
  private String description;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
