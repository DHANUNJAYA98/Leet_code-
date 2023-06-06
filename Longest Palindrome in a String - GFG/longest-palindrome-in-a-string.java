//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        if(s.isEmpty()){
            return"";
        }
        int n=s.length();
        int longestsofar =0,startindex=0,endindex=0;
        boolean[][]palindrome=new boolean[n][n];
        for(int j=0;j<n;j++){
            palindrome[j][j]=true;
            for(int i=0;i<j;i++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<=2||palindrome[i+1][j-1])){
                 palindrome[i][j]=true;
                    if(j-i+1>longestsofar){
                        longestsofar=j-i+1;
                        startindex=i;
                        endindex=j;
                    }
                }
            }
        }
                       return s.substring(startindex,endindex+1);
        
    }
}