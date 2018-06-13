/**
 * 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 代理对象起到中介作用，可去掉功能服务或增加额外的服务。
 * 常见的几种代理模式
 * -1.远程代理（Remote Proxy）：为不同地理对象提供局域网代表对象
 * -2.虚拟代理（Virtual Proxy）：根据需要将资源消耗很大的对象进行延迟真正需要的时候进行创建
 * -3.保护代理（Protect Proxy）：控制用户的访问权限
 * -4.智能引用代理（Smart Reference Proxy)：提供对目标对象额外服务（实现功能叠加）,
 *     比如：增加日志处理；增加权限管理；增加方法运行时间处理等；
 *
 * 静态代理概念及实现
 * -智能引用代理的2种实现方式：（1）静态代理；（2）动态代理；
 * -静态代理：代理和被代理对象在代理之前是确定的。他们都实现相同的接口或者继承相同的抽象类。
 *    实现方法有2种：继承方式实现，聚合方式实现
 * -动态代理
 *    Java动态代理位于java.lang.reflect包下，一般住院涉及到一下两个类：
 *    （1）Interface InvocationHandler:该接口中仅定义了一个方法
 *          public object invoke(Object obj, Method method, Object[] args)
 *        在实际使用时，第一个参数obj一般指代理类， method是被代理的方法， args为该方法的参数数组。
 *        这个抽象方法在代理类中动态实现。
 *    （2）Proxy：该类即为动态代理类
 *          static Object newProxyInstance(ClassLoader loader,
 *                  Class[] interfaces, InvocationHandler h):返回代理类的一个实例，
 *          返回后的代理类可以当做被代理类使用（可使用代理类的在接口中声明国的方法）
 *        动态代理实现步骤：
 *        1.创建一个实现接口InvocationHandler的类， 它必须实现invoke方法
 *        2.创建被代理的类以及接口
 *        3.调用Proxy的静态方法， 创建一个代理类
 *          static Object newProxyInstance(ClassLoader loader,
 *                  Class[] interfaces, InvocationHandler h):返回代理类的一个实例
 *        4.通过代理调用方法
 *
 *
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-13 8:16
 */
package cn.vector.pattern.proxy;