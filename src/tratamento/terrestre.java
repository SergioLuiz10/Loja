package tratamento;

public class terrestre implements fa {
    protected String nome;

    public terrestre(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar() {
        System.out.println("O veículo terrestre " + nome + " foi ligado.");
    }

    @Override
    public void moverFrente() {
        System.out.println("O veículo terrestre " + nome + " está andando para frente.");
    }

    @Override
    public void moverTras() {
        System.out.println("O veículo terrestre " + nome + " está dando ré.");
    }

    @Override
    public void desligar() {
        System.out.println("O veículo terrestre " + nome + " foi desligado.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
