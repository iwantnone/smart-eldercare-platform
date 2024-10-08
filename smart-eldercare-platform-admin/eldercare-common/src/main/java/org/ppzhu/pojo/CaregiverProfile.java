package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 护工详情
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaregiverProfile {

  private Long caregiverId;
  private String caregiverName;
  private Long caregiverAge;
  private String caregiverGender;
  private String caregiverQualification;
  private String specialization;
  private String caregiverHealth;
  private Long caregiverStars;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
