package com.knoldus.builder;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
//        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Ham");
//        builder.bread("Wheat").dressing("Mayo").meat("Ham");
//        builder.bread("Wheat").condiments("Lettuce").meat("Ham");
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo");
        LunchOrder lunchOrder = builder.build();

//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
