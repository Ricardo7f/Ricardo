public class Caminhao extends veiculo {

    int numero_eixos;
    double peso_MxCarga;

    public Caminhao(String placa, int ano, int numero_eixos, double peso_MxCarga) {
        super(placa, ano);
        this.numero_eixos = numero_eixos;
        this.peso_MxCarga = peso_MxCarga;
    }

    public int getNumero_eixos() {
        return numero_eixos;
    }

    public void setNumero_eixos(int numero_eixos) {
        this.numero_eixos = numero_eixos;
    }

    public double getPeso_MxCarga() {
        return peso_MxCarga;
    }

    public void setPeso_MxCarga(double peso_MxCarga) {
        this.peso_MxCarga = peso_MxCarga;
    }

    public void caminhao() {
        System.out.println("------------------DADOS CAMINHÃO-----------------------");
    }

    public void dados() {
        System.out.printf("\nPlaca: %s\nAno: %d\nNúmero de eixos: %d\nNúmero máximo de carga: %.2f Kg\n\n", placa, ano,
                numero_eixos, peso_MxCarga);
    }

}