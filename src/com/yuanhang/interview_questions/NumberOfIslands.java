package com.yuanhang.interview_questions;


/**
 * Given a 2d grid map of '1's (land) and '0's (water), 
 * count the number of islands. An island is surrounded by water and 
 * is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 * 
 * */


//两个循环遍历一遍，碰到一个1，就把他这个岛全部变成0


public class NumberOfIslands {
	
	 public int numberOfIslands(char[][] grid) {
	        int n = grid.length;
	        if(n == 0) return 0;
	        int m = grid[0].length;
	        if(m == 0) return 0;
	        
	        int result = 0;
	        
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < m; j++){
	                if(grid[i][j] == '1'){
	                    removeIsland(grid,i,j);
	                    result++;
	                }
	            }
	        }
	        
	        return result;
	        
	    }
	    
	    private void removeIsland(char[][] grid, int i, int j){
	        while(i < grid.length && i >= 0 && j < grid[0].length && j >= 0 && grid[i][j] == '1'){
	            grid[i][j] = '0';
	            removeIsland(grid, i + 1, j);
	            removeIsland(grid, i - 1, j);
	            removeIsland(grid, i, j + 1);
	            removeIsland(grid, i, j - 1);
	        }
	    }

}
