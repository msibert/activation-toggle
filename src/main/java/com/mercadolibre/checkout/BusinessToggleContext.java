package com.mercadolibre.checkout;

import com.mercadolibre.checkout.toggle.context.ToggleContext;
import com.mercadolibre.checkout.toggle.feature.FeatureContext;
import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.toggles.BusinessFeatureToggle;



/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class BusinessToggleContext extends FeatureContext implements ToggleContext {

    private final FeaturesToggles toggles;


    public BusinessToggleContext(FeatureContext context) {
        super(context.getSiteId(),context.getFlow());
        this.toggles = new BusinessFeatureToggle();
    }

    @Override
    public boolean featureAppliesToContext() {
        return true; //heavy business logic
    }


    @Override
    public boolean isEnabled() {
        return super.isFeatureEnabled(toggles);
    }
}
