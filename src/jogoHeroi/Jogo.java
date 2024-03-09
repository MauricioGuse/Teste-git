package jogoHeroi;

import jogoHeroi.Heroi;

public class Jogo {
    public static void main(String[] args){

        Heroi heroi1 = new Heroi();
        heroi1.nome = "Arthur";
        heroi1.forca = 10;

        Heroi heroi2 = new Heroi();
        heroi2.nome = "Merlin";
        heroi2.forca = 8;

        heroi1.atacar(heroi2);
        heroi2.atacar(heroi1);

        Mago mago1 = new Mago();
        mago1.nome = "Harry";
        mago1.mana = 40;






    }
}
