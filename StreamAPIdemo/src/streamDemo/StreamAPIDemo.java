package streamDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIDemo {

    public static void main(String[] args) {
        int nums[] = {9, 8, 7, 6, 5, 8};

        int minValue = IntStream.of(nums).min().getAsInt();
        System.out.println(minValue);
        System.out.println(IntStream.of(nums).distinct().count());

        int newArr[] = IntStream.of(nums).distinct().toArray();
        for (int i : newArr)
            System.out.println(i);

        List<Integer> newList = IntStream.of(nums)
                .distinct()
                .boxed() 
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
