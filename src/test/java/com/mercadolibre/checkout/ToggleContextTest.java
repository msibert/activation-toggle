package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import org.junit.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class ToggleContextTest {

    @Test
    public void defaultConfigurationTest(){
        DefaultToggleContext context = new DefaultToggleContext();
        Assert.assertFalse(context.isEnabled());
    }

    @DataProvider
    public Object[][] dataProviderMlaDirect(){
        return new Object[][]{
                {new TestEntity("Flow MLA DIRECT", "MLA", "DIRECT", true)},
                {new TestEntity("Flow MLB DIRECT", "MLB", "DIRECT", false)},
                {new TestEntity("Flow MLA CART", "MLA", "CART", false)},
                {new TestEntity("Flow MLB CART", "MLB", "CART", false)},
                {new TestEntity("Flow MLM CART", "MLM", "CART", false)}
        };
    }

    @org.testng.annotations.Test(dataProvider = "dataProviderMlaDirect")
    public void mlaDirectToggleContextTest (TestEntity entity){
        FeatureContext featureContext = new FeatureContext(entity.getSite(), entity.getFlow());
        ToggleContext context = new MLADirectToggleContext(featureContext);
        Assert.assertEquals(entity.getExpected(),context.isEnabled());
    }

    @DataProvider
    public Object[][] dataProviderOff(){
        return new Object[][]{
                {new TestEntity("Flow MLA DIRECT", "MLA", "DIRECT", false)},
                {new TestEntity("Flow MLB DIRECT", "MLB", "DIRECT", false)},
                {new TestEntity("Flow MLA CART", "MLA", "CART", false)},
                {new TestEntity("Flow MLB CART", "MLB", "CART", false)},
                {new TestEntity("Flow MLM CART", "MLM", "CART", false)}
        };
    }

    @org.testng.annotations.Test(dataProvider = "dataProviderOff")
    public void offToggleContextTest (TestEntity entity){
        FeatureContext featureContext = new FeatureContext(entity.getSite(), entity.getFlow());
        ToggleContext context = new OffToggleContext(featureContext);
        Assert.assertEquals(entity.getExpected(),context.isEnabled());
    }

    @DataProvider
    public Object[][] dataProviderOn(){
        return new Object[][]{
                {new TestEntity("Flow MLA DIRECT", "MLA", "DIRECT", true)},
                {new TestEntity("Flow MLB DIRECT", "MLB", "DIRECT", true)},
                {new TestEntity("Flow MLA CART", "MLA", "CART", true)},
                {new TestEntity("Flow MLB CART", "MLB", "CART", true)},
                {new TestEntity("Flow MLM CART", "MLM", "CART", true)}
        };
    }

    @org.testng.annotations.Test(dataProvider = "dataProviderOn")
    public void onToggleContextTest (TestEntity entity){
        FeatureContext featureContext = new FeatureContext(entity.getSite(), entity.getFlow());
        ToggleContext context = new OnToggleContext(featureContext);
        Assert.assertEquals(entity.getExpected(),context.isEnabled());
    }

    @DataProvider
    public Object[][] dataProviderBusinessLogic(){
        return new Object[][]{
                {new TestEntity("Flow MLA DIRECT", "MLA", "DIRECT", true)},
                {new TestEntity("Flow MLB DIRECT", "MLB", "DIRECT", true)},
                {new TestEntity("Flow MLA CART", "MLA", "CART", true)},
                {new TestEntity("Flow MLB CART", "MLB", "CART", true)},
                {new TestEntity("Flow MLM CART", "MLM", "CART", true)}
        };
    }

    @org.testng.annotations.Test(dataProvider = "dataProviderBusinessLogic")
    public void businessLogicToggleContextTest (TestEntity entity){
        FeatureContext featureContext = new FeatureContext(entity.getSite(), entity.getFlow());
        ToggleContext context = new BusinessToggleContext(featureContext);
        Assert.assertEquals(entity.getExpected(),context.isEnabled());
    }
}