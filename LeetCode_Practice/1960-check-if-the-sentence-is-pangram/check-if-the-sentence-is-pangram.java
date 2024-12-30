class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alph = new HashSet<>();

        for(int i=0; i<sentence.length(); i++) {
            alph.add(sentence.charAt(i));
        }
        
        if(alph.size()==26) {
            return true;
        }
        return false;
    }
}