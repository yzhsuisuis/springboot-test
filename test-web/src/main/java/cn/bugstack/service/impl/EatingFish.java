package cn.bugstack.service.impl;

import cn.bugstack.service.IEating;
import org.springframework.stereotype.Component;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 23:20
 */
@Component("fish")
public class EatingFish implements IEating {
    @Override
    public void eat() {
        System.out.println("我要吃鱼");
    }
}
