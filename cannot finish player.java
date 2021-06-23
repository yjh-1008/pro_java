import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Locale;

public class Programmers {
    public static void main(String args[]) {
        String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c = {"josipa", "filipa", "marina", "nikola"};
        Arrays.sort(p);
        Arrays.sort(c);
        String answer="";
        for(int i=0;i<c.length;i++){
            if(!p[i].equals(c[i])){
                answer=p[i];
                break;
            }
        }
        if(answer.equals("")){
            answer=p[p.length-1];
        }
        System.out.println(answer);
    }
}
