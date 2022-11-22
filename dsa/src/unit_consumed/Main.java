package unit_consumed;

import java.util.*;
import java.io.*;

//https://oj.masaischool.com/contest/3647/problem/3
//This is the question

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
     int n = fs.nextInt();
     int bill = n-80;
     int unit = 0;
     int rbill = 0;
     if(bill<=150){
        unit=(bill/3);
     }
     else if(bill>150 && bill<=650){
         unit = 50;
         rbill = bill-150;
        unit+=(rbill/5);
     }
     else{
         unit = 150;
         rbill = bill-650;
        unit+=(rbill/10);
     }
     
     System.out.print(unit);
  }
  
}