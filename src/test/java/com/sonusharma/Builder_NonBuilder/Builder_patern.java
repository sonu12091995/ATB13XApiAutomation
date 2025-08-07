package com.sonusharma.Builder_NonBuilder;
class builderPatern{
    public builderPatern step1() {
        System.out.println("Step 1");
        return  this;
    }

    public builderPatern step2() {
        System.out.println("Step 2");
        return  this;
    }

    public builderPatern step3(String param1) {
        System.out.println("Step 3");
        return  this;
    }
}
public class Builder_patern {
    public static void main(String[] args) {
        builderPatern b = new builderPatern();
        b.step1().step2().step3("sonu");
    }
}
