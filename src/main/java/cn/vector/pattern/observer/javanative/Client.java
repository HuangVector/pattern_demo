package cn.vector.pattern.observer.javanative;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-11 15:47
 */
public class Client {
    public static void main(String[] args){
        //创建天气作为一个目标，也可以说是被观察者
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建黄明的女朋友作为观察者
        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("黄明的女朋友");

        //创建黄明老妈作为观察者
        ConcreteObserver mum = new ConcreteObserver();
        mum.setObserverName("黄明的老妈");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mum);
        //目标更新天气情况了

        subject.setContent("天气晴，气温28度");


    }
}
