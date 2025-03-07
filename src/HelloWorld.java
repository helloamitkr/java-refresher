import oops.DataAbstraction;

public class HelloWorld {
    public static void main(String[] args) {
        DataAbstraction obj = new DataAbstraction();
        String res =obj.GetName(obj.name);
        System.out.println(res);
    }
}
