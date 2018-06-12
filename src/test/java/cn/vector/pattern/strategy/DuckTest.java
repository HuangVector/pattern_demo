package cn.vector.pattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:49
 */
public class DuckTest {
    @Test
    public void test(){
        System.out.println("开始测试鸭子程序");
        Duck duck = null;
        //duck = new MallardDuck();
        duck = new RedheadDuck();
        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("鸭子程序测试结束");
    }
}