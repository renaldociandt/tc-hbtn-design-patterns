package personagem;

public class Mago extends Personagem{

    public Mago(String nome,int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, inteligencia, forca, vigor, resistencia, destreza);
        setTipo(TipoPersonagem.MAGO);
        if (inteligencia < forca || inteligencia < destreza){
            throw new IllegalArgumentException("Atributos invalidos para MAGO");
        }

    }

    @Override
    public double getDanoAtaque() {
        return (getInteligencia() * 0.8) + (getForca() * 0.05) + (getDestreza() * 0.05) + (getVigor() * 0.1);
    }

//    Deve ser subclasse de Personagem.
//    Crie construtor que receba nome, inteligencia, forca, vigor, resistencia e destreza.
//    Tipo de personagem deve ser fixo MAGO, fixar no construtor.
//    Construtor deve validar que inteligencia deve ser maior do que forca e destreza, caso contrário deve lançar exceção Atributos invalidos para MAGO.
//    Sobrescrever o método getDanoAtaque() para retornar: (<inteligencia> * 0.8) + (<forca> * 0.05) + (<destreza> * 0.05) + (<vigor> * 0.1)

}
