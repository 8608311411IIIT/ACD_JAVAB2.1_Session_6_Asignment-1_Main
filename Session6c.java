//Session 6,Assignment 1,question 3.program which gives the number of days in a month corresponding to name of month
import java.util.*;
public class Session6c{

     public static void main(String []args){
           int i;
           String []month={"january","february","march","april",
                            "may","june","july","august",
                                "september","october","november","december"};//array containing name of month
            int []dayMonth={31,28,31,30,31,30,31,31,30,31,30,31};//corresponding array containing number of days in a month(month(i+1)=dayMonth[i])
            String data;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the month");
            data=sc.next();//takes input month name
            for(i=0;i<12;i++){
                 if(data.equalsIgnoreCase(month[i])){//checks name of months to given input data
                      System.out.println("Number of days in "+data+" is "+dayMonth[i]);//print days in given month
                 }    
            }
     }
}
