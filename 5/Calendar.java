import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year :");
        int year=input.nextInt();
        System.out.print("Enter the first day of the year is a few weeks :");
        int week=input.nextInt();
        String M=null;
        int mouth;
        int W;
        int count=0;
        boolean LeapYear=(year%4==0&&year%100!=0)||(year%400==0);
        for(mouth=1;mouth<=12;mouth++){
            if(mouth==1){
                M="January";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }


            else if(mouth==2){
                W=(31%7+week)%7;
                week=W;
                M="February";
                if(LeapYear){
                    System.out.println("\t\t  "+M+"\t"+year);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                    for(int j=0;j<week;j++){
                        System.out.print("\t");
                    }
                    for(int i=1;i<=7-week;i++){

                        if(i%7==0){
                            System.out.println(i);
                        }else
                            System.out.print(i+"\t");
                    }
                    System.out.println();
                    for(int k=(7-week+1);k<=29;k++){
                        count++;
                        if(count%7==0){
                            System.out.println(k);
                        }else
                            System.out.print(k+"\t");
                    }
                    System.out.println();
                    count=0;
                }else{
                    System.out.println("\t\t  "+M+"\t"+year);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                    for(int j=0;j<week;j++){
                        System.out.print("\t");
                    }
                    for(int i=1;i<=7-week;i++){

                        if(i%7==0){
                            System.out.println(i);
                        }else
                            System.out.print(i+"\t");
                    }
                    System.out.println();
                    for(int k=(7-week+1);k<=28;k++){
                        count++;
                        if(count%7==0){
                            System.out.println(k);
                        }else
                            System.out.print(k+"\t");
                    }
                    System.out.println();
                    count=0;
                }
            }

            else if(mouth==3){
                if(LeapYear){
                    W=(29%7+week)%7;
                    week=W;
                    M="March";
                    System.out.println("\t\t  "+M+"\t"+year);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                    for(int j=0;j<week;j++){
                        System.out.print("\t");
                    }
                    for(int i=1;i<=7-week;i++){

                        if(i%7==0){
                            System.out.println(i);
                        }else
                            System.out.print(i+"\t");
                    }
                    System.out.println();
                    for(int k=(7-week+1);k<=31;k++){
                        count++;
                        if(count%7==0){
                            System.out.println(k);
                        }else
                            System.out.print(k+"\t");
                    }
                    System.out.println();
                    count=0;
                }
                else{W=(28%7+week)%7;
                    week=W;
                    M="March";
                    System.out.println("\t\t  "+M+"\t"+year);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                    for(int j=0;j<week;j++){
                        System.out.print("\t");
                    }
                    for(int i=1;i<=7-week;i++){

                        if(i%7==0){
                            System.out.println(i);
                        }else
                            System.out.print(i+"\t");
                    }
                    System.out.println();
                    for(int k=(7-week+1);k<=31;k++){
                        count++;
                        if(count%7==0){
                            System.out.println(k);
                        }else
                            System.out.print(k+"\t");
                    }
                    System.out.println();
                    count=0;
                }
            }

            else if(mouth==4){
                W=(31%7+week)%7;
                week=W;
                M="April";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=30;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==5){
                W=(30%7+week)%7;
                week=W;
                M="May";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==6){
                W=(31%7+week)%7;
                week=W;
                M="June";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=30;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==7){
                W=(30%7+week)%7;
                week=W;
                M="July";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==8){
                W=(31%7+week)%7;
                week=W;
                M="August";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==9){
                W=(31%7+week)%7;
                week=W;
                M="September";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=30;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==10){
                W=(30%7+week)%7;
                week=W;
                M="October";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==11){
                W=(31%7+week)%7;
                week=W;
                M="November";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=30;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();
                count=0;
            }else if(mouth==12){
                W=(30%7+week)%7;
                week=W;
                M="December";
                System.out.println("\t\t  "+M+"\t"+year);
                System.out.println("----------------------------------------------------");
                System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
                for(int j=0;j<week;j++){
                    System.out.print("\t");
                }
                for(int i=1;i<=7-week;i++){

                    if(i%7==0){
                        System.out.println(i);
                    }else
                        System.out.print(i+"\t");
                }
                System.out.println();
                for(int k=(7-week+1);k<=31;k++){
                    count++;
                    if(count%7==0){
                        System.out.println(k);
                    }else
                        System.out.print(k+"\t");
                }
                System.out.println();count=0;
            }

        }

    }
}
