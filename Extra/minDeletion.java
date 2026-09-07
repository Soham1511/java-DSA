
class minDeletion{
    public static int findMin(int a[]){
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
                ans = i;
            }
        }
        return ans;
    }
    public static int findMax(int a[]){
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,8,-2,-4,19,-3,5};
        int min = findMin(nums); // 1, idx = 5 
        int max = findMax(nums); // 10, idx = 1
        int totalDeletion = 0;
        int ifLeft = Math.max(min, max) + 1;
        int ifRight = nums.length - Math.min(min, max);
        int bothSide = (Math.min(min, max) + 1) + (nums.length - Math.max(min, max));
        totalDeletion = Math.min(Math.min(ifLeft, bothSide), ifRight);
        System.out.println(totalDeletion);
    }
}