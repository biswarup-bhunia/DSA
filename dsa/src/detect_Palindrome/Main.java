package detect_Palindrome;

import java.util.*;
import java.io.*;

//https://oj.masaischool.com/contest/3682/problem/1

class Main{
    static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  public static void main(String[] args){
     FastReader fs = new FastReader();
     int num = fs.nextInt();
     int rev_num = reverse(num);
     if(num==rev_num){
         System.out.print("Yes");
         }
         else {
             System.out.print("No");
         }

  }
  
  public static int reverse(int num){
     int rev_num = 0;
     while(num > 0){
         int reminder = num%10;
         rev_num = rev_num*10+reminder;
         num = num/10;
     }
     return rev_num;
  }
}
