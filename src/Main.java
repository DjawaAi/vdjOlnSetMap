import java.util.*;

public class Main {
    public static void main(String[] args) {
        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
            //else { System.out.println("В этой последовательности только чётные числа");}
        }

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<Integer> nums1 = new ArrayList<>(List.of(22, 1, 8, 1, 9, 2, 3, 10, 4, 8, 4, 5, 2, 2, 5, 6, 99, 22, 7, 12));
        List<Integer> nums2 = new ArrayList<>();
        Set<Integer> nums3 = new LinkedHashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 0) {
                nums2.add(nums1.get(i));
            }
        }
        System.out.println(nums2);
        while (nums2.size() >= 1) {
            Integer val = nums2.get(0);
            for (int i = 0; i < nums2.size(); i++) {
                if (nums2.get(i) < val) {
                    val = nums2.get(i);
                }
            }
            nums3.add(val);
            nums2.remove((Integer) val);
        }
        System.out.println(nums3);

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<String> uniqueWords = new ArrayList<>(List.of("дом", "свая", "колокол", "лыжи", "цоколь", "щука", "колокол", "свая", "лыжи", "цоколь"));
        Set<String> uniqueWordsSet = new HashSet<>();
        for (int i = 0; i < uniqueWords.size(); i++) {
            uniqueWordsSet.add(uniqueWords.get(i));
        }
        System.out.println(uniqueWordsSet);

        System.out.println();
        System.out.println("Задача № " + (++dZ));
        System.out.println();

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> str = new LinkedHashSet<>();
        //String[] numberDubl = new String[]{};
        Map<String, Integer> numberDubl = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            str.add(strings.get(i));
        }
        for (String val : str) {
            Integer n = 0;
            for (int i = 0; i < strings.size(); i++) {
                if (val.equals(strings.get(i))) {
                    n++;
                    numberDubl.put(val, n);
                }
            }
        }
        System.out.println(numberDubl);
    }
}