package com.mercadolibre.checkout.toggle.toggles;

import com.mercadolibre.checkout.toggle.feature.FeaturesToggles;
import com.mercadolibre.checkout.toggle.strategies.MainGoalToggle;
import com.mercadolibre.checkout.toggle.strategies.SiteToggle;
import com.mercadolibre.checkout.toggle.strategies.ToggleStrategy;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class MLADirectOnFeatureToggle extends FeaturesToggles {

    @Override
    public Collection<ToggleStrategy> getToggleStrategies(){
        return Arrays.asList(new SiteToggle(), new MainGoalToggle());
    }

    @Override
    public List<String> getEnabledSites(){
        return Arrays.asList("MLA");
    }

    @Override
    public List<String> getEnabledMainGoals() {
        return Arrays.asList("DIRECT");
    }
}
