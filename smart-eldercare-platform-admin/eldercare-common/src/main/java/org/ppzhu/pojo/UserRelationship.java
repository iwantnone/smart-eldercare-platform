package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户关系
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRelationship {

  private Long relationshipId;
  private Long userId;
  private Long elderlyId;
  private String relationshipName;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
