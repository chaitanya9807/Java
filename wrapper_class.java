public class wrapper_class {
    public static void main(String[] args) {
        int x =10;
        char a = 'a';
        float f = 10.2f;
        Integer intobj = new Integer(x);
        Character charobj = new Character(a);
        Float floatobj = new Float(f);
        System.out.println("The Wrapped primitive data types are:");
        System.out.println("Intobj = "+intobj);
        System.out.println("Floatobj = "+floatobj);
        System.out.println("charobj = "+charobj);
        System.out.println("The unwrapped p[rimitive data types are:");
        int x_un = intobj;
        char a_un = charobj;
        float f_un = floatobj;
        System.out.println("x_un = "+x_un);
        System.out.println("a_un = "+a_un);
        System.out.println("f_un = "+f_un);

    }
}
