package com.Vyshnavi.oopsDemo;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1=new Mobile();
        Mobile mobile2=new Mobile(12);
        Samsung samsung=new Samsung();
        mobile1.printDetails();
        mobile1.addDesign();
        mobile1.addDesign("Galaxy Prime J5");
        mobile2.printDetails();
        samsung.printDetails();

    }
}
