package cn.bugstack.service;

import cn.bugstack.model.MyBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 21:04
 */
@Slf4j
@Service
public class MyService {
    private final MyBean myBean1;
    private final MyBean myBean2;

    //todo 这里如果有多个类型相同的bean,会触发@Qualifier来指明不同的bean
    public MyService(@Qualifier("bean1") MyBean bean1,@Qualifier("bean2") MyBean bean2 ) {
        this.myBean1 = bean1;
        log.info("注入的是:{}",bean1.getName());
        this.myBean2 = bean2;
        log.info("注入的是:{}",bean2.getName());

    }

}
