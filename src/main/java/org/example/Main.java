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

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b || b == c || a == c) {
            if (a == b) {
                return c;
            } else if (b == c) {
                return a;
            } else {
                return b;
            }
        }
        return a + b + c;
    }

    public int luckySum (int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen (int number) {
        return (number >= 13 && number <= 19 && number != 15 && number != 16) ? 0 : number;
    }

    public int roundSum(int a, int b, int c) {
        return roundNumber(a) + roundNumber(b) + roundNumber(c);
    }

    public int roundNumber(int number) {
        return ((number + 5) / 10) * 10;
    }

    public boolean closeFar(int a, int b, int c) {
        return (isClose(a, b) && isFar(c, a, b)) || (isClose(c, a) && isFar(b, a, c));
    }

    public boolean isClose(int a, int b) {
        return Math.abs(a - b) <= 1;
    }

    public boolean isFar(int a, int b, int c) {
        return Math.abs(a - b) >= 2 && Math.abs(a - c) >= 2;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        return Math.abs(max - mid) == Math.abs(min - mid);
    }


}