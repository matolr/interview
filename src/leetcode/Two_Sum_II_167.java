package leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/3/30
 * 167. 两数之和 II - 输入有序数组
 * 题目描述：
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 请注意，返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入都只有一个解决方案，而且你不会重复使用相同的元素。
 * 示例：
 * 输入：数组 = {2, 7, 11, 15}, 目标数 = 9
 * 输出：index1 = 1, index2 = 2
 */
public class Two_Sum_II_167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int temp = numbers[l] + numbers[r];
            if (temp == target) {
                return new int[]{l+1, r+1};
            } else if (temp < target) {
                l++;
            } else {
                r--;
            }
        }
        return null;
    }
}
