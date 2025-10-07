package dsa.LinearSearchAlgo;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Siddhartha";
        char target = 'S';
        System.out.println(findChar(name, target));
        
    }
    static boolean findChar(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // for(int i = 0; i < str.length(); i++){
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }

        // for-each loop
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
