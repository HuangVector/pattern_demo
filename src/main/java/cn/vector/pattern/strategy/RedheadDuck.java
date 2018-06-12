package cn.vector.pattern.strategy;

import cn.vector.pattern.strategy.impl.FlyWithWing;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:25
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super();
        super.setFlyingStragety(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("--我的头是红色的");
    }
}
