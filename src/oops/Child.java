package oops;

public class Child extends Parent{
    public void m1(){
        System.out.println("Child M1()");
    }
    public static  void main(String[] args){
        Parent p =new Child();
        p.m1();
    }
}
