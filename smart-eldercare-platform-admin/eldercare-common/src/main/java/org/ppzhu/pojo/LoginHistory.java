package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录历史
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginHistory {

  private Long historyId;
  private Long userId;
  private java.sql.Timestamp loginTime;
  private String loginIpAddress;
  private String loginDevice;
  private Long createdBy;
  private java.sql.Timestamp createdAt;
  private Long updatedBy;
  private java.sql.Timestamp updatedAt;

}
