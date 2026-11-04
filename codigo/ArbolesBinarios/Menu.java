import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        ArbolBinario ab = new ArbolBinario();
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        String[] principal = {"","Arbol Binario", "Arbol Binario de Busqueda", "Salir"};
        int opcion;

        do
        {
            opcion = menu(principal);

            switch(opcion)
            {
                case 1:     opercaionesBinario(ab);
                    break;
                case 2:     opercaionesBinarioBusqueda(abb);
                    break;
                case 3:     System.out.println("Hasta la proxima ;)");
                    break;
                default:    System.out.println("Intente de nuevo");
                    break;
            }
        }while(opcion != 3);
    }

    public static void opercaionesBinarioBusqueda(ArbolBinarioBusqueda abb)
    {
        String[] opciones = {"Arboles binarios de busqueda", "Insertar", "Eliminar", "Busqueda", "Imprimir", "Preorden", "Inorde", "Postorden", "Salir"};
        int opcion;

        do
        {
            opcion = menu(opciones);

            switch(opcion)
            {
                case 1:     abb.insertar(Integer.parseInt(ingresar("Ingrese el valor a ingresar")));
                    break;
                case 2:     abb.eliminar(Integer.parseInt(ingresar("Ingresa el valor a eliminar")));
                    break;
                case 3:     System.out.println((abb.buscar(Integer.parseInt(ingresar("Ingresa el valor a buscar"))) != null ? "Encontrado" : "No encontrado"));
                    break;
                case 4:     abb.imprimirArbol();
                    break;
                case 5:     abb.preorden(abb.raiz);
                    break;
                case 6:     abb.inorden(abb.raiz);
                    break;
                case 7:     abb.posorden(abb.raiz);
                    break;
                case 8:     System.out.println("Regresando al menu principal");
                    break;
                default:    System.out.println("Vuelve a intentarlo");
                    break;
            }

        }while(opcion != 8);
    }
    
    public static void opercaionesBinario(ArbolBinario ab)
    {
        String[] opciones = {"Arboles binarios", "Insertar", "Eliminar", "Busqueda", "Imprimir", "Preorden", "Inorde", "Postorden", "Salir"};
        int opcion;
        Nodo padre;
        boolean izquierdo;

        do
        {
            opcion = menu(opciones);

            switch(opcion)
            {
                case 1:     
                            if(ab.raiz != null)
                            {
                                padre = ab.buscar(Integer.parseInt(ingresar("Ingresa la clave del nodo padre donde quieres ingresar")));
                                
                                if(padre == null)
                                {
                                    System.out.println("Nodo no encontrado");
                                    break;
                                }
                                
                                izquierdo = (ingresar("Se ingresa el nuevo nodo a la izquierda del nodo anterior? y/n").compareToIgnoreCase("y") == 0? true : false);
                                
                                ab.insertar(padre , Integer.parseInt(ingresar("Ingrese el valor a ingresar")), izquierdo);
                            }
                            else
                                ab.insertar(ab.raiz, Integer.parseInt(ingresar("Ingrese el valor a ingresar")), true );

                    break;
                case 2:     ab.eliminar(Integer.parseInt(ingresar("Ingresa el valor a eliminar")));
                    break;
                case 3:     System.out.println((ab.buscar(Integer.parseInt(ingresar("Ingresa el valor a buscar"))) != null ? "Encontrado" : "No encontrado"));
                    break;
                case 4:     ab.imprimirArbol();
                    break;
                case 5:     ab.preorden(ab.raiz);
                    break;
                case 6:     ab.inorden(ab.raiz);
                    break;
                case 7:     ab.posorden(ab.raiz);
                    break;
                case 8:     System.out.println("Regresando al menu principal");
                    break;
                default:    System.out.println("Vuelve a intentarlo");
                    break;
            }

        }while(opcion != 8);
    }

    public static int menu(String[] opciones)
    {
        System.out.println("\n\t" + opciones[0]);

        for(int i = 1; i < opciones.length; i++)
            System.out.println(i + ". " + opciones[i]);

        return Integer.parseInt(ingresar("Selecciona opcion"));
    }

    public static String ingresar(String mensaje)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print(mensaje + ": ");
            
        return entrada.nextLine();
    }
}