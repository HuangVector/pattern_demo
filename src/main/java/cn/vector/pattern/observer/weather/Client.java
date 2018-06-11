package cn.vector.pattern.observer.weather;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-11 9:15
 */
public class Client {
    public static void main(String[] args){
        //1创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //2创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明的女朋友");
        observerGirl.setRemindThing("是我们的第一次约会，地点街心公园，不见不散哦");
        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("老妈");
        observerMum.setRemindThing("是一个购物的好日子，明天去天虹扫货");
        //3注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);
        //4目标发布天气
        weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
    }
}