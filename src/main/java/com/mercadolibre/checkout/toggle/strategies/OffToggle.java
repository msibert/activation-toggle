package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;

/**
 * Utilizar este toggle para apagar una feature
 */
public class OffToggle implements ToggleStrategy {


    @Override
    public boolean isOn(FeatureContext featureContext) {
        return false;
    }
}
