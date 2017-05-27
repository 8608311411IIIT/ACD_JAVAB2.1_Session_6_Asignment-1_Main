//Session 6,Assignment 1,question 2.print all elements of an array in reverse order by the help of two array
public class Session6b{

     public static void main(String []args){
             int i;
             int []a={3,5,7,11,13,17,19,23,29,31};//array containing odd numbers
             int []b=new int[10];
             for(i=0;i<10;i++)//loop which stores data of an array to another array in reverse order
                  b[i]=a[10-i-1];

                  for(i=0;i<10;i++)
                       System.out.print(" "+b[i]);
     }
}
