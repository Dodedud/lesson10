package com.hillel.triangle;

public class stringExample {

  public static  void main(String[] args){

    String str1 = "Hello";//создали объект
    String str2 = "Hello";//тот же объект
    String str3 = new String("Hello");//создали новый объект
    String str4 = str3.intern();//то же содержание(поискать сторку именно в pull(поле строк), а не в куче)


    System.out.println(str1 == str2);//true
    System.out.println(str1 == str3);//false
    System.out.println(str3 == str4);//false
    System.out.println(str1 == str4);//true

    System.out.println(str1.equals(str2));//сравнение символов в строке
  }

}
