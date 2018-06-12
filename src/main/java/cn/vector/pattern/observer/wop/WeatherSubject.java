package cn.vector.pattern.observer.wop;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-11 16:36
 */
public abstract class WeatherSubject {
    //用来保存注册的观察者对象
    public List<Observer> observers = new ArrayList<>();

    //attach detach abstract notifyObservers
    //把订阅天气的人/观察者添加到订阅列表中
    public void attach(Observer observer){
        observers.add(observer);
    }
    //删除集合中指定的订阅天气
    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObservers();
}
