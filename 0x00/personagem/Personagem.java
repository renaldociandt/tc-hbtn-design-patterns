package personagem;

import lombok.Data;

@Data
public abstract class Personagem {

    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public Personagem(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    @Override
    public String toString() {
        return "Personagem{" +
                " nome = " + nome +
                ", tipo = " + tipo +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza + String.format(",  dano ataque = %.2f " , getDanoAtaque()) + "}";
    }


}

