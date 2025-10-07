package dsa.Arrays.intro;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);       

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);

        // System.out.println(list);
        // list.set(0, 99);
        // list.remove(7);
        // list.add(2,4);        
        // System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
