package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;


public interface  ToggleStrategy {
    boolean isOn(FeatureContext featureContext);
}
