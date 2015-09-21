package mx.iteso;

import mx.iteso.strategy.LifeSaver.ArmBands;
import mx.iteso.strategy.LifeSaver.SwimRing;
import mx.iteso.strategy.LifeSaver.SwimSeat;
import mx.iteso.strategy.Lifesaver;


public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.floating());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.floating());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.performDeflate());
            System.out.println(armBands.floating());
        }
}
