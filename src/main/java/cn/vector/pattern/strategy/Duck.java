package cn.vector.pattern.strategy;

/**
 * 超类，所有鸭子都要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 8:57
 */
public abstract class Duck {
    private FlyingStragety flyingStragety;
    /**
     * 鸭子发出叫声
     * 通用行为，有超类实现
     */
    public void quack(){
        System.out.println("--嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观
     * 鸭子的外观各不相同，声明为abstract, 由子类实现
     */
    public abstract void display();

    /**
     * 让鸭子飞起来
     */
    public void fly(){
        flyingStragety.performFly();
    }

    public FlyingStragety getFlyingStragety() {
        return flyingStragety;
    }

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }
}
