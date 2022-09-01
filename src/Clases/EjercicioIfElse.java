package Clases;
/*
    Se desea desarrollar un programa que calcule el índice de masa corporal de
    una persona. Para ello, se requiere definir el peso de la persona (en kilogramos)
     y su estatura (en metros).
    El índice de masa corporal (IMC) se calcula
    utilizando la siguiente fórmula:
    IMC = peso/estatura*2
 */

import java.util.Scanner;

public class EjercicioIfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso: ");
        int peso = scanner.nextInt();//peso en kilogramos
        System.out.println("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();//estatura en metros
        double resultado = obtenerImc(peso, estatura);
        String estado = obtenerEstado(resultado);
        System.out.println("El estado del IMC(" + resultado + ") es: " + estado);
    }

    /**
     * Mediante Varios If-Else anidados se evalúan
     * diferentes rangos del IMC
     * @param resultado es la masa corporal
     * @return regresa un mensaje de acuerdo al estado
     * de la masa corporal
     */
    private static String obtenerEstado(double resultado) {
        String mensaje = "";
        if (resultado < 16){
            mensaje = "Delgadez Severa";
        } else if (resultado >= 16 && resultado <= 17) {
            mensaje = "Delgadez Leve";
        } else if (resultado > 17 && resultado <= 18.5) {
            mensaje =  "Delgadez Moderada";
        } else if (resultado >= 18 && resultado <= 25) {
            mensaje = "Peso Normal";
        } else if (resultado > 25 && resultado <= 30) {
            mensaje = "Sobrepeso";
        } else if (resultado > 30 && resultado <= 35) {
            mensaje = "Obesidad Leve";
        } else if (resultado > 35 && resultado < 40) {
            mensaje = "Obesidad Moderada";
        } else if (resultado >= 40) {
            mensaje = "Obesidad Mórbida";
        }
        return mensaje;
    }

    /**
     * Calcula el índice de masa corporal
     * @param peso en kilogramos
     * @param estatura en metros
     * @return la masa corporal
     */
    private static double obtenerImc(int peso, double estatura) {
        return peso / Math.pow(estatura,2);
    }

}
