package substringUnderCondition;

import java.util.*;
import java.io.*

//https://oj.masaischool.com/contest/3682/problem/2

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
    String s = fs.nextLine();
    System.out.print(count(s));

  }
  static int count(String s){
      int num = 0;
      int n = s.length();
      
      for(int i = 0 ; i < n ; i++){
          for(int j = 1 ; j <= n - i ; j++){
              if(check(s.substring(i, i+j))) num++;
          }
      }
      return num;
  }
  
  static boolean check(String s){
      return (s.charAt(0) == s.charAt(s.length()-1));
  }

}

