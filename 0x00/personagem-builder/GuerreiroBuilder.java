public class GuerreiroBuilder implements Builder{

    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public Guerreiro build(){
        return new Guerreiro(nome, inteligencia, forca, vigor, resistencia, destreza);
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;

    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;

    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;

    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;

    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;

    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;

    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;

    }


}
