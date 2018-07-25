import java.util.*;

class Solution {
    static class IndexAndCount{
        int index;
        int count;
        
        IndexAndCount(int index , int count) {
            this.index = index;
            this.count = count;
        }
    }
    
    static Character FindFirstNonRepeatingCharacter(String s ){
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            Integer count = hm.get(character);

            if(count != null) {
                hm.put(character, count + 1);
            } else {
                IndexAndCount ic = new IndexAndCount(i, 1);
                hm.put(character, 1);
            }
        }
        
        int index = s.length();
        for(Map.Entry<Character, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            int count = e.getValue();
            
            if(e.getValue() == 1) {
                if(s.indexOf(e.getKey()) < index) {
                    index = s.indexOf(e.getKey());
                }
            }
        }
        
        return ((index == s.length()) ? '-' :s.charAt(index)); 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        
        System.out.println("First non-repeating character of the string " + s + " is " + FindFirstNonRepeatingCharacter(s));
        
        scan.close();
    }
}