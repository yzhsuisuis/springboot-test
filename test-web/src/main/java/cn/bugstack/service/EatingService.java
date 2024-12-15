package cn.bugstack.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 23:21
 */
@Service
public class EatingService {
   private final Map<String,IEating> map;

    public EatingService(Map<String, IEating> map) {
        this.map = map;
        System.out.println(map);
    }
}
