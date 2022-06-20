package complex;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class Main {

    public static void main(final String[] args) {
         IntComplex c1 = new DefaultIntComplex(1, 0);
        IntComplex c2 = new DefaultIntComplex(0, 1);
        System.out.println(c1);
        if((c1.real()!=0) ||(c2.imag()!=0)){System.out.println("not null");}
        if((c1.real()==1)){System.out.println("real equal 1");}
        if((c1.imag()==0)){System.out.println("imag equal 0");}
        if(c1.toString().equals("1+0i")){System.out.println("long form equal");}
        if(c1.equals(c1)){System.out.println("c1 equals c1");}
        if(!c2.equals(c1)){System.out.println("c2 not equals c1");}
        if(!c1.equals(null)){System.out.println("c1 not null");}

        if(c2.equals(c2.twitch()))
        {System.out.println("they are inverted and equals");}


        //System.out.println("bye for now");
    }
}