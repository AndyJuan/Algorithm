/**
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式:使用的时候创建对象
 * 1.构造器私有化
 * 2、说明一个私有静态变量
 * 3、创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
 */

public class code_02_1_SingletonTest {

    private code_02_1_SingletonTest (){

    }
}

class Jvm{
    private  static Jvm instant = null;
    private  Jvm(){

    }
    public static Jvm getInstance1(){
        if(null == instant){
            instant = new Jvm();
        }
        return instant;
    }

    public static Jvm getInstance2(){
        if(null == instant){//双重检查提高效率
            synchronized (Jvm.class){
                if (null == instant) {//安全
                    instant = new Jvm();
                }
            }

        }
        return instant;
    }
}