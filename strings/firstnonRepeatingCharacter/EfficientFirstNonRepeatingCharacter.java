import java.util.*;

class Solution {
    static class IndexAndCount{
        int index;
        int count;
        
        IndexAndCount(int index) {
            this.index = index;
            this.count = 1;
        }
        
        public void increment() {
            this.count++;
        }
    }
    
    static Character EfficientFindFirstNonRepeatingCharacter(String s ){
        HashMap<Character, IndexAndCount> hm = new HashMap<Character, IndexAndCount>();

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(hm.get(c) == null) {
                hm.put(c, new IndexAndCount(i));       
            } else {
                hm.get(c).increment();
            }
        }
        
        int finalIndex = Integer.MAX_VALUE;
        Character finalChar = '-';
        for(Map.Entry<Character, IndexAndCount> entry : hm.entrySet()) {
            Character c = entry.getKey();
            IndexAndCount ic = entry.getValue();
            
            if(ic.count == 1 && ic.index < finalIndex ) {
                finalChar = c;
                finalIndex = ic.index;
            }
        }
        
//         int index = s.length();
//         for(Map.Entry<Character, Integer> e : hm.entrySet()) {
//             System.out.println(e.getKey() + " " + e.getValue());
//             int count = e.getValue();
            
//             if(e.getValue() == 1) {
//                 if(s.indexOf(e.getKey()) < index) {
//                     index = s.indexOf(e.getKey()); //instead of making this call of getting index everytime, good idea to store to prehand.
//                 }
//             }
//         }
        
        // return ((index == s.length()) ? '-' :s.charAt(index)); 
        return finalChar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        
        System.out.println("First non-repeating character of the string " + s + " is " + FindFirstNonRepeatingCharacter(s));
        
        scan.close();
    }
}