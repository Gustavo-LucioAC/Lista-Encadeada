import java.util.LinkedList;

public class Exercicio02 {
    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        ListaReversa(lista);
        LinkedList<Integer> vetor = ListaReversa(lista);
        for (int elementos : vetor)
        {
            System.out.println(elementos);
        }
    }
    public static LinkedList<Integer> ListaReversa(LinkedList<Integer> lista)
    {
        LinkedList<Integer> listaReversa = new LinkedList<>();
        for(int i = lista.size()-1; i >= 0; i--)
        {
            listaReversa.add(lista.get(i));
        }
        return listaReversa;
    }
}
