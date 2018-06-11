package cn.vector.pattern.observer.javanative;

import java.util.Observable;

/**
 * 天气目标的具体实现类
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-11 11:23
 */
public class ConcreteWeatherSubject extends Observable{
    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //天气情况有了，就要通知所有的观察者
        //注意在通知之前，在用Java中的Observer模式时候，下面这句话不可少
        this.setChanged();
        //然后主动通知，这里我们先用推的方式
        this.notifyObservers(content);
        //如果是拉的方式，我们就调用
        //this.notifyObservers();
    }
}
