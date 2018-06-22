package com.mercadolibre.checkout.toggle.strategies;

import com.mercadolibre.checkout.toggle.feature.FeatureContext;

/**
 * Utilizar este toggle cuando tenemos lógica de negocio que queremos evaluar.
 */
public class BusinessContextToggle implements ToggleStrategy {


    @Override
    public boolean isOn(FeatureContext featureContext) {
        return featureContext.featureAppliesToContext();
    }


}
