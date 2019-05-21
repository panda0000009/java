package com.company.create;

public class LambadaTest03 {
    //内部类
    public static void main(String[] args) {
       IInterest interest = (int a1,int a2) -> {
            System.out.println("i  like  lambda-->"+a1+a2);
            return a1+a2;
        };
       interest.lambda(100,200);
/////////////////////////////
        interest = (int a1,int a2) -> {
            System.out.println("i  like  lambda-->"+a1+a2);
            return a1+a2;
        };
        interest.lambda(10,20);
//////////////////////
        interest = (a1, a2) -> {
            System.out.println("i  like  lambda-->"+a1+a2);
            return a1+a2;
        };
        interest.lambda(1,2);
//////////////////////
                interest = (a1,a2) ->{
                    return a1+a2;
                };



                interest = (a1,a2) -> a1+a2;

                interest = (a1,a2) ->100;
                System.out.println(interest.lambda(11,22));







    }
    }

interface IInterest{
   int lambda(int a,int b);
}

class Interest implements IInterest{
    @Override
    public int lambda(int a1,int a2) {
        System.out.println("i  like  lambda-->"+a1+a2);
        return a1+a2;
    };
}