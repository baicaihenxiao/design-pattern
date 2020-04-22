package com.test.first_maven;

import java.util.HashMap;

public class Hello {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i != nums.length; ++ i) {
            if (h.containsKey(target - nums[i])) {
                return new int[]{h.get(target - nums[i]), i};
            } else {
                h.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No solution");
    }
}
