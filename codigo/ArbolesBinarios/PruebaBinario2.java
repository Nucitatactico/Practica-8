public class PruebaBinario2 {
	public static void main(String[] args) {
		ArbolBinario arbol = new ArbolBinario();

		arbol.insertar(null, 10, true);
		Nodo raiz = arbol.raiz;

		arbol.insertar(raiz, 12, true);
		arbol.insertar(raiz, 20, false);

		Nodo n12 = arbol.buscar(12);
		arbol.insertar(n12, 40, true);

		Nodo n40 = arbol.buscar(40);
		arbol.insertar(n40, 33, true);
		arbol.insertar(n40, 18, false);

		Nodo n20 = arbol.buscar(20);
		arbol.insertar(n20, 65, true);
		arbol.insertar(n20, 13, false);

		Nodo n65 = arbol.buscar(65);
		arbol.insertar(n65, 73, true);
		arbol.insertar(n65, 19, false);

		Nodo n13 = arbol.buscar(13);
		arbol.insertar(n13, 34, true);
		arbol.insertar(n13, 25, false);

		Nodo n34 = arbol.buscar(34);
		arbol.insertar(n34, 6, false);

		System.out.println("Arbol:");
		arbol.imprimirArbol();

		System.out.println("Preorden:");
		arbol.preorden(arbol.raiz);

		System.out.printf("\nInorden:\n");
		arbol.inorden(arbol.raiz);

		System.out.printf("\nPosorden:\n");
		arbol.posorden(arbol.raiz);
		System.out.println("");
	}
}
