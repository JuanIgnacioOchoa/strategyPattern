package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

/**
 * Created by Juan on 20/09/2015.
 */
public class NotFlotation implements FlotationBehavior {
    public String flotation() {
        return "I can't float";
    }
}
