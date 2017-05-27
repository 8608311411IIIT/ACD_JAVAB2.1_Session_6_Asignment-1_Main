//Session 6,Assignment 1,question 4.program which takes input(month day year) and gives output number of days from 1 january to given date
import java.util.*;
public class Session6d{

     public static void main(String []args){
           int i;
           String []month={"january","february","march","april",
                            "may","june","july","august",
                                "september","october","november","december"};//array which stores month name
            int []dayMonth={31,28,31,30,31,30,31,31,30,31,30,31};//array which stores number of days in each month
            String mnth;
            int day,year,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the month day and year in ( monthName day year) format");
            mnth=sc.next();//takes input month name
            day=sc.nextInt();//takes input day
            year=sc.nextInt();//takes input year
            for(i=0;i<12;i++){
                 if(mnth.equalsIgnoreCase(month[i])){
                      for(int j=0;j<i;j++)
                           sum+=dayMonth[j];
                       sum=sum+day;//total no of days from 1st january
                       if(year%4==0)//checks if year is leap year if yes increases day by 1
                            sum++;
                      System.out.println("No of days total from 1 january is"+sum);
                      break;
                 }    
            }
     }
}
