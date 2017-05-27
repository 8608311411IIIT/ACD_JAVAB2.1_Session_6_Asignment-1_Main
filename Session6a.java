//Session 6,Assignment 1,question 1.print all even no from a list of ten numbers stored in a array
public class Session6a{

    public static void main(String []args){
       int i;
       int []a=new int[10];//array declaration
       for(i=0;i<10;i++)
           a[i]=i+1;//storing data in array
       
           for(i=0;i<10;i++){
               if(a[i]%2==0)//condition which checks whether data is even number or odd
                   System.out.print(" "+a[i]);
           }
          


   }
}
