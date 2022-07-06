package personagem;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, inteligencia, forca, vigor, resistencia, destreza);
        setTipo(TipoPersonagem.GUERREIRO);
        if (forca < inteligencia || forca < destreza){
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (getForca() * 0.8) + (getVigor() * 0.05) + (getDestreza() * 0.1) + (getInteligencia() * 0.05);
    }


//    Deve ser subclasse de Personagem.
//    Crie construtor que receba nome, inteligencia, forca, vigor, resistencia e destreza.
//    Tipo de personagem deve ser fixo GUERREIRO, fixar no construtor.
//    Construtor deve validar que forca deve ser maior do que inteligencia e destreza, caso contrário deve lançar exceção Atributos invalidos para GUERREIRO.
//    Sobrescrever o método getDanoAtaque() para retornar: (<forca> * 0.8) + (<vigor> * 0.05) + (<destreza> * 0.1) + (<inteligencia> * 0.05)

}
