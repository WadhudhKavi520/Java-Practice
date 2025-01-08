class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int valFirstWord=0; int valSecondWord=0; int valTargetWord=0;

        //finding numerical value of firstWord
        for(int i=0; i<firstWord.length(); i++) {
            char ch = firstWord.charAt(i);
            valFirstWord = valFirstWord + ch - 97;
            valFirstWord = valFirstWord*10;
        }

        //finding numerical value of secondWord
        for(int i=0; i<secondWord.length(); i++) {
            char ch = secondWord.charAt(i);
            valSecondWord = valSecondWord + ch - 97;
            valSecondWord = valSecondWord*10;
        }

        //finding numerical value of targetWord
        for(int i=0; i<targetWord.length(); i++) {
            char ch = targetWord.charAt(i);
            valTargetWord = valTargetWord + ch - 97;
            valTargetWord = valTargetWord*10;
        }

        if(valFirstWord + valSecondWord == valTargetWord) {
            return true;
        }
        return false;

    }
}