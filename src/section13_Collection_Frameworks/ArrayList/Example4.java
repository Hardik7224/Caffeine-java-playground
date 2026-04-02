package section13_Collection_Frameworks.ArrayList;
import java.util.*;

class Ball{
    String color;
    Ball(String color){
        this.color=color;
    }
}

public class Example4 {
    public static void main(String[] args) {
        Ball red = new Ball("Red");
        Ball blue = new Ball("Blue");
        Ball green = new Ball("Green");

        ArrayList<Ball> ballArrayList = new ArrayList<>();
        ballArrayList.addAll(Arrays.asList(red,blue,green,red,red,green,blue,blue,red,red));

        int r=0,b=0,g=0;
        Iterator<Ball> it = ballArrayList.iterator();
        while(it.hasNext()){
           Ball instance = it.next();
           if(instance.color.equals("Red")){
               r++;
           } else if (instance.color.equals("Blue")) {
               b++;
           }
           else{
               g++;
           }
        }

        System.out.println("Count of balls:");
        System.out.println("Red:"+r);
        System.out.println("Blue:"+b);
        System.out.println("Green:"+g);

    }
}
