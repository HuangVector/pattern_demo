package cn.vector.pattern.strategy;

import cn.vector.pattern.strategy.impl.FlyWithWing;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:03
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
        super.setFlyingStragety(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("--我的脖子是绿色的");
    }
}
