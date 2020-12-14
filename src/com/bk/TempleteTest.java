package com.bk;

import com.bk.bean.Custom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-14 20:37
 */
public class TempleteTest {

    //模板六 : prsf :可以生成 private static  final

    private static final Custom cus=new Custom();
    // psf  public static final
    public static final int NUM=1;
    //psfi  public static final int
    public static final int NUM2=2;
        //psfs     public static final String
    public static final String  NATION="china";




    // psvm  main 方法快捷键

    public static void main(String[] args) {

        //模板二 sout
        System.out.println("hello");
        //变形 soutp 输出方法的形参
        System.out.println("args = [" + args + "]");
        // soutm 输出方法的名字
        System.out.println("TempleteTest.main");

        // soutv

        int  num1=10;
        int  num2=20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //模板三 ：fori

        String [] arr = {"tom","jack"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形 iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //list.for

        List list =new ArrayList ();
            list.add(123);
            list.add(457);
            list.add(147);

        for (Object o : list) {
            
        }
        //list.fori

        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr 倒叙便利
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


        //模板五 :ifn
        if (list == null) {
            
        }

        // inn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }

        //xxx.nn

        if (list != null) {

        }




    }
}
