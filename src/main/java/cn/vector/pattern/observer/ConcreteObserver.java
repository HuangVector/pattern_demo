package cn.vector.pattern.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-8 15:06
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    @Override
    /**
     * 获取目标类的状态同步到观察者的状态中
     */
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
