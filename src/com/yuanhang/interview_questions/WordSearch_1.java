package com.yuanhang.interview_questions;



/**
 * For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 * */
public class WordSearch_1 {
	public boolean exist(char[][] b, String word) {
        if(word.length() <= 0){
            return false;
        }
        
        for(int r = 0; r < b.length; r++ ){
            for(int c = 0; c < b[0].length; c++){
                if(b[r][c] == word.charAt(0)){
                  if(search(b, word, r, c, 0)) return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean search(char[][] b, String word, int r, int c, int p){
        boolean res = true;
        if(p >= word.length()){
            return res;
        }
        if(r < 0 || r >= b.length || c < 0 || c >= b[0].length || word.charAt(p) != b[r][c]){
            return false;
        }
        b[r][c] = '*';
        res = search(b, word, r + 1, c, p + 1) ||
              search(b, word, r - 1, c, p + 1) ||
              search(b, word, r, c + 1, p + 1) ||
              search(b, word, r, c - 1, p + 1);
        b[r][c] = word.charAt(p);
        
        return res;
    }
}
