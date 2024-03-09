package jogoHeroi;

import jogoHeroi.Heroi;

public class Mago extends Heroi {

    int mana;

    public void lancarMagia(Heroi alvo) {
        alvo.vida = alvo.vida - this.mana;
        System.out.println(this.nome + " ataque magico " + alvo.nome
                + " e causou " + this.forca + " de dano ");
    }
}
