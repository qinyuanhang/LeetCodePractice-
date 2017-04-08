package com.yuanhang.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {	    
	    boolean finish = false;
	    int startP = 0;	   
	    
	    public List<String> fullJustify(String[] words, int maxWidth) {	        
	        List<String> res = new ArrayList<String>();
	        if(words.length < 0){
	            return res;
	        }	        
	        if(maxWidth == 0){
	            res.add("");
	            return res;
	        }	        
	        while(startP < words.length){
	            List<String> temp = new ArrayList<String>(getWords(words, maxWidth));

	            String toAdd = new String (converToString(temp, maxWidth));
	            res.add(toAdd);
	        }	      
	        return res;
	    }
	    
	    
	    private List<String> getWords(String[] words, int L){
	        List<String> toReturn = new ArrayList<String>();
	        int length = 0;
	        int i = startP;	        
	       while(i < words.length){
	            if(length + words[i].length() == L){
	                toReturn.add(words[i]);
	                startP = i + 1; 
	                break;
	            }else if(length + words[i].length() < L){	            	
	                length += words[i].length() + 1;
	                toReturn.add(words[i]);
	                i++;
	                startP = i;	                      
	            }else{
	                startP = i;
	                break;
	            }    
	        }
	        return toReturn;
	    }
	    
	    
	    private String converToString(List<String> temp, int maxWidth){
	    	int totalNum = 0;
	    	
	        for(int i = 0; i < temp.size(); i++){
	            totalNum += temp.get(i).length();
	        }
	        int spaceNum = maxWidth - totalNum;
	        int p = 0;
	        while(spaceNum > 0){
	        	if(temp.size() == 1){
	        		temp.set(0, temp.get(0) + " ");
	        		spaceNum--;
	        	}else{	        		
	        		if(p == temp.size() - 1){
	        			p = 0;
	        		}else{
	        			temp.set(p, temp.get(p) + " ");
	        			p++;
	        			spaceNum--;
	        		}
	        	}
	        }           
	        StringBuilder sb = new StringBuilder();
	        for (String s : temp)
	        {
	            sb.append(s);
	        }     
	        return sb.toString();
	    }
}

