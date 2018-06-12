package cn.vector.pattern.strategy;

/**
 * 定义策略接口，实现鸭子飞飞行行为
 * （继承和抽象类方式实现“让鸭子飞”存在不足）
 *
 * 使用组合方法让鸭子飞起来
 * 将飞行行为抽象为接口，在父类中持有该接口，并由该接口代理飞行行为
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 9:36
 */
public interface FlyingStragety {
    void performFly();
}
