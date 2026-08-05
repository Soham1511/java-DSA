class findMax {
    public static int returnPeak(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if(a[mid] < a[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = { 1 };
        System.out.println(returnPeak(a));
    }
}