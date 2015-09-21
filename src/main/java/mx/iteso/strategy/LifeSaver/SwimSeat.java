package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatation;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        type = "Swim seat";
        deflateBehavior = new Deflatable();
        floatingBehavior = new Floatation();
    }
}
