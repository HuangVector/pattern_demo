package cn.vector.pattern.observer.javanative;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-11 15:35
 */
public class ConcreteObserver implements Observer {
    //观察者名称变量
    private String observerName;
    @Override
    public void update(Observable o, Object arg) {
        //第一种是推的方式
        System.out.println(observerName+"收到了消息，目标推送过来的是"+arg);
        //第二种是拉的方式
        System.out.println(observerName+"收到了消息，主动到目标对象中去拉，拉的内容是"
                +((ConcreteWeatherSubject)o).getContent());

    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
