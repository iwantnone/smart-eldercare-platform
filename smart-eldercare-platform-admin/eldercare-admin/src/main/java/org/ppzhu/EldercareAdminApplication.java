package org.ppzhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("org.ppzhu.mapper")
public class EldercareAdminApplication{
    public static void main(String[] args) {
        SpringApplication.run(EldercareAdminApplication.class,args);
    }
}
