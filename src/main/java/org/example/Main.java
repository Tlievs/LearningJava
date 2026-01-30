package org.example;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 4, 1};
        System.out.println(either24(nums));
    }

    public static boolean either24(int[] nums) {
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

    public static String[] fizzArray2(int n) {
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




//    public static boolean isError (String str) {
//        Pattern p = Pattern.compile("ERROR (\\d{3})");
//        Matcher m = p.matcher(str);
//
//        return m.find();
//    }
//    public static String getVersion (String str) {
//        Pattern p = Pattern.compile("-([\\d.]+)\\.jar");
//        Matcher m = p.matcher(str);
//
//        return m.find() ? m.group(1) : "Version not found!";
//    }
}

