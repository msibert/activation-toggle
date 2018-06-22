package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.toggles.OffFeatureToggle;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class OffToggleContext extends FeatureContext implements ToggleContext  {
    private final FeaturesToggles toggles;


    public OffToggleContext(FeatureContext context) {
        super(context.getSiteId(),context.getFlow());
        this.toggles = new OffFeatureToggle();
    }


    @Override
    public boolean isEnabled() {
        return super.isFeatureEnabled(toggles);
    }
}
