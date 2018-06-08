package cn.vector.pattern.template;

/**
 * 具体子类，提供咖啡制备的具体实现
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-7 17:11
 */
public class Coffee extends RefreshBeverage{
    @Override
    protected void brew() {
        System.out.println("-用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("-加入糖和牛奶");
    }
}
