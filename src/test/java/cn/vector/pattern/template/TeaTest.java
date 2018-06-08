package cn.vector.pattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-7 17:23
 */
public class TeaTest {
    @Test
    public void test(){
        System.out.println("制备茶...");
        RefreshBeverage refreshBeverage = new Tea();
        refreshBeverage.prepareBeverageTemplate();
        System.out.println("茶好了！");
    }
}