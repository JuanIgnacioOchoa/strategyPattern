package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatation;

public class ArmBands extends Lifesaver{
    public ArmBands() {
        type = "Arm bands";
        deflateBehavior = new Deflatable();
        floatingBehavior = new Floatation();
    }
}
