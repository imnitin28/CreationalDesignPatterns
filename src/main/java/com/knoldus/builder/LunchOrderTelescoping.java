package com.knoldus.builder;

public class LunchOrderTelescoping {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescoping(String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescoping(String bread, String condiments) {
        this.bread = bread;
        this.condiments = condiments;
    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
