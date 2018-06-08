package cn.vector.pattern.adapter;


import cn.vector.pattern.adapter.assemble.TwoPlugAdapter;
import cn.vector.pattern.adapter.inherit.TwoPlugAdapterExtends;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-5 7:59
 */
public class NoteBook {
    private ThreePlugIf plug;
    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }
    public void charge(){
        plug.powerWithThree();
    }
    public static void main(String[] args){
        GBTwoPlug two = new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();
        System.out.println("...开始使用继承是适配器！");
        three = new TwoPlugAdapterExtends();
        nb = new NoteBook(three);
        nb.charge();
    }

}
