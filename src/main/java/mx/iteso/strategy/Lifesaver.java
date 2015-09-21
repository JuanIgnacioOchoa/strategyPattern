package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior;
    public FlotationBehavior floatingBehavior;

    public String display() {
        return "I'm a " + type;
    }
    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String floating(){
        return floatingBehavior.flotation();
    }
}
