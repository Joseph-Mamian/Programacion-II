
package com.mycompany.sportscenter;

import com.mycompany.sportscenter.scenario.Scenario;
import com.mycompany.sportscenter.sportsCenter.SportCenter;


public class SportsCenter {

    public static void main(String[] args) {
        
         SportCenter sportCenter = new SportCenter("Elcampin", "ASD", "Bogota", "24 horas" );
                
             Scenario scenario1 = new Scenario(1800, TypeSport.BASKETBALL, "24 horas");
              Scenario scenario2 = new Scenario(400, TypeSport.SOCCER, " 24 horas");
                
                sportCenter.addScenario(scenario1);
                sportCenter.addScenario(scenario2);
                
                sportCenter.bookScenario(scenario1);
                sportCenter.bookScenario(scenario2);
                sportCenter.bookScenario(scenario1);
    }
}
