/**
 * 单例模式
 * 单例的懒汉模式和饿汉模式区别
 * 区别：
 *   饿汉模式的特点是加载类时比较慢，但运行时获取对象速度比较快，线程安全
 *   懒汉模式的特点是加载类时比较快，但运行时获取对象速度比较慢，线程不安全的
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-6 8:07
 */
package cn.vector.pattern.singleton;