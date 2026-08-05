
class fruitsInBasket{
    public static void main(String[] args) {
        int fruits[] = {1, 2, 1};
        int n = fruits.length;
        int left = 0;
        int count = 0;
        int b1 = 0;
        int b2 = 0;
        for(int right = 1; right < n; right++){
            if(fruits[left] != fruits[right]){
                b1 = fruits[left];
                b2 = fruits[right];
            }
            count = Math.max(count, right - left);
            if(fruits[left] != b1 && fruits[right] != b2){
                left++;
                b1 = fruits[left];
                b2 = fruits[right];
            }
            count = Math.max(count, right - left + 1);
        }
        System.out.println(count);
    }
}