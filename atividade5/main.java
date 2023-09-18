
class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(int velocidade) {
        System.out.println("O veículo acelerou para " + velocidade + " km/h");
    }

    public void frear() {
        System.out.println("O veículo freou");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("O carro acelerou para " + velocidade + " km/h");
    }

    public void abrirPortas() {
        System.out.println("As portas do carro foram abertas.");
    }
}

class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean possuiPartidaEletrica) {
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("A moto acelerou para " + velocidade + " km/h");
    }

    public void ligarPartidaEletrica() {
        if (possuiPartidaEletrica) {
            System.out.println("A partida elétrica da moto foi ligada.");
        } else {
            System.out.println("A moto não possui partida elétrica.");
        }
    }
}


class Bicicleta extends Veiculo {
    private int numeroMarchas;

    public Bicicleta(String marca, String modelo, int ano, int numeroMarchas) {
        super(marca, modelo, ano);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("A bicicleta acelerou para " + velocidade + " km/h");
    }

    public void trocarMarcha(int marcha) {
        System.out.println("A bicicleta trocou para a marcha " + marcha);
    }
}

public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CBR600RR", 2021, true);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite 30", 2020, 21);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();
        carro.abrirPortas();
        carro.acelerar(80);
        carro.frear();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
        moto.ligarPartidaEletrica();
        moto.acelerar(120);
        moto.frear();

        System.out.println("\nInformações da Bicicleta:");
        bicicleta.exibirInformacoes();
        bicicleta.trocarMarcha(3);
        bicicleta.acelerar(25);
        bicicleta.frear();
    }
}
