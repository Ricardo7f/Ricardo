public class Onibus extends veiculo {

    int numero_Assentos;

    public Onibus(String placa, int ano, int numero_Assentos) {
        super(placa, ano);
        this.numero_Assentos = numero_Assentos;
    }

    public int getNumero_Assentos() {
        return numero_Assentos;
    }

    public void setNumero_Assentos(int numero_Assentos) {
        this.numero_Assentos = numero_Assentos;
    }

    public void onibus() {
        System.out.println(" ------------------DADOS ÔNIBUS-----------------------");
    }

    public void dados() {

        System.out.printf("\nPlaca: %s\nAno: %d\nNúmero de Assentos: %d\n\n", placa, ano, numero_Assentos);
    }

}