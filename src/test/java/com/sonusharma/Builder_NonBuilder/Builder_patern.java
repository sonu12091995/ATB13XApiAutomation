package com.sonusharma.Builder_NonBuilder;
class builder{

    // Instead of void assigned self(builder class)
    public builder step4() {
        System.out.println("Step 4");
        return this;
    }

    public builder step5() {
        System.out.println("Step 5");
        return this;
    }

    public builder step6(String name) {
        System.out.println("Step 6");
        return this;
    }
}
public class Builder_patern {
    public static void main(String[] args) {
        builder b = new builder();
        b.step4().step5().step6("sonu");
    }
}
