package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;

/**
 * Utilizar este toggle cuando la feature aplica a cart vs carrito
 */
public class MainGoalToggle implements ToggleStrategy {


    @Override
    public boolean isOn(FeatureContext featureContext) {
        return featureContext.featureAppliesToMainGoal(featureContext.getFlow());
    }
}
