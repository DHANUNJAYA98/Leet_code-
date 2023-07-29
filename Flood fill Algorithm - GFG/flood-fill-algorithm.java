//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int ne)
    {
        int oclor=image[sr][sc];
        if(oclor!=ne){
            dfs(image,sr,sc,ne,oclor);
        }
        return image;
        
    }
    public void dfs(int image[][],int i,int j,int ne,int oclor){
        if(image[i][j]==oclor){
            image[i][j]=ne;
            if(i>0){
                dfs(image,i-1,j,ne,oclor);
            }
            if(j>0){
                dfs(image,i,j-1,ne,oclor);
            }
            if(i<image.length-1){
                dfs(image,i+1,j,ne,oclor);
            }
            if(j<image[0].length-1){
                dfs(image,i,j+1,ne,oclor);
            }
        }
    }
    
}