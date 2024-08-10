import java.util.*;

public class Main {
    public static void main(String[] args) {

        // MethodsForImplementation methodsForImplementation = new MethodsForImplementation();
        MethForImplement methForImplement = new MethodsForImplementation();


        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        // methodsForImplementation.selectOddOnes(nums);
        methForImplement.selectOddOnes(nums);

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<Integer> nums1 = new ArrayList<>(List.of(22, 1, 8, 1, 9, 2, 3, 10, 4, 8, 4, 5, 2, 2, 5, 6, 99, 22, 7, 12));
        //methodsForImplementation.presentEvenOnesInOrder(nums1);
        methForImplement.presentEvenOnesInOrder(nums1);

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<String> uniqueWords = new ArrayList<>(List.of("дом", "свая", "колокол", "лыжи", "цоколь", "щука", "колокол", "свая", "лыжи", "цоколь"));
        //  methodsForImplementation.annualRepetitions(uniqueWords);
        methForImplement.annualRepetitions(uniqueWords);

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        //  methodsForImplementation.calculateDuplications(strings);
        methForImplement.calculateDuplications(strings);
    }
}