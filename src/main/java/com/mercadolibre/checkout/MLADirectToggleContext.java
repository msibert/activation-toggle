package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.toggles.MLADirectOnFeatureToggle;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class MLADirectToggleContext extends FeatureContext implements ToggleContext {
    private final FeaturesToggles toggles;


    public MLADirectToggleContext(FeatureContext context){
        super(context.getSiteId(),context.getFlow());
        this.toggles = new MLADirectOnFeatureToggle();
    }


    @Override
    public boolean isEnabled() {
        return super.isFeatureEnabled(toggles);
    }
}
