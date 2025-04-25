/**
 * Classe que representa um carro no sistema.
 */
public class Carro {

    // Propriedades (caracteristicas)
    String marca;
    String modelo;
    int ano;

    // Metodo para Ligar o carro
    void ligar() {
        System.out.println("O carro está ligado.");
    }

    // Metodo para Buzinar
    void buzinar() {
        System.out.println("Buzina!");
    }

    void marca() {
        System.out.println(this.marca);
    }

    void modelo() {
        System.out.println(this.modelo);
    }

    // Metodo execucao de testes
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Argo";
        meuCarro.ano = 2022;

        meuCarro.ligar();
        meuCarro.buzinar();
        meuCarro.marca();
        meuCarro.modelo();
    }
}