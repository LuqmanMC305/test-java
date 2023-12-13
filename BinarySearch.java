public class BinarySearch
{
    public static boolean binarySearch(int[] nums, int target)
    {
         int left = 0, right = nums.length - 1, mid;

         while(left <= right)
         {
             mid = left + (right - left) / 2;

             if(nums[mid] > target)
             {
                right = mid - 1;
             }
             else if(nums[mid] < target)
             {
                left = mid + 1;
             }
             else
             {
                return true;
             }
         }

         return false;
    }

    
    public static void main(String[] args) 
    {
         int[] nums = {0,2,3,4,33,48};
         int target = 2;   
         System.out.println(binarySearch(nums, target));
    }
}