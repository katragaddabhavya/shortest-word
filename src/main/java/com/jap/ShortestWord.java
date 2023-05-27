package com.jap;


public class ShortestWord {
    public static void main(String[] args) {
        String words[]={"Atrocity","Pensive", "Imperceptible","Discordant","student"};
        ShortestWord shortestWord= new ShortestWord();
        String shortword=shortestWord.findShortestWord(words);
        System.out.println("Shortest word in array is " +shortword);


    }
    public String findShortestWord(String[] words) {
        String shortword;
        if(words.length==0){
            return shortword="Cannot find shortest word as array is empty";
        }
        shortword=words[1];
        for(int i=0;i<words.length;i++){
            if(words[i].length()<shortword.length()){
                shortword=words[i];
            }
            return shortword;
        }

        return "ShortestWord";
    }
}
