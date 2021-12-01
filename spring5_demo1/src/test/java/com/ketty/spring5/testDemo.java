package com.ketty.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {

    @Test
    public void test1() {
//      通过beanFactory工厂创建和管理对象 手动创建工厂类 去加载 bean.xml 文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//      使用 context 加载 bean 对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test2() {
//      通过beanFactory工厂创建和管理对象 手动创建工厂类 去加载 bean.xml 文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//      使用 context 加载 bean 对象
//      这个加载的配置文件就是获取到bean中的id属性之
//      后面对象 class 对于加载对象的泛型
        Book book = context.getBean("book1", Book.class);
//      输出测试获取对象的内容，是否加载成功
//      其中 测试 property 标签是否注入属性对象 其中，property 通过set方法进行属性的注入
        System.out.println(book);
    }

    @Test
    public void test3() {
//      通过beanFactory工厂创建和管理对象 手动创建工厂类 去加载 bean.xml 文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//      使用 context 加载 bean 对象
//      这个加载的配置文件就是获取到bean中的id属性之
//      后面对象 class 对于加载对象的泛型
        Orders orders = context.getBean("orders", Orders.class);
//      输出测试获取对象的内容，是否加载成功
//      其中 测试 constructor-arg 标签是否注入属性对象其中，通过 带参构造器 进行属性的注入
        System.out.println(orders);
    }
}
