// class Solution {
//     public int longestSquareStreak(int[] nums) {
//         int max = 0;
//         Arrays.sort(nums);
//         int ele;
//         for(int i = 0;i<nums.length;i++){
//             int count = 0;
//             ele = nums[i];
//             if(ele==-1)   continue;
//             while(true){
//                 int pos = Arrays.binarySearch(nums,ele);
//                 if(pos<0)     break;
//                 count++;
//                 ele = ele*ele;
//                 nums[pos] = -1;
//             }
//             max = Math.max(max,count);
//         }
//         if(max==1)  return -1;
//         return max;
//     }
// }

class Solution {

    public int longestSquareStreak(int[] nums) {
        int longestStreak = 0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        for (int startNumber : nums) {
            int currentStreak = 0;
            long current = startNumber;
            while (uniqueNumbers.contains((int)current)) {
                currentStreak++;
                if (current * current > 1e5) break;
                current *= current;
            }
            if(currentStreak>longestStreak)   longestStreak = currentStreak;
        }
        return longestStreak < 2 ? -1 : longestStreak;
    }
}