package oopskunal.Oops.oops6.Generics;

public class Main {
    public static void main(String[] args) {
        // Box<Integer> box = new Box<>();
        // box.setValue(4000);
        // int i = box.getValue();
        // System.out.println(i);
    
        Pair<String, Integer> p = new Pair<>("Ind", 75);
        System.out.println(p.getKey());
        System.out.println(p.getValue());

    }
}
