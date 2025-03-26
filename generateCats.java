/*You need to implement the generateNCats method to generate n identical cats. 
We are not kidding, we need exactly the same cats. You may ask why this might be useful, 
but this is a quite common situation when writing unit tests when you need objects with any 
values of their fields. This problem will be especially useful if you apply your knowledge of 
method / constructor references here.*/

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GenerateCats {

    public static List<Cat> generateNCats(int n) {
        // write your code here
        return Stream.generate(()->new Cat()).limit(n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cat> cats = generateNCats(scanner.nextInt());

        System.out.println(cats.size());
        scanner.close();
    }
}

class Cat {
    String name;
    int age;
}

