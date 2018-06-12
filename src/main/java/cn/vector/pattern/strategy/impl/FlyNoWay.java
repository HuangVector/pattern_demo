package cn.vector.pattern.strategy.impl;

import cn.vector.pattern.strategy.FlyingStragety;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:56
 */
public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
