package com.senac;

public class Main {

    public static void main(String[] args) {

        int horas = 8;
        int dias = 30;
        double jrHora = 25;
        double plHora = 45;
        double srHora = 65;

        double jrDia = horas * jrHora;
        double plDia = horas * plHora;
        double srDia = horas * srHora;

        double jrMes = jrDia * dias;
        double plMes = plDia * dias;
        double srMes = srDia * dias;

        System.out.println("Juninho trabalha " + horas + " por dia, ganhando por hora " + jrHora);
        System.out.println("   Ou seja Juninho recebe " + jrDia + " por dia");
        System.out.println("Juninho recebe " + jrMes + " como Programador Jr");

        System.out.println("---------------------------------------------------------------");

        System.out.println("Cleyton trabalha " + horas + " por dia, ganhando por hora " + plHora);
        System.out.println("   Ou seja Cleyton recebe " + plDia + " por dia" );
        System.out.println("Juninho recebe " + plMes + " como Programador Pleno");

        System.out.println("---------------------------------------------------------------");

        System.out.println("Xande trabalha " + horas + " por dia, ganhando por hora " + srHora);
        System.out.println("   Ou seja Xande recebe " + srDia + " por dia" );
        System.out.println("Juninho recebe " + srMes + " como Programador Senior");

        System.out.println("---------------------------------------------------------------");




    }
}
