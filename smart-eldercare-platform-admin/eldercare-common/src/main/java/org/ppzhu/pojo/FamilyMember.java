package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 家属详情信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyMember {

  private Long familyId;
  private Long userId;
  private String familyName;
  private Long age;
  private String gender;
  private String familyPhone;
  private String familyEmail;
  private String addressProvince;
  private String addressCity;
  private String addressDetail;
  private String maritalStatus;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
