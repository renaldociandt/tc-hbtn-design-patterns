package personagem;

public abstract class PersonagemFactory {

    //Deve possuir o método abstrato createPersonagem que recebe o parâmetro tipo do tipo TipoPersonagem e retorna um objeto do tipo Personagem e o nome do personagem.

    public abstract Personagem createPersonagem(TipoPersonagem tipo, String nome);
}
