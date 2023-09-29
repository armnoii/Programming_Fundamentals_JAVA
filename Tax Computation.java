import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        int Salary = scan.nextInt();
        System.out.print("Enter Year cost: ");
        int cost = scan.nextInt();
        System.out.print("Enter Tax deduction: ");
        int deduction = scan.nextInt();
        System.out.print("You have other income? ");
        String string = str.nextLine();
        char income = string.charAt(0);
        
        int a,b,c,d,e,f,g,h;
            a = 300000;
            b = 500000;
            c = 750000;
            d = 1000000;
            e = 2000000;
            f = 5000000;
            g = 999999999;
            h = 150000;
            
        if(income == 'N'){
            int ic = ((Salary*12) - cost - deduction);
            System.out.print("Income : " + "("+Salary+"x12) - " + cost + " - " + deduction + " = " + ic);
            if(ic <= h){
                System.out.print("\nTax is 0%");
                System.out.print("\nYour Tax = Free Tax");
            }else if(ic <= a){
                System.out.print("\nTax is 5%");
                System.out.print("\nCal Tax " + ic + "-" + h + " = " + (ic - h) + " * " + "5%" + " = " + (ic - h)/100*5);
                System.out.print("\nYour Tax = " + (ic - h)/100*5 + " BTH ");
            }else if(ic <= b){
                System.out.print("\nTax is 10%");
                System.out.print("\nCal Tax " + ic + "-" + a + " = " + (ic - a) + " * " + "5%" + " = " + (ic - a)/100*10);
                System.out.print("\nYour Tax = " + (ic - h)/100*10 + " BTH ");
            }else if(ic <= c){
                System.out.print("\nTax is 15%");
                System.out.print("\nCal Tax " + ic + "-" + b + " = " + (ic - b) + " * " + "5%" + " = " + (ic - b)/100*15);
                System.out.print("\nYour Tax = " + (ic - b)/100*15 + " BTH ");
            }else if(ic <= d){
                System.out.print("\nTax is 20%");
                System.out.print("\nCal Tax " + ic + "-" + c + " = " + (ic - c) + " * " + "5%" + " = " + (ic - c)/100*20);
                System.out.print("\nYour Tax = " + (ic - b)/100*20 + " BTH ");
            }else if(ic <= e){
                System.out.print("\nTax is 25%");
                System.out.print("\nCal Tax " + ic + "-" + d + " = " + (ic - d) + " * " + "5%" + " = " + (ic - d)/100*25);
                System.out.print("\nYour Tax = " + (ic - b)/100*25 + " BTH ");
            }else if(ic <= f){
                System.out.print("\nTax is 30%");
                System.out.print("\nCal Tax " + ic + "-" + e + " = " + (ic - e) + " * " + "5%" + " = " + (ic - e)/100*30);
                System.out.print("\nYour Tax = " + (ic - b)/100*30 + " BTH ");
            }else if(ic <= g){
                System.out.print("\nTax is 35%");
                System.out.print("\nCal Tax " + ic + "-" + f + " = " + (ic - f) + " * " + "5%" + " = " + (ic - f)/100*35);
                System.out.print("\nYour Tax = " + (ic - b)/100*35 + " BTH ");
            }
        }
        if(income == 'Y'){
            System.out.print("Input other income: ");
        int other = scan.nextInt();
            int ic = ((Salary*12) - cost - deduction + other);
            System.out.print("Income : " + "("+Salary+"x12) - " + cost + " - " + deduction + " = " + ic);
            if(ic <= h){
                System.out.print("\nTax is 0%");
                System.out.print("\nYour Tax = Free Tax");
            }else if(ic <= a){
                int s1 = (((ic - h/2)-h/2)/100*5);
                int s2 =  (h/2)/100*5/2;
                System.out.print("\nTax is 5%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + h/2 + " = " + (ic - h/2) + " - " + h/2 + " = " + ((ic - h/2)-h/2) + " * 5% = " +  ((ic - h/2)-h/2)/100*5);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (h/2) + " * " + " 2.5% = " + (h/2)/100*5/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= b){
                int s1 = (((ic - a/2)-a/2)/100*10);
                int s2 =  (a/2)/100*5;
                System.out.print("\nTax is 10%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + a/2 + " = " + (ic - a/2) + " - " + a/2 + " = " + ((ic - a/2)-a/2) + " * 10% = " +  ((ic - a/2)-a/2)/100*10);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (a/2) + " * " + " 5% = " + (a/2)/100*5);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= c){
                int s1 = (((ic - b/2)-b/2)/100*15);
                int s2 =  (b/2)/100*15/2;
                System.out.print("\nTax is 15%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + b/2 + " = " + (ic - b/2) + " - " + b/2 + " = " + ((ic - b/2)-b/2) + " * 15% = " +  ((ic - b/2)-b/2)/100*15);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (b/2) + " * " + " 7.5% = " + (a/2)/100*15/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= d){
                int s1 = (((ic - c/2)-c/2)/100*20);
                int s2 =  (c/2)/100*20/2;
                System.out.print("\nTax is 20%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + c/2 + " = " + (ic - c/2) + " - " + c/2 + " = " + ((ic - c/2)-c/2) + " * 20% = " +  ((ic - c/2)-c/2)/100*20);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (c/2) + " * " + " 10% = " + (c/2)/100*20/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= e){
                int s1 = (((ic - d/2)-d/2)/100*25);
                int s2 =  (c/2)/100*25/2;
                System.out.print("\nTax is 25%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + d/2 + " = " + (ic - d/2) + " - " + d/2 + " = " + ((ic - d/2)-d/2) + " * 25% = " +  ((ic - d/2)-d/2)/100*25);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (d/2) + " * " + " 12.5% = " + (d/2)/100*25/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= f){
                int s1 = (((ic - e/2)-e/2)/100*30);
                int s2 =  (e/2)/100*30/2;
                System.out.print("\nTax is 30%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + e/2 + " = " + (ic - e/2) + " - " + e/2 + " = " + ((ic - e/2)-e/2) + " * 30% = " +  ((ic - e/2)-e/2)/100*30);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (e/2) + " * " + " 15% = " + (e/2)/100*30/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }else if(ic <= g){
                int s1 = (((ic - f/2)-f/2)/100*35);
                int s2 =  (f/2)/100*35/2;
                System.out.print("\nTax is 35%");
                System.out.print("\nStep 2");
                System.out.print("\nCal Tax " + ic + "-" + f/2 + " = " + (ic - f/2) + " - " + f/2 + " = " + ((ic - f/2)-f/2) + " * 35% = " +  ((ic - f/2)-f/2)/100*35);
                System.out.print("\nStep 1");
                System.out.print("\nCal Tax " + (f/2) + " * " + " 17.5% = " + (f/2)/100*35/2);
                System.out.print("\nYour Tax = " + (s1 + s2) + " BTH ");
            }
        }
    }
}
