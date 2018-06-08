package cn.vector.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-6 8:37
 */
public class SingletonTest {
    @Test
    public void test(){
        /**
         * 饿汉模式
         */
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        Assert.assertEquals(s1,s2);
        /**
         * 懒汉模式
         */
        Singleton02 s3 = Singleton02.getInstance();
        Singleton02 s4 = Singleton02.getInstance();
        Assert.assertEquals(s3,s4);
    }

}