import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    private static void task4() {
        int[] nums = {3, 2, 5};
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 != 0 && index == nums.length - 1) {
                System.out.print(nums[index] + 1 + " ");
            } else if (nums[index] % 2 != 0 && index != nums.length - 1)
                System.out.print(nums[index] + 1 + ",");
               else { System.out.print(nums[index] + ",");
            }
        }
    }



    private static void task3() {
        {
            int[] nums = {1, 2, 3};
            for (int index = 2; index <= nums.length; index = index - 1) {
                if (index == nums.length - 3) {
                    System.out.print(nums[index]);
                    System.out.println();
                    break;
                }
                {
                    System.out.print(nums[index] + ",");
                }
            }
        }

        {
            double[] nums2 = {1.57, 7.64, 9.986};
            for (int index2 = 2; index2 < nums2.length; index2 = index2 - 1) {
                if (index2 == nums2.length - 3) {
                    System.out.print(nums2[index2]);
                    System.out.println();
                    break;
                }
                {
                    System.out.print(nums2[index2] + ",");
                }
            }
        }
        {
            int[] nums3 = new int[10];
            nums3[0] = 5;
            for (int index3 = 9; index3 <= nums3.length; index3 = index3 - 1) {
                if (index3 == nums3.length - 10) {
                    System.out.print(nums3[index3]);
                    System.out.println();
                    break;
                }
                {
                    System.out.print(nums3[index3] + ",");
                }
            }
        }
    }

    private static void task2() {
        int[] nums = new int[]{1, 2, 3};
            for (int index = 0; index <= nums.length; index = index + 1) {
                if (index == nums.length - 1) {
                    System.out.print(nums[index]);
                    System.out.println();
                    break;
                }
                {
                    System.out.print(nums[index] + ",");
                }
            }
            double[] nums2 = {1.57, 7.64, 9.986};
            {
                System.out.println(Arrays.toString(nums2));
            }
            int[] nums3 = new int[10];
            nums3[0] = 5;
            {
                System.out.println(Arrays.toString(nums3));
            }
        }


        private static void task1 () {
            int[] nums = new int[]{1, 2, 3};
            double[] nums2 = {1.57, 7.64, 9.986};
            int[] nums3 = new int[10];

        }
    }
