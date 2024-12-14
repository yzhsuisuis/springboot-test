package cn.bugstack.config;

import cn.bugstack.model.MyBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 20:59
 */
@Configuration
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

    @Bean
    public MyBean primaryBean() {
        return new MyBean();
    }
    @Bean
    public MyBean secondaryBean() {
        return new MyBean();
    }

}
