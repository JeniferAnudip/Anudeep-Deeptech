public class Percentage

{

        public static void main(String[] args) {

            A a = new A(80, 90, 100);

       System.out.println(a.getPercentage());

       B b = new B(85, 75, 70, 89);

       System.out.println(b.getPercentage());

  }

  }

        abstract class  Marks {

      public abstract float getPercentage();

  }

     class A extends Marks{

     int marks1, marks2, marks3;

     A(int m1, int m2, int m3)
    {

       marks1=m1;

       marks2=m2;

       marks3=m3;

   }

   public float getPercentage(){

       float total=((marks1+marks2+marks3)/(float)300)*100;

       return total;

   }

 }

class B extends Marks{

   int marks1, marks2, marks3, marks4;

   B(int m1, int m2, int m3, int m4){

       marks1=m1;

       marks2=m2;

       marks3=m3;

       marks4=m4;

   }

   public float getPercentage(){

       float total=((marks1+marks2+marks3+marks4)/(float)400)*100;

       return total;

   }

}