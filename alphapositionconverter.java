
import java.util.*;
public class Alpha {
    public static void main(String[] args){
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('a',1);
        h.put('b',2);
        h.put('c',3);
        h.put('d',4);
        h.put('e',5);
        h.put('f',6);
        h.put('g',7);
        h.put('h',8);

        h.put('i',9);
        h.put('j',10);

        h.put('k',11);
        h.put('l',12);
        h.put('m',13);
        h.put('n',14);
        h.put('o',15);

        h.put('p',16);
        h.put('q',17);
        h.put('r',18);
        h.put('s',19);
        h.put('t',20);
        h.put('u',21);
        h.put('v',22);
        h.put('w',23);
        h.put('x',24);
        h.put('y',25);
        h.put('z',26);
        String s="hello";
        for (int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(h.containsKey(ch)){
            System.out.print(h.get(ch));
           }
        }
    }
}
