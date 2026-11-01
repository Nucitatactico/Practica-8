/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edgar
 */
public class PruebaBBusqueda {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        abb.insertar(50);
        abb.insertar(30);
        abb.insertar(70);
        abb.insertar(20);
        abb.insertar(40);
        abb.insertar(60);
        abb.insertar(80);

	for(int i=1;i<=7;i++)
		abb.insertar(15+i*10);

        System.out.println("Recorrido Inorden:");
        abb.inorden(abb.raiz);
        System.out.println("\nRecorrido Preorden:");
        abb.preorden(abb.raiz);
        System.out.println("\nRecorrido Posorden:");
        abb.posorden(abb.raiz);

        // Imprimir arbol de forma clara
        System.out.println("\nRepresentacion del Arbol:");
        abb.imprimirArbol();

	for(int i=1;i<=5;i++)
		abb.eliminar(15*i);

        System.out.println("\nRepresentacion del Arbol tras borrar multiplos de 15:");
        abb.imprimirArbol();
        System.out.println("Recorrido Inorden:");
        abb.inorden(abb.raiz);
        System.out.println("\nRecorrido Preorden:");
        abb.preorden(abb.raiz);
        System.out.println("\nRecorrido Posorden:");
        abb.posorden(abb.raiz);
    }
}
