package cn.bugstack.service.impl;

import cn.bugstack.service.IEating;
import org.springframework.stereotype.Component;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 23:19
 */
@Component("cookie")
public class EatingCookie implements IEating {
    @Override
    public void eat() {
        System.out.println("我吃曲奇");
    }
}
