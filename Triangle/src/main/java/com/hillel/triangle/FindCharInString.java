package com.hillel.triangle;

public class FindCharInString {

  public static int count(String str, char ch) {

    int result = 0;

    for (int i = 0; i < str.length(); i++) {

      if (str.charAt(i) == ch) {
        result++;
      }

    }
     return result;
  }
}
