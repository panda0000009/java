package com.company.create;

public class LambadaTest02 {
    //内部类
    public static void main(String[] args) {
        Ilove love = (int a) ->{
            System.out.println("i like lambda__>"+a);
        };
        love.lambda(100);
        //简化
        love = (a) -> {
            System.out.println("i like lambda-->"+a);
        };
        love.lambda(50);

         love = a -> {
             System.out.println("i like lambda-->"+a);
         };
        love.lambda(5);

        love = a ->
            System.out.println("i like lambda-->"+a);
        love.lambda(1);




    }
    }

interface Ilove{
    void lambda(int a);
}

class Love implements Ilove{
    @Override
    public void lambda(int a) {
        System.out.println("i  like  lambda-->"+a);
    };
}