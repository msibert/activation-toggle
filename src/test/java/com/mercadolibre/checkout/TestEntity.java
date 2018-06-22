package com.mercadolibre.checkout;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class TestEntity{
    private final String usecase;
    private final String site;
    private final String flow;
    private final boolean expected;


    public TestEntity(String usecase, String site, String flow, boolean expected) {
        this.usecase = usecase;
        this.site = site;
        this.flow = flow;
        this.expected = expected;
    }

    public String getUsecase() {
        return usecase;
    }

    public String getSite() {
        return site;
    }

    public String getFlow() {
        return flow;
    }

    public boolean isExpected() {
        return expected;
    }

    @Override
    public String toString() {
        return this.usecase;
    }

    public boolean getExpected() {
        return expected;
    }
}
