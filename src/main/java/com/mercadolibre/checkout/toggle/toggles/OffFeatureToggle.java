package com.mercadolibre.checkout.toggle.toggles;

import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.strategies.OffToggle;
import com.mercadolibre.checkout.toggle.strategies.SiteToggle;
import com.mercadolibre.checkout.toggle.strategies.ToggleStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class OffFeatureToggle extends FeaturesToggles {

    @Override
    public Collection<ToggleStrategy> getToggleStrategies(){
        return Arrays.asList(new OffToggle(), new SiteToggle());
    }

    @Override
    public List<String> getEnabledSites() {
        return new ArrayList<>();
    }
}
