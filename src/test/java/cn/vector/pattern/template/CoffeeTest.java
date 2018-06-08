package cn.vector.pattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-7 17:14
 */
public class CoffeeTest {
    @Test
    public void test(){
        System.out.println("制备咖啡...");
        RefreshBeverage refreshBeverage = new Coffee();
        refreshBeverage.prepareBeverageTemplate();
        System.out.println("咖啡好了！");
    }
}