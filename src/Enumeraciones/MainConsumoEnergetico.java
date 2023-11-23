package Enumeraciones;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainConsumoEnergetico {

    public static void main(String[] args) {

        EnumConsumoEnergetico ce1 =  EnumConsumoEnergetico.A;

        EnumConsumoEnergetico ce2 = EnumConsumoEnergetico.F;

        System.out.println(ce1.name());
        System.out.println(ce2.name());

        for (int i = 0; i < ce1.l; i++) {

        }
    }

}
