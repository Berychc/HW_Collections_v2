import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {

//        task_1();
//        task_2();
//        task_3();
//        task_4();

    }
    public static void task_1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void task_2() {
        Collections.sort(nums);

        int pNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != pNum) {
                System.out.println(num);
                pNum = num;
            }
        }
    }
    public static void task_3() {
        Set<String> uniWords = new HashSet<>(strings);
        System.out.println(uniWords);
    }
    public static void task_4() {
        Set<String> uniWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniWords.size());
    }
}