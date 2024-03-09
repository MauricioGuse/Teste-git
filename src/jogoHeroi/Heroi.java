package jogoHeroi;

public class Heroi {
        String nome;

        int vida = 100;
        int forca = 20;

        public void atacar(Heroi alvo) {
            alvo.vida -= this.forca;
            System.out.println(this.nome + " ataca " + alvo.nome + " e causa " + this.forca + " de dano. ");

        }
        public void curar(){
            this.vida = this.vida +20;
            if (this.vida > 100){
                this.vida = 100;
                System.out.println(this.nome + " se cura e fica com " + this.vida);


            }

    }
}


