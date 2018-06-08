package cn.vector.pattern.observer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-8 15:00
 */
public class ConcreteSubject extends Subject{
    //目标对象的状态
    private String subjectState;

    public String getSubjectState(){
        return subjectState;
    }
    public void setSubjectState(){
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
