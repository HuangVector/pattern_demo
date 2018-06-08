package cn.vector.pattern.singleton;

/**
 * 单例懒汉模式
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-6 8:07
 */
public class Singleton02 {
    /**
     * 1.将构造方法私有化，不允许外部创建对象实例
     */
    private Singleton02(){

    }
    /**
     * 2.创建类的唯一实例，使用private static
     */
   private static Singleton02 instance ;

    /**
     * 3.提供一个用于获取实例的方法,使用public static
     */
    public static Singleton02 getInstance(){
        if(instance == null){
            System.out.println("run:"+Thread.currentThread().getStackTrace()[1].getClassName()+"|"+Thread.currentThread().getStackTrace()[1].getMethodName());
            instance = new Singleton02();
        }
        return instance;
    }
}
