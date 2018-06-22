package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;

/**
 * Utilizar este toggle cuando la feature aplica a algunos sites
 */
public class SiteToggle implements ToggleStrategy {

    @Override
    public boolean isOn(FeatureContext featureContext) {
        return featureContext.featureAppliesToSite(featureContext.getSiteId());
    }
}
