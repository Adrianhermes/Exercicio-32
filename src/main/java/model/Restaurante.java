package model;

public class Restaurante extends Empresa {

    private String tipoComida;
    private double precoMedio;

    // Construtor padrão
    public Restaurante() {
        super();
        this.tipoComida = "";
        this.precoMedio = 0.0;
    }

    // Construtor com parâmetros
    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
            String tipoComida, double precoMedio) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    // Sets
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    // Gets
    public String getTipoComida() {
        return tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    // Método para imprimir os dados
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio do prato: R$ " + precoMedio);
    }
}
