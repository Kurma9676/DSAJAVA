Problem Statement: Total Number of Jumps to Climb Walls

You are given the ability to climb walls with the following constraints:

    You can jump up by X units at a time.

    After each jump (except the last jump that reaches or surpasses the wall height), you slip down by Y units.

You have N walls to climb, each with a specific height.

Task:
Calculate the total number of jumps required to climb all N walls.
Input:

    The first line contains three integers:
    X — the units you jump up in one jump
    Y — the units you slip down after a jump (except when reaching the top)
    N — the number of walls

    The second line contains N integers representing the heights of the walls.

Output:

    A single integer representing the total number of jumps needed to climb all the walls.

import java.util.*;
public class Main
{
      public static int Total_jumps(int X,int Y,int N,int[] heights){
            int total_jumps=0;
            for(int height:heights){
                  if(X>height){
                        total_jumps++;
                  }
                  int curr_height=0;
                  int jumps=0;
                  while(curr_height<height){
                        jumps++;
                        curr_height+=X;
                        if(curr_height>=height){
                              break;
                        }
                        curr_height-=Y;
                  }
                  total_jumps+=jumps;
            }
            return total_jumps;
      }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		int N=s.nextInt();
		int[] heights=new int[N];
		for( int i=0;i<N;i++){
		      heights[i]=s.nextInt();
		}
		int result=Total_jumps(X,Y,N,heights);
		System.out.print(result);
	}
}
