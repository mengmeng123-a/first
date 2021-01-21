package com.itheima;

import com.itheima.dao.ItemsDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("spring_mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) act.getBean("itemsDao");
        System.out.println(itemsDao.findAll());
    }
}
