public class ParentApp {


    
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "eko";
        child.Doit();
        System.out.println(child.name);

        //konversi
        //variable hiding
        Parent parent = (Parent) child;
        parent.Doit();
        System.out.println(parent.name);

    }
}
