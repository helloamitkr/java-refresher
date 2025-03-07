package oops;

class  InheritanceParent{
    void function1(){
        System.out.println("function1");
    }
    int num =100;
}
 class InheritanceExample extends InheritanceParent {
    void childFunction(){
        System.out.println("Child function");
    }
}


public class InheitanceStart {
    public static void main(String[] args) {
        // child can access everything child as well as parent
        InheritanceExample childObj = new InheritanceExample();
        childObj.childFunction();
        System.out.println(childObj.num);
        childObj.function1();
        // parent object can access only parent data and function
        InheritanceParent parentObj = new InheritanceParent();
        System.out.println(parentObj.num);
        parentObj.function1();
    }
}
