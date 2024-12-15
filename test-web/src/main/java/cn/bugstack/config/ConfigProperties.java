package cn.bugstack.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 23:38
 */
@Data
@ConfigurationProperties(prefix = "person.sdk",ignoreInvalidFields = true)
public class ConfigProperties {
    private String name;
    private String address;
    private String age;
}
