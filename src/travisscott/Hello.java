/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travisscott;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Hello {

    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        for (int i = 0; i < list.size(); i++){
            if(check.test(list.get(i)))
                return i;
    }
        return -1;
}
    
    public static void main(String[] args) {
        
        
        List<String> al = new ArrayList();
        List<Integer> be = new ArrayList();
        
        
        Predicate<Integer> x1 = i -> (i==0);
        Predicate<Integer> x2 = i -> (i==4);
        Predicate<Integer> x3 = i -> (i==11);
        
        Predicate<String> z1 = i -> (i== "Yet");
        Predicate<String> z2 = i -> (i== "Yeet");
        Predicate<String> z3 = i -> (i== "Yeeet");
        
        
        for(int i =0; i < 10; i++){
            be.add(i);
        }
        
        
        al.add("Ye");
        al.add("Yee");
        al.add("Yeee");
        al.add("Yeeee");
        al.add("Yeeeee");
        
        int a = linearSearch(al, z1);
        int b = linearSearch(al, z2);
        int c = linearSearch(al, z3);
        
        int d = linearSearch(be, x1);
        int e = linearSearch(be, x2);
        int f = linearSearch(be, x3);
       
        for(int i = 0; i < 10; i++){
            System.out.println(be.get(i));
        }
        for(int i =0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
    
    }
}
