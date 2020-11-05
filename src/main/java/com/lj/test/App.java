package com.lj.test;

/**
 * 注解
 * 总结：注解本身可以加在类、属性、方法等上面，然后通过反射的方式去调用
 *
 */
@TestAnnotation(id=3,msg="hello annotation")
public class App extends AppParent
{
//    public static void main( String[] args )
//    {
//        new App().say(); //过时的话这里就变成斜杠了
//        System.out.println( "Hello World!" );
//
////        测试使用上述的注解
//        boolean hasAnnotation = App.class.isAnnotationPresent(TestAnnotation.class);
//        if (hasAnnotation) {
//            TestAnnotation testannotation = App.class.getAnnotation(TestAnnotation.class);
//            System.out.println("获取注解中的ID的值为："+testannotation.id());
//            System.out.println("获取注解中的msg的值为："+testannotation.msg());
//            //以上，用同样的方式也能获取Method方法上修饰的注解，Field属性上修饰的注解
//        }
//    }

    @Deprecated
    public void say(){
        System.out.println("测试过时的类，用来标注注解！");
    }

    @Override
    public void childMethod(){
        System.out.println("override用于提示子类复写父类的方法！");
    }

}

