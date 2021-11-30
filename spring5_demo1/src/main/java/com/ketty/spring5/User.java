package com.ketty.spring5;

/**
 *  创建基础类对象
 *  spring的 ioc 概念 就是将创建对象的过程和注入属性的过程全程交给 ioc 容器
 *  通过 User对象的创建和 bean 的标签配置实现 对象的创建过程
 *  测试类中通过 ApplicationContext 的子类 ClassPathXmlApplicationContext 去加载配置文件
 *  然后通过空参构造器的调用过程实现对象的创建
 */
public class User {
    public String name;

    public void add() {
        System.out.println("add。。。。。。。。。。。。。。。");
    }

/*    //如果覆盖掉默认的空参构造器的话
      //那么通过bean1去创建对象的过程就会报异常，根据默认实现无法创建需要的对象
    public User(String name) {
        this.name = name;
    }*/
}
