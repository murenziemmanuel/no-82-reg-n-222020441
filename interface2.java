//this program will add,power,division,substraction and multiplication according to their classes
package interface2;//folder name
import java.lang.Math;//import java.lang.math to help to calculate power in this progam
class A extends B implements E{//this is class A extends to B and implements E
    int sum(){//method
    int c=2;//declaration
    int s=3;//initialization
    int sum = c+s;//initialization
    return sum;//return sum
   }
  public double power(){//interface method
   return Math.pow(2,2);//return power
  }
}
class B extends C {//class C extends C
    int multiplication(){// method
    int d=5;//initialization
    int s=4;//initialization
    return d*s;//return multiplication
}
}
class C extends D {//class C extends D
   int division(){//method
    int e=6;//initialization
    int v=3;//initialization
    return e/v;//return devision
}
}
class D {//class D
    int substraction(){//method
    int f=9;//initialization
    int t=8;//initialization
    return f-t;//return multiplication
    }
}
interface E{//interface
double power();//method
}

public class interface2 {//main class
   public static void main(String[]args){//main function
    A BT=new A();//object creation
    System.out.println(BT.sum());//output
    System.out.println(BT.multiplication());//output
    System.out.println(BT.division());//output
    System.out.println(BT.substraction());//output
    System.out.println(BT.power());//output
   } 
}
