/*You have two IntStream's. The first stream contains even numbers and 
the second stream contains odd numbers. In this task, you should implement a 
method that filters numbers from both streams which are divisible by both 3 and 5. 
You should return a third stream which contains the filtered numbers from both input
 streams by sorting them and removing the first two numbers (the two smallest numbers).

You need to return a prepared IntStream from a template method, not a list of integers.
Pay attention to the method template. Do not change the signature of this method.
Sample Input 1:

1 2 3 4 
Explain code
Sample Output 1:

[]
Explain code
Sample Input 2:

30 75 60 90
Explain code
Sample Output 2:

[75, 90]*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class FilterNumbers {

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)  
                        .filter(num -> num % 15 == 0)  
                        .sorted() 
                        .skip(2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(values)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(x -> x)
                .toArray();

        int[] oddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(x -> x)
                .toArray();

        IntStream filteringStream = createFilteringStream(
                Arrays.stream(evenNumbers),
                Arrays.stream(oddNumbers));

        System.out.println(filteringStream.boxed().collect(Collectors.toList()));
        scanner.close();
    }
}

