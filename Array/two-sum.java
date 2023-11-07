// Given an array of integers, return the indices of two numbers that add up to a given target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int p1 = 0; p1 < nums.length; p1++) {
            int numToFind = target - nums[p1];

            for (int p2 = p1+1; p2 < nums.length; p2++) {
                if (numToFind == nums[p2]) {
                    return new int[] {p1, p2}; 
                }
            }
        }
        return null;
    }
}

// Second Way

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int p = 0; p < nums.length; p++) {
            Integer currentMapVal = numsMap.get(nums[p]);

            if (currentMapVal != null && currentMapVal >= 0) {
                return new int[] {currentMapVal, p};
            }

            else {
                int numsToFind = target - nums[p];
                numsMap.put(numsToFind, p);
            }
        }
        return null;
    }
}