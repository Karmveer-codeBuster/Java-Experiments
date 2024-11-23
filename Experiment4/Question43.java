package Experiment4;

import java.util.HashMap;
import java.util.Scanner;

public class Question43 {
    public static void exceedNum(String s, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int count = 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count>n){
                if(!sb.toString().contains(Character.toString(s.charAt(i)))){
                    sb.append(s.charAt(i));
                }
                
            }
        }
        System.out.println(sb.toString());
    }
    public static void numExceed(String s, int n){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i),val+1);
            } else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(Character c:hm.keySet()){
            if(hm.get(c)>n){
                System.out.print(c);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        exceedNum(s, n);
    }
}


