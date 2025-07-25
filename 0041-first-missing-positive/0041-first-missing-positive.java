class Solution {
    public int firstMissingPositive(int[] nums) {
     int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

    //after cycle sort has been applied, we will find the first element
    //which is not at the correct index, and return that index + 1

        for(int j = 0; j < nums.length; j++) {

            if(nums[j] != j + 1) {
                return j + 1;
            }
        }

    //if every element is at its correct index, then obviously the first
    //missing positive integer is nums.length + 1

        return nums.length + 1;
    }
    }
