import java.util.ArrayList;
import java.util.HashSet;

public class ListaUtils {

    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer elemento : l) {
            if (elemento.equals(el)) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasRepeat(ArrayList<Integer> l) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (Integer elemento : l) {
            if (!uniqueElements.add(elemento)) {
                return true; // Se o elemento já estiver no HashSet, é repetido.
            }
        }
        return false; // Se todos os elementos forem únicos.
    }

    public static int nroRepeat(ArrayList<Integer> l) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        int repeatCount = 0;
        for (Integer elemento : l) {
            if (!uniqueElements.add(elemento)) {
                repeatCount++;
            }
        }
        return repeatCount;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> repeatedElements = new HashSet<>();
        for (Integer elemento : l) {
            if (!uniqueElements.add(elemento)) {
                repeatedElements.add(elemento);
            }
        }
        return new ArrayList<>(repeatedElements);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> unionSet = new HashSet<>(l1);
        unionSet.addAll(l2);
        return new ArrayList<>(unionSet);
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> set1 = new HashSet<>(l1);
        set1.retainAll(l2);
        return new ArrayList<>(set1);
    }
}
