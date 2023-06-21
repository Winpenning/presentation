import entities.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esc = 0;
        while (esc != -1){
            esc = sc.nextInt();
            sc.nextLine();
            switch (esc){
                case 1:

                    break;
                case 2:
                    StringOrdemNatural();
                    ComandosPQ();
                    StringOrdemReversa();
                    break;
                case 3:
                    henriquepresentation(sc);
                    break;
            }
        }


    }
    protected static void henriquepresentation(Scanner sc) {

        Carro carro1 = new Carro("gol","hatch");
        carro1.definirPrioridade();
        Carro carro2 = new Carro("corvette","esportivo");
        carro2.definirPrioridade();
        Carro carro3 = new Carro("spin","suv");
        carro3.definirPrioridade();

        System.out.println(carro1.compareTo(carro2));
        System.out.println(carro2.compareTo(carro1));
        System.out.println(carro3.compareTo(carro1));
    }
    private static void ComandosPQ() {
        Queue<String> testePQ = new PriorityQueue<>();
        testePQ.add("abcd");
        testePQ.add("1234");
        testePQ.add("12ab");
        testePQ.add("xyzz");
        testePQ.add("azef");

        System.out.println("\nComandos da Priority Queue\n");
        System.out.println("Priority Queue: " + testePQ);

        System.out.println("\nVisualizar o elemento com maior prioridade (peek): " + testePQ.peek());

        System.out.println("\nDesenfileirar o elemento com maior prioridade (poll): " + testePQ.poll());
        System.out.println("Priority Queue: " + testePQ);

        System.out.println("\nAdiciona o elemento ghli (add ou offer): " + testePQ.add("ghli"));
        System.out.println("Priority Queue: " + testePQ);

        System.out.println("\nRemove o elemento 12ab (remove): " + testePQ.remove("12ab"));
        System.out.println("Priority Queue: " + testePQ);

        System.out.println("\nRemove um elemento nao existente: " + testePQ.remove("wwww"));
        System.out.println("Priority Queue: " + testePQ);

        System.out.println("\nVerifica se contém um elemento (contains): " + testePQ.contains("xyzz"));

        System.out.println("\nNumero de elementos na lista (size): " + testePQ.size());

        System.out.println("\nTransforma em matriz (toArray): ");
        Object[] matriz = testePQ.toArray();
        System.out.println("\nArray:" + Arrays.toString(matriz));

        System.out.println("\nTransforma em iterator (iterator): ");
        Iterator it = testePQ.iterator();
        System.out.println("Iterator: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Limpa todos os elementos da Priority Queue (clear):");
        testePQ.clear();
        System.out.println("Priority Queue: " + testePQ);
    }
    private static void StringOrdemNatural() {
        Queue<String> stringsON = new PriorityQueue<>();
        stringsON.offer("abcd");
        stringsON.offer("1234");
        stringsON.offer("57bc");
        stringsON.offer("pqrs");
        stringsON.offer("a158");

        System.out.println("\n Strings Ordenadas em Ordem natural:\n");
        System.out.println("Priority Queue: " + stringsON);
        while (!stringsON.isEmpty()) {
            System.out.println(stringsON.poll());
        }
        System.out.println("Priority Queue: " + stringsON);
    }

    private static void StringOrdemReversa() {
        Queue<String> stringsReverse = new PriorityQueue<>(Collections.reverseOrder());
        stringsReverse.offer("abcd");
        stringsReverse.offer("1234");
        stringsReverse.offer("57bc");
        stringsReverse.offer("pqrs");
        stringsReverse.offer("a158");

        System.out.println("\n Priority queue usando comparator de Ordem Reversa:\n");
        System.out.println("Priority Queue (reverseOrder): ");
        while (!stringsReverse.isEmpty()) {
            System.out.println(stringsReverse.poll());
        }
        System.out.println("Priority Queue: " + stringsReverse);
    }
}