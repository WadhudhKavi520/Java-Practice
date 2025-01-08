class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int valFirstWord=0; int valSecondWord=0; int valTargetWord=0;

        //finding numerical value of firstWord
        for(int i=0; i<firstWord.length(); i++) {
            valFirstWord += firstWord.charAt(i) - 97;
            valFirstWord = valFirstWord*10;
        }

        //finding numerical value of secondWord
        for(int i=0; i<secondWord.length(); i++) {
            valSecondWord += secondWord.charAt(i) - 97;
            valSecondWord = valSecondWord*10;
        }

        //finding numerical value of targetWord
        for(int i=0; i<targetWord.length(); i++) {
            valTargetWord += targetWord.charAt(i) - 97;
            valTargetWord = valTargetWord*10;
        }

        if(valFirstWord + valSecondWord == valTargetWord) {
            return true;
        }
        return false;
    }
}