package chapter01Array;

public class BinarySearch {
    /**
     * 二分查找算法
     *
     * @param nums   数组
     * @param target 要查找的元素
     * @return 元素的索引，如果不存在，返回 -1
     */
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchViolence(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // 找到数组中指定的元素的索引
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 32, 33, 34, 35, 36, 37, 38, 3956};
        int index1 = searchViolence(arr, 11);
        int index2 = search(arr, 11);
        System.out.println(index1);
        System.out.println(index2);
    }
}
