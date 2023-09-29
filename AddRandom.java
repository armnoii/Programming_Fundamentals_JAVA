import java.util.*;
public class AddRandom {
    public static void main(String[] args){
        Random random = new Random();
        float ran = random.nextFloat() * 50;
        float ran2 = random.nextFloat() * 50;
        float sum = ran + ran2;
        if(ran + ran2 > 50){
            System.out.printf("Sum of %f + %f = " + sum + "\nValue = PASS" ,ran,ran2);
        }
        else if(ran + ran2 <= 50){
            System.out.printf("Sum of %f + %f = " + sum + "\nValue = Not PASS" ,ran,ran2);
        }
    }
}
