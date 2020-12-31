package com.nick;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Person p= new Person();
        p.Hello();


    /*
    PSVM 加上Tab等同於 public static void main(String[] args)
    */


    /* Output Hello World字串,預計回傳 "Hello World"
      System.out.println("Hello World");
    */


    /*
    SOUT 加上Tab等同於 System.out.println
     */

    /* 呼叫Person方法下的Hello回傳,預計回傳 "Hello main way"
            new Person().Hello();

     */

     /* 呼叫Person方法並傳至p ,預計p會回傳 "Hello main way"
        Person p = new Person();
        p.Hello();
      */

    }
}
