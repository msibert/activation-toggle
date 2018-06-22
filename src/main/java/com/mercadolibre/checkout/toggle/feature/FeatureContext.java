package com.mercadolibre.checkout.toggle.feature;

/**
 * Mercado Libre - CHO
 * Created on 22/6/18.
 */
public class FeatureContext {

    private final String siteId;
    private final String flow; //CART vs DIRECT
    private FeaturesToggles featureToggle;

    public FeatureContext(String siteId, String flow){
        this.siteId = siteId;
        this.flow = flow;
    }


    public String getFlow() {
        return flow;
    }

    public String getSiteId() {
        return siteId;
    }

    /**
     * Evalua si una determinada feature pasada por parámetro esta encendida o no.
     * Esta encendida si todas las estrategias de toggle asociadas a la featrue dan true.
     *
     * @param featureToggle
     * @return
     */
    public boolean isFeatureEnabled(FeaturesToggles featureToggle) {
        this.featureToggle = featureToggle;
        return featureToggle.getToggleStrategies().stream()
                .allMatch(toggle -> toggle.isOn(this));
    }

    public boolean featureAppliesToSite(String siteId) {
        return (featureToggle !=null) && featureToggle.getEnabledSites().contains(siteId);
    }

    public boolean featureAppliesToContext() {
        return false;
    }

    public boolean featureAppliesToMainGoal(String mainGoal) {
        return (featureToggle!=null) && featureToggle.getEnabledMainGoals().contains(mainGoal);
    }
}
