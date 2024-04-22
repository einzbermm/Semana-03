/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JEFF
 */
public class Operaciones {
    public static double calcularMedia(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public static double calcularModa(double[] datos) {
        Map<Double, Integer> frecuencia = new HashMap<>();

        // Contar la frecuencia de cada dato
        for (double dato : datos) {
            frecuencia.put(dato, frecuencia.getOrDefault(dato, 0) + 1);
        }

        double moda = 0;
        int maxFrecuencia = 0;

        // Encontrar el dato con mayor frecuencia
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        return moda;
    }

    public static double calcularMediana(double[] datos) {
        Arrays.sort(datos);
        int n = datos.length;
        if (n % 2 == 0) {
            return (datos[n / 2 - 1] + datos[n / 2]) / 2.0;
        } else {
            return datos[n / 2];
        }
    }

    public static double calcularDesviacionEstandar(double[] datos) {
        double media = calcularMedia(datos);
        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - media, 2);
        }
        return Math.sqrt(sumaCuadrados / datos.length);
    }

    public static double calcularVarianza(double[] datos) {
        double media = calcularMedia(datos);
        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - media, 2);
        }
        return sumaCuadrados / datos.length;
    }
}