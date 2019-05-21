package com.company.create;

public class LambadaTest01 {
    //内部类
    static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("i like lambada2");
        }
    }
    public static void main(String[] args) {
        Ilike like = new Like();//必须有类继承接口才能实例化
       // like.lambda();
        like = new Like2();
        like.lambda();
        //匿名内部类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("I like  lamhda3");
            }
        };
        //lambda
        like=()->{
            System.out.println("i like lambda3");
        };
        like=()-> System.out.println("i like lambda4");
    }
}
interface Ilike{
    void lambda();
}
class Like implements Ilike{
    @Override
    public void lambda() {
        System.out.println("i  like  lambda");
    }
}