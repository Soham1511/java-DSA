class powerOfX{
    public static int multipication(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * multipication(x, n-1);
    }
    public static void main(String[] args) {
        int x = 3;
        int n = 2;
        System.out.println(multipication(x, n));
    }
}