package com.mercadolibre.checkout.toggle.toggles;

import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.strategies.OnToggle;
import com.mercadolibre.checkout.toggle.strategies.ToggleStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class OnFeatureToggle extends FeaturesToggles {

    @Override
    public Collection<ToggleStrategy> getToggleStrategies(){
        return Arrays.asList(new OnToggle());
    }

    @Override
    public List<String> getEnabledSites() {
        return new ArrayList<>();
    }
}
