package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.toggles.OnFeatureToggle;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class OnToggleContext extends FeatureContext implements ToggleContext  {
    private final FeaturesToggles toggles;


    public OnToggleContext(FeatureContext context) {
        super(context.getSiteId(),context.getFlow());
        this.toggles = new OnFeatureToggle();
    }


    @Override
    public boolean isEnabled() {
        return super.isFeatureEnabled(toggles);
    }
}
