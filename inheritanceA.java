//this program  will display the diffrent words according to their classes and interface
class A extends B implements E{//this is class A extends to B and implements E
    void geta(){//method
        System.out.println("Hello one");//output
    }
    public void gete(){// interface method
        System.out.println("Hello interface");//out put
    }
}
class B extends C{//class B extends C
    void getb(){//method
        System.out.println("Hello two");//output
    }
}

class C extends D{//class C extends D
    void getc(){//method
        System.out.println("Hello three");//output
    }
}
class D{//class D
    void getd(){//method
        System.out.println("Hello four");//output
    }
}

interface E{//interface
    void gete();//method
}

public class inheritanceA {//main class
public static void main(String[] args) {//main methods
    A Obj = new A();//object created and colling
    Obj.geta();//calling
    Obj.getb(); //calling
    Obj.getc(); //calling
    Obj.getd(); //calling
    Obj.gete();  //calling 
}
}