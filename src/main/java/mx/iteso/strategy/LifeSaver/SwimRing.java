package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatation;

public class SwimRing extends Lifesaver{
    public SwimRing() {
        type = "Swim ring";
        deflateBehavior = new Deflatable();
        floatingBehavior = new Floatation();
    }
}
