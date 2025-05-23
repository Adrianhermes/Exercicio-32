
package principal;

import model.Empresa;
import model.Restaurante;

public class Principal {
    public static void main(String[] args) {
         //Classe Empresa
        Empresa empresa = new Empresa();

        empresa.setNome("Tech Soluções");
        empresa.setEndereco("Rua das Inovações, 123");
        empresa.setCidade("São Paulo");
        empresa.setEstado("SP");
        empresa.setCep("01234-567");
        empresa.setFone("(11) 99999-8888");

        empresa.imprimirDados();
  
        //Classe Restaurante
        Restaurante restaurante = new Restaurante();

        restaurante.setNome("Sabores do Sul");
        restaurante.setEndereco("Av. das Nações, 456");
        restaurante.setCidade("Porto Alegre");
        restaurante.setEstado("RS");
        restaurante.setCep("90123-456");
        restaurante.setFone("(51) 98888-7777");
        restaurante.setTipoComida("Comida Gaúcha");
        restaurante.setPrecoMedio(48.50);

        restaurante.imprimirDados();
    }
}

