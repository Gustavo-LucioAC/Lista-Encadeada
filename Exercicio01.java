import java.util.LinkedList;

public class Exercicio01 
{
    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int[] vetor = TransformaVetor(lista);
        for (int elementos : vetor)
        {
            System.out.println(elementos);
        }
    }
    public static int[] TransformaVetor(LinkedList<Integer> lista)
    {
        int[] vetor = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++ )
        {
            vetor[i] = lista.get(i);
        }
        return vetor;
    }
}
