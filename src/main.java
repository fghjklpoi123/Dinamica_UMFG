
import animais.Cachorro;

public class main {
    public static void main(String[] args){
        Cachorro caramelo = new Cachorro("Craudinho", "Vira-lata", 3);
        caramelo.latir();
        caramelo.andar();
        caramelo.dormir();
        caramelo.brincar();
        caramelo.comer();
    }
}
