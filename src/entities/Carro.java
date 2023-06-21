package entities;
public class Carro implements Comparable<Carro> {

    public int prioridade;
    public String nome;
    public String tipo;

    public int getPrioridade() {
        return prioridade;
    }

    public Carro(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void definirPrioridade() {
        switch (tipo) {
            case "esportivo":
                this.prioridade = 4;
                break;
            case "suv":
                this.prioridade = 3;
                break;
            case "sedan":
                this.prioridade = 2;
                break;
            case "hatch":
                this.prioridade = 1;
                break;
        }
    }
    @Override
    public int compareTo(Carro o) {
        if (this.prioridade > o.getPrioridade()) {
                return 1;
        }
        if (this.prioridade < o.getPrioridade()) {
            return -1;
        } else {
            return 0;
        }

    }
    @Override
    public String toString() {
        return nome;
    }
}
