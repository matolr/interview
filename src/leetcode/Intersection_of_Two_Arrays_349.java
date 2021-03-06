package leetcode;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/5
 * 349. 两个数组的交集
 * 题目描述：
 * 给定两个数组，写一个函数来计算它们的交集。
 * 例子:
 * 给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
 * 提示:
 * 每个在结果中的元素必定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class Intersection_of_Two_Arrays_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1set.add(nums1[i]);
        }
        HashSet<Integer> nums2set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums1set.contains(nums2[i])) {
                nums2set.add(nums2[i]);
            }
        }
        int[] res = new int[nums2set.size()];
        int index = 0;
        for (Integer num : nums2set)
            res[index++] = num;
        return res;
    }
}
