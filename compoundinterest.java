//this program will calculate the compound intrest
import java.lang.Math;//import math library
class compound {//class declaration
    static double compoundin(double r,double p,double t){//method declaration
        return p*(Math.pow((1+(((r/100)/12))),t*12));//return
    }
}   

public class compoundinterest {//main class declaration
        public static void main(String[] args) {//main class
        compound PT = new compound();// object creation
        System.out.println(PT.compoundin(18, 500000, 3));// method calling
    }
}


