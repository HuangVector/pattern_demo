package cn.vector.pattern.singleton;

/**
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就足够
 * 作用保证整改应用程序中某个实例有且只有一个
 * 类型：饿汉模式和懒汉模式
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-5 22:00
 */
public class Singleton01 {
    /**
     * 1.将构造方法私有化，不允许外部创建对象实例
     */
    private Singleton01(){

    }
    /**
     * 2.创建类的唯一实例
     */
   private static Singleton01 instance = new Singleton01();

    /**
     * 3.提供一个用于获取实例的方法
     */
    public static Singleton01 getInstance(){
        return instance;
    }
}
