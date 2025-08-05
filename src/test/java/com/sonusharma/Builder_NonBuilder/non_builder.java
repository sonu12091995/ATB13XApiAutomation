package com.sonusharma.Builder_NonBuilder;


class non_builderPatern{
    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3(String param1) {
        System.out.println("Step 3");
    }
}
public class non_builder {
    public static void main(String[] args) {
        non_builderPatern  non = new non_builderPatern();
        non.step2();
        non.step1();

    }
}
