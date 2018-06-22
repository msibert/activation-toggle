package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;

import java.util.ArrayList;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class DefaultToggleContext extends FeatureContext implements ToggleContext {

    private final FeaturesToggles toggles;


    public DefaultToggleContext(){
        super("","");
        this.toggles = new FeaturesToggles(){
            @Override
            public List<String> getEnabledSites() {
                return new ArrayList<>();
            }
        };
    }


    @Override
    public boolean isEnabled() {
        return super.isFeatureEnabled(toggles);
    }
}
