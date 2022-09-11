package intcomplex;

public class Main {
    public static void main(final String[] args) {
        IntComplex c1 = new DefaultIntComplex(1, 0);
        IntComplex c2 = new DefaultIntComplex(0, 1);
        if((c1.real()==1)) {System.out.println("real equals 1");}
        if((c1.imag()==0)) {System.out.println("imag equals 0");}
        if(c1.toString().equals("1+0i")) {System.out.println("toString: long form equal");}
        System.out.println(c1);
        if(c1.equals(c1)) {System.out.println("c1 equals c1");}
        if(!c2.equals(c1)) {System.out.println("c2 not equals c1");}
        if(!c1.equals(null)) {System.out.println("c1 not null");}
        if(c1.equals(c2.interchange())) {
            System.out.println("inverted c2 is equal to c1");
        }
        if(!c1.equals(c2)) {System.out.println("c1 not equals c2");}
    }
}