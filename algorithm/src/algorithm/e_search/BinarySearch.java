package algorithm.e_search;

// 정렬된 자료구조를 대상으로만 사용할 수 있음
public class BinarySearch {

    public static void main(String[] args) {
        int target = 999;
        int[] nums = {1, 3, 5, 10, 165, 345, 456, 778, 990, 999, 1334, 2211, 5311};

        int index = binarySearch(nums, target);
        System.out.println(index);

    }

    private static int binarySearch(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length - 1;

        while (lp <= rp) {
            int center = (lp + rp) / 2;

            if (nums[center] == target) return center;

            if (target < nums[center]) {
                rp = center - 1;
            } else {
                lp = center + 1; // center ? center + 1?
            }
        }

        return 0;
    }

}
