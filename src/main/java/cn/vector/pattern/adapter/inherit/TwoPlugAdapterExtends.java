package cn.vector.pattern.adapter.inherit;

import cn.vector.pattern.adapter.GBTwoPlug;
import cn.vector.pattern.adapter.ThreePlugIf;

/**
 * 采用继承方式的插座适配器
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-5 8:25
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf{
    @Override
    public void powerWithThree() {
        System.out.println("借助继承式适配器转化");
        this.powerWithTwo();

    }
}
