package com.androiddesdecero.stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //probandoStack();
        probandoColas();
    }


    /*
    Stack -> Implementa algoritmo LIFO. Last Input First Output
    Stack -> Apilar una pila
    Api Collectins nos facilita la vida
     */

    private void probandoStack(){
        Stack<String> pila = new Stack<>();
        //Agregar elementos
        pila.push("Primero");
        pila.push("Segundo");
        pila.push("Tercero");
        pila.push("Cuarto");

        for(String posicion : pila){
            Log.d("TAG1", posicion);
        }


        /*
        Simulamos metodos de Stack
         */
        //Peek -> Nos devuelve el objeto que esta en la posicación top de la pila. Pero no lo remueve de
        //la pila
        Log.d("TAG1", "Comprobando metodo peek -> " + pila.peek());
        //Search -> Devuelve la posición de un objeto en partircula
        //-1 -> No encuentra elemento
        //X -> Numero positivo. Ha encontrado elemento y nos indica la posición
        Log.d("TAG1", "Comprobando metodo search -> " + pila.search("Tercero"));
        //empty() Testea si esta vacia la lista
        Log.d("TAG1", "Comprobando si esta vacia -> " + pila.isEmpty());



        while(!pila.isEmpty()){
            //Pop -> Elimina el elemento de la pila y devuelve el objeto con su valor.
            Log.d("TAG1", "Obteniendo datos para operar con el -> " + pila.pop());
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    /*
    Queue -> Implementa algoritmo FIFO. First Input First Output
    Queue -> Son como las colas en la vida real. El primero que entra es el primero en ser atendido
    Api Collectins nos facilita la vida
    */

    private void probandoColas(){
        Queue<String> cola = new PriorityQueue<>();
        cola.add("Primero");
        cola.add("Segundo");
        cola.add("Tercero");
        cola.add("Cuarto");
        cola.add("QUIM");

        while(!cola.isEmpty()){
            Log.d("TAG1", "toca atender a la posición: " + cola.poll());
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
        
    }

}
