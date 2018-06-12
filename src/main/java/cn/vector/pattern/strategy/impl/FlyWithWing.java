package cn.vector.pattern.strategy.impl;

import cn.vector.pattern.strategy.FlyingStragety;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:47
 */
public class FlyWithWing implements FlyingStragety{
    @Override
    public void performFly() {
        System.out.println("--振翅高飞");
    }
}
