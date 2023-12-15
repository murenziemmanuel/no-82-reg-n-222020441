//this program will calculate the simple interest
public class simpleinterest {//main class
    static int simple(int r,int p,int t){//metod
        return (r*p*t)/100;//return
    }


    public static void main(String[] args) {//main function
        simpleinterest PT= new simpleinterest();//classname and object name
        System.out.println(PT.simple(5,100000,5));//output
    }
}
 