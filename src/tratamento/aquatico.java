package tratamento;

public class aquatico implements fa {
    protected String nome;

    public aquatico(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar() {
        System.out.println("O veículo aquático " + nome + " foi ligado.");
    }

    @Override
    public void moverFrente() {
        System.out.println("O veículo aquático " + nome + " está andando para frente.");
    }

    @Override
    public void moverTras() {
        System.out.println("O veículo aquático " + nome + " está dando ré.");
    }

    @Override
    public void desligar() {
        System.out.println("O veículo aquático " + nome + " foi desligado.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
