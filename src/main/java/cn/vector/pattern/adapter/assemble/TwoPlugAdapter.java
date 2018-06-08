package cn.vector.pattern.adapter.assemble;

import cn.vector.pattern.adapter.GBTwoPlug;
import cn.vector.pattern.adapter.ThreePlugIf;

/**
 * 二相转三相的插座适配器
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-5 8:02
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;
    public TwoPlugAdapter(GBTwoPlug two) {
        this.plug = two;
    }

    @Override
    public void powerWithThree() {
        System.out.println("借助组合方式适配器转化");
        plug.powerWithTwo();
    }
}
