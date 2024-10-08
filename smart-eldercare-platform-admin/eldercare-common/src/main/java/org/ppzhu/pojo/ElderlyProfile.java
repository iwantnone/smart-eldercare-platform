package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 老人详情信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElderlyProfile {

  private Long elderlyId;
  private Long userId;
  private String elderlyName;
  private Long age;
  private String gender;
  private String maritalStatus;
  private String elderlyPhone;
  private String roomNumber;
  private String bedNumber;
  private String livabilityRatings;
  private String elderlyCondition;
  private String mentalState;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
