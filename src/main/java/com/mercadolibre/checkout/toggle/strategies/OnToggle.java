package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;

/**
 * Utilizar este toggle para encender una feature
 */
public class OnToggle implements ToggleStrategy {


    @Override
    public boolean isOn(FeatureContext featureContext) {
        return true;
    }
}
