package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

  private Long roleId;
  private String roleName;
  private String description;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
