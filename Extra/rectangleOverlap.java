import java.util.HashMap;

class rectangleOverlap {
    public static void main(String[] args) {
        int rect1[] = { 0, 0, 1, 1 };
        int rect2[] = { 1, 0, 2, 1 };
        boolean ans = false;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < rect1.length; i++) {
            map1.put(i, rect1[i]);
            map2.put(i, rect2[i]);
        }
        if (map1.get(0) < map2.get(2) &&
                map1.get(2) > map2.get(0) &&
                map1.get(1) < map2.get(3) &&
                map1.get(3) > map2.get(1)) {

            ans = true;
        }
        System.out.println(ans);
    }
}