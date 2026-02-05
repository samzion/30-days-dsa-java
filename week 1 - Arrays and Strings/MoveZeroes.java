/**
 * Problem: Move Zeroes
 * Platform: LeetCode
 *
 * Key Idea:
 * Move all non-zero elements forward while keeping their order,
 * then fill the remaining positions with zeroes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * */
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;

        int nextNonZeroIndex = 0;
        for (int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                continue;
            }

            nums[nextNonZeroIndex] = nums[i];
            nextNonZeroIndex++;
        }

        if(nextNonZeroIndex - 1 ==  nums.length-1) return;

        for(int i = nextNonZeroIndex; i<nums.length; i++){
            nums[i] = 0;
        }

    }
}