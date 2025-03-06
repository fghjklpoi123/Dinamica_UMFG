package animais;

public class Cachorro extends Animais {
    public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    public void latir() {
        System.out.println(getNome() + ": AU-AU");
    }

    public void brincar() {
        System.out.println(getNome() + " está correndo pelo quintal");
    }
}
