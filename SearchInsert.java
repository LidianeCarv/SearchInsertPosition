public class SearchInsert {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6}; int target = 8;
        boolean found = false; int index = 0;
        // initial commit
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            if (num >= target) {
                found = true; index = i;
                break;
            }
        }
        if (found == false) System.out.println(nums.length);
        else System.out.println(index);
    }
}
