public class App {
    
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome =  "Kayo";
        heroi.nivel = 10;
        heroi.forca = 36;

        heroi.mostrarStatus();
        heroi.atacar("Batman", "");
    }
}
 