class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);

        return ans;
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int res = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                res = mid;
                h = mid - 1; // move left
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int res = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                res = mid;
                l = mid + 1; // move right
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }
}
