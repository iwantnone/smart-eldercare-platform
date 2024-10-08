package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户账户
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {

  private Long userAccountId;
  private Long userId;
  private Double accountBalance;
  private Long accountPoints;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
