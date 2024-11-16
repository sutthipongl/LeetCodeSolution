/**
 * 
 */

import java.util.Arrays;

/**
 * 
 */
public class LeetCodeEasySolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LeetCodeEasySolution a = new LeetCodeEasySolution();


		System.out.println(Arrays.toString(a.twoSum(new int[] {1,2,3},5)));	
		
		System.out.println(a.isPalindrome(156));
		System.out.println(a.isPalindrome(-65));
		System.out.println(a.isPalindrome(939));
		
		System.out.println(a.romanToInt("III"));
		System.out.println(a.romanToInt("MCMXCIV"));

	}

	public  int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > 10000)
            return null;

        int[] output = {0,0};  
        int pos = 0;

        while (pos < nums.length - 1) {

            int cur = pos + 1;
            while (cur < nums.length) {
                 if (nums[pos] + nums[cur] == target) {
                    output[0] = pos;
                    output[1] = cur;
                    return output;
                 }else {
                    ++cur;
                 }
            }
           
           ++pos;    
        }
        
        return output;
    }
	
	public boolean isPalindrome(int x) {
        
        if (x < 0 ) 
            return false;
            
        char[] input = Integer.toString(x).toCharArray();

        int pos = 0;
        boolean result = true;
        while (pos < input.length) {

            result = result &&  ( input[pos] == input[input.length - 1 - pos]);
            ++pos;

        }
    return result;
        
    }
	
	public int romanToInt(String s) {
		
		/*
		 * Symbol       Value
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
		 * I can be placed before V (5) and X (10) to make 4 and 9. 
		 * X can be placed before L (50) and C (100) to make 40 and 90. 
		 * C can be placed before D (500) and M (1000) to make 400 and 900.
		 */
		
        int output = 0;
        short pos = 0 ;
        
        while (pos < s.length() ) {
        	
        	if(s.charAt(pos) == 'I') {
        		
        		if(pos != s.length() - 1) {
        			if(s.charAt(pos+1) == 'V' ) {
            			output += 4;
            			pos += 2 ;
            		} else if(s.charAt(pos+1) == 'X') {
            			output += 9;
            			pos += 2 ;
            		} else {
            			output += 1;
            			++pos;
            		}
        			
        		} else {
        			output += 1;
        			++pos;
        		}
        		  			
        		
        	} else if(s.charAt(pos) == 'X') {
        		
        		if(pos != s.length() - 1) {
        			if(s.charAt(pos+1) == 'L' ) {
            			output += 40;
            			pos += 2 ;
            		} else if(s.charAt(pos+1) == 'C') {
            			output += 90;
            			pos += 2 ;
            		} else {
            			output += 10;
            			++pos;
            		}
        		} else {
        			output += 10;
        			++pos;
        		}
        		     			
        		
        	} else if( s.charAt(pos) == 'C') {
        		
        		if(pos != s.length() - 1) {
        			
        			if(s.charAt(pos+1) == 'D' ) {
            			output += 400;
            			pos += 2 ;
            		} else if(s.charAt(pos+1) == 'M') {
            			output += 900;
            			pos += 2 ;
            		} else {
            			output += 100;
            			++pos;
            		}
        		} else {
        			output += 100;
        			++pos;
        		}
        		       			
        		
        	} else if(s.charAt(pos) == 'V') {
        		output += 5;
        		++pos;
        	} else if(s.charAt(pos) == 'L') {
        		output += 50;
        		++pos;
        	} else if(s.charAt(pos) == 'D') {
        		output += 500;
        		++pos;
        	} else if(s.charAt(pos) == 'M') {
        		output += 1000;
        		++pos;
        	}
        		
        }
       

        return output;
    }
}
	

