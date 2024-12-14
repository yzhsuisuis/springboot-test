package cn.bugstack;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 *@auther:yangzihe @洋纸盒
 *@discription:
 *@create 2024-12-14 20:39
 */
@Configurable
@SpringBootApplication
@RestController
@RequestMapping("/api/")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test()
    {
        return "恭喜你启动成功";
    }

}
