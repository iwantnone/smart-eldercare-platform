package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 既往病史
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistory {

  private Long medicalHistoryId;
  private Long elderlyId;
  private String diseaseName;
  private String diagnosisDate;
  private String isCurrent;
  private String description;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
