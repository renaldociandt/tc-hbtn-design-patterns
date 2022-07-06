package personagem;

public class Ladrao extends Personagem{

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, inteligencia, forca, vigor, resistencia, destreza);
        this.setTipo(TipoPersonagem.LADRAO);
        if (destreza < forca || destreza < inteligencia){
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (getForca() * 0.5) + (getDestreza() * 0.35) + (getVigor() * 0.1) + (getInteligencia() * 0.05);
    }


//    Deve ser subclasse de Personagem.
//    Crie construtor que receba nome, inteligencia, forca, vigor, resistencia e destreza.
//    Tipo de personagem deve ser fixo LADRAO, fixar no construtor.
//    Construtor deve validar que destreza deve ser maior do que forca e inteligencia, caso contrário deve lançar exceção Atributos invalidos para LADRAO.
//    Sobrescrever o método getDanoAtaque() para retornar: (<forca> * 0.5) + (<destreza> * 0.35) + (<vigor> * 0.1) + (<inteligencia> * 0.05)
}
