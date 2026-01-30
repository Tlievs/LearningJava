package org.example;

public class Main {

    public static void main(String[] args) {
    }

    public boolean either24(int[] nums) {
        boolean twoTwosInTheRow = false;
        boolean twoFoursInTheRow = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                twoTwosInTheRow = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                twoFoursInTheRow = true;
            }
        }
        return twoTwosInTheRow ^ twoFoursInTheRow;
    }

    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean isValInNums = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                isValInNums = false;
            }
        }
        return isValInNums;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[i]) {
                continue;
            }
            if (Math.abs(nums1[i] - nums2[i]) <= 2) {
                counter++;
            }
        }
        return counter;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7) {
                if (i + 1 < nums.length && nums[i + 1] == 7) {
                    return true;
                }
                if (i + 2 < nums.length && nums[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean isOneFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                isOneFound = true;
                continue;
            }
            if (isOneFound && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean even = nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0;
            boolean odd = nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0;

            if (even || odd) {
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                counter++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return counter == 3;
    }
}