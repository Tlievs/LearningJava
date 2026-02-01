package org.example;

import java.util.Arrays;

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
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
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
        for (int num : nums) {
            if (num == 1) {
                isOneFound = true;
                continue;
            }
            if (isOneFound && num == 2) {
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

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i > 0 && nums[i - 1] == 2) {
                    continue;
                }
                if (i >= nums.length - 1 || nums[i + 1] != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = i;
        }
        return result;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] post4(int[] nums) {
        int indexOf4 = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                indexOf4 = i;
                break;
            }
        }
        return Arrays.copyOfRange(nums, indexOf4 + 1, nums.length);
    }

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[pos] = nums[i];
                pos++;
            }
        }
        return result;
    }

    public int[] tenRun(int[] nums) {
        int indexOf10 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                indexOf10 = i;
            }
            if (indexOf10 != -1) {
                nums[i] = nums[indexOf10];
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int indexOf4 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexOf4 = i;
                break;
            }
        }
        return Arrays.copyOfRange(nums, 0, indexOf4);
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int startPos = 0;
        int endPos = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[startPos] = nums[i];
                startPos++;
            } else {
                result[endPos] = nums[i];
                endPos--;
            }
        }
        return result;
    }

    public int[] zeroMax(int[] nums) {
        int maxOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                maxOdd = Math.max(maxOdd, nums[i]);
            }
            if (nums[i] == 0) {
                nums[i] = maxOdd;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int posStart = 0;
        int posEnd = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[posStart] = nums[i];
                posStart++;
            } else {
                result[posEnd] = nums[i];
                posEnd--;
            }
        }
        return result;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        int pos = 0;
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result[pos] = "FizzBuzz";
                pos++;
                continue;
            }
            if (i % 5 == 0) {
                result[pos] = "Buzz";
                pos++;
                continue;
            }
            if (i % 3 == 0) {
                result[pos] = "Fizz";
                pos++;
                continue;
            } else {
                result[pos] = String.valueOf(i);
                pos++;
            }
        }
        return result;
    }
}