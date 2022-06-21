public class Main {

    public static void main(String[] args) {

        Onibus Onibus1 = new Onibus("XXX", 2026, 30);
        Onibus Onibus2 = new Onibus("FFF", 2055, 40);
        Onibus Onibus3 = new Onibus("WWW", 2092, 10);
        Onibus Onibus4 = new Onibus("LLL", 2024, 20);

        Caminhao Caminhao1 = new Caminhao("YYY", 2027, 1, 30254.6544);
        Caminhao Caminhao2 = new Caminhao("VVV", 2030, 2, 90884.1334);
        Caminhao Caminhao3 = new Caminhao("DDD", 2050, 2, 60524.2982);
        Caminhao Caminhao4 = new Caminhao("HHH", 2080, 1, 50221.7554);

        Onibus1.onibus();
        Onibus1.dados();
        Onibus2.dados();
        Onibus3.dados();
        Onibus4.dados();

        Caminhao1.caminhao();
        Caminhao1.dados();
        Caminhao2.dados();
        Caminhao3.dados();
        Caminhao4.dados();

    }

}