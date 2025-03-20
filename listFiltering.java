/*
 *n this kata you will create a function that takes a list of non-negative integers 
and strings and returns a new list with the strings filtered out.

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
*/

import java.util.*;

public class listFiltering {
    public static void main(String[] args){
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)));
    }
     public static List<Object> filterList(final List<Object> list) {
    List<Object> str=new ArrayList<>();
      for(Object value:list){
      if(value instanceof Integer){
        str.add(value);
      }
    };
    return str;
  }
}
