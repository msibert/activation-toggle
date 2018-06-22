package com.mercadolibre.checkout.toggle.feature;

import com.mercadolibre.checkout.toggle.strategies.OffToggle;
import com.mercadolibre.checkout.toggle.strategies.ToggleStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Implementación por default de una feature toggle
 * Cada feature especifica deberá sobreescribir la configuración necesaria
 * para tomar la decisión de on-off, teniendo en cuenta las estrategias que implementa.
 */
// @Smell @ricardobevi Esta clase al tener getters viola el principio "tell don't ask", deberíamos poder preguntarle a la clase si el experimento aplica o no directamente
public class FeaturesToggles {

   /**
    * Devuelve en conjunto de estrategias de toggle que queremos aplicar
    * a una determinada feature
    */
   public Collection<ToggleStrategy> getToggleStrategies(){
       return Arrays.asList(new OffToggle());
   }

   /**
    * Se utiliza para los experimentos de melidata.
    * Devuelve el name de la default variant
    */
   public String getDefaultVariant(){
       return "default";
   }

   /**
    * Se utiliza para los experimentos de melidata.
    * Devuelve el name del experimento.
    */
   public String getExperimentName(){
       return  "";
   }

   /**
    * Se utiliza para determinar si una determinada feature esta encendida o no.
    * Devuelve la lista de features encendidas
    */
   public List<String> getEnabledSites(){
       return new ArrayList<>();
   }

    /**
     * Se utiliza para determinar si una determinada feature esta encendida o no.
     * Devuelve la lista de goals a los que aplica
     */
    public List<String> getEnabledMainGoals(){
        return new ArrayList<>();
    }
}
