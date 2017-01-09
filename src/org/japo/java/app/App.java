/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//Importación de la clase Random.
import java.util.Random;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Instanciación de la clase Random.
        Random rnd = new Random(System.currentTimeMillis());

        //Variables Array.
        //Array con los días de la semana. 
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        //Array con las horas del día.
        int horaDia[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 00};
        //Array con la cantidad de lluvia que a caido cada hora del día por m2. 
        int lluviaHora[] = new int[24];

        //Variables.
        //Lluvia acumulada durante el día.
        int lluviaAcuDiara = 0;
        // Cantidad de lluvía total el lunes.
        int lluviaLunes = 0;
        // Media diaria de lluvia.
        int mediaLluviaDiaria = 0;
        //Lluvia acumulada durante la semana.
        int lluviaAcuSemana = 0;

        //Bucle que repite los 7 días de semana.
        for (int i = 0; i < 7; i++) {
            //Contador a 0 para acumuar el agua de cada día.
            lluviaAcuDiara = 0;
            //Mensaje con el día de la semana.
            System.out.println();   //Espacio estético.
            System.out.println();   //Espacio estético.
            System.out.println("Día...............: " + diasSemana[i]);
            System.out.println();   //Espacio estético.

            //Bucle que repite las 24 horas que tiene el día.
            for (int j = 0; j < 24; j++) {
                //Obtiene la lluvia aleatoria de cada hora del día.
                lluviaHora[j] = rnd.nextInt(200 - 0 + 1);
                //Acumula la cantidad de lluvía de ese día.
                lluviaAcuDiara = lluviaAcuDiara + lluviaHora[j];
                //Acumula la cantidad de lluvía de toda la semana.
                lluviaAcuSemana = lluviaAcuSemana + lluviaHora[j];
                // Media diaria de lluvia.
                mediaLluviaDiaria = lluviaAcuSemana / 7;
                //Mensaje con la lluvia que ha caido cada hora del día (Dentro del 2 Bucle "For") (Se repite 24 veces).
                System.out.printf("Hora...: %02d - Lluvia....: %d l/m2\n", horaDia[j], lluviaHora[j]);
            }
            //Mensaje con la lluvia acumulada al final de cada día de la semana (Dentro del 1 Bucle "For") (Se repite 7 veces).
            System.out.println();   //Espacio estético.
            System.out.printf("Día........: %s - Lluvia acumulada.....: %d l/m2\n", diasSemana[i], lluviaAcuDiara);
            //Lluvia acumulada durante la semana (Dentro del 1 Bucle "For") (Se repite 7 veces).
            System.out.printf("Lluvia semanal acumulada.....: %d l/m2\n", lluviaAcuSemana);
        }
        //Media diaria de lluvia (Fuera de ambos bucles "For").
        System.out.println("Media diaria de lluvia......: " + mediaLluviaDiaria);
    }

}
