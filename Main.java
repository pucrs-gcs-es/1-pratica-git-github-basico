import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(2);
        lista1.add(4);
        lista1.add(5);
        lista1.add(1);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(2);
        lista2.add(8);

        // a. Número de ocorrências do elemento 2 na lista1
        int ocorrencias = ListaUtils.nOcorrencias(lista1, 2);
        System.out.println("Ocorrências do número 2: " + ocorrencias);

        // b. Verificar se há elementos repetidos em lista1
        boolean hasRepetidos = ListaUtils.hasRepeat(lista1);
        System.out.println("Lista 1 tem elementos repetidos? " + hasRepetidos);

        // c. Número de elementos repetidos em lista1
        int numRepetidos = ListaUtils.nroRepeat(lista1);
        System.out.println("Número de elementos repetidos em lista 1: " + numRepetidos);

        // d. Lista de elementos repetidos em lista1
        ArrayList<Integer> repetidos = ListaUtils.listRepeat(lista1);
        System.out.println("Elementos repetidos em lista 1: " + repetidos);

        // e. União das listas lista1 e lista2
        ArrayList<Integer> uniao = ListaUtils.union(lista1, lista2);
        System.out.println("União de lista 1 e lista 2: " + uniao);

        // f. Interseção das listas lista1 e lista2
        ArrayList<Integer> intersecao = ListaUtils.intersect(lista1, lista2);
        System.out.println("Interseção de lista 1 e lista 2: " + intersecao);
    }
}
