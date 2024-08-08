import java.util.*;

public class MethodsForImplementation implements MethForImplement {

    public void selectOddOnes(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
    }


    public void presentEvenOnesInOrder(List<Integer> nums1) {
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
    }


    public void annualRepetitions(List<String> uniqueWords) {
        Set<String> uniqueWordsSet = new HashSet<>();
        for (int i = 0; i < uniqueWords.size(); i++) {
            uniqueWordsSet.add(uniqueWords.get(i));
        }
        System.out.println(uniqueWordsSet);
    }


    public void calculateDuplications(List<String> strings) {
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