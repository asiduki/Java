import java.util.*;
public class Stignsbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("udit");
        System.out.println(sb);

        //char at index 0
        // System.out.println(sb.charAt(0));

        // set char at index 0 
        // sb.setCharAt(0,'p');
        // System.out.println(sb);

        // sb.insert(2, 't');
        // System.out.println(sb);

        // delete function in string builder 
        // sb.delete(2, 3);
        // System.out.println(sb);

        // append fuction in string builder
        // sb.append('e');
        // System.out.println(sb);

        for(int i = 0 ; i<sb.length()/2;i++){
            int fornt = i ;
            int back = sb.length() -1 -i; 
            char frontchr = sb.charAt(fornt);
            char backchr = sb.charAt(back);

            sb.setCharAt(fornt, backchr);
            sb.setCharAt(back, frontchr);


        }
        System.out.println(sb);

    }
} 