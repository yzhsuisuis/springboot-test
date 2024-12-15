package cn.bugstack.config;

import cn.bugstack.model.MyBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 20:59
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(ConfigProperties.class)
public class AppConfig {
    /*
    * 如果一dev启动的话, 在myservice里期待的时获取得到bean1 ,由于有@Profile的限制,会导致直接找不到这个bean报错
    *
    * */
    @Bean(name = "bean1")
    // @Profile("prod")
    @ConditionalOnProperty(value = "ltzf.sdk.config.enabled", havingValue = "true", matchIfMissing = false)
    public MyBean myBean1()
    {
        return new MyBean("bean1","I am bean1");
    }

    @Bean(name = "bean2")
    @Profile("dev")
    public MyBean myBean2()
    {
        return new MyBean("bean2","I am bean2");
    }


    /*
    * 1. 见上面的enableConfigurationProerties
    * 2. 这里返回的一个person ,被下面的bean给完美的接住了
    * */
    @Bean(name = "makeperson")
    public Person makePerson(ConfigProperties configProperties)
    {
        log.info("配置是: {}",configProperties);
        return new Person(configProperties.getName(),
                configProperties.getAddress(),
                configProperties.getAge());
    }

    @Bean(name = "person")
    public int Person(Person person)
    {
        log.info("大加号: {}",person);
        //总结经验,bean的返回类型不能为空
        return 1;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Person {

        private String name;
        private String address;
        private String age;

    }




}
