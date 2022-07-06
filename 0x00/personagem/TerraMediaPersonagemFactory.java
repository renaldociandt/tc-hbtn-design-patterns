package personagem;

public class TerraMediaPersonagemFactory extends PersonagemFactory{

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        if (tipo == TipoPersonagem.MAGO){
            return new Mago(nome, 10, 2, 5, 3, 4);

        }
        if (tipo == TipoPersonagem.LADRAO){
            return new Ladrao(nome, 2, 6, 8, 5, 10);
        }
        if (tipo == TipoPersonagem.GUERREIRO){
            return new Guerreiro(nome, 1, 8, 5, 10, 6);
        }
        return null;

    }


//    Classe é subclasse de PersonagemFactory.
//    Implemente o método createPersonagem(TipoPersonagem tipo, String nome), dependendo to tipo recebido como parâmetro criar uma instância de objeto correspondente ao tipo com os valores:
//
//    Mago:
//    inteligencia: 10
//    forca: 2
//    vigor: 5
//    resistencia: 3
//    destreza: 4
//    Ladrao:
//    inteligencia: 2
//    forca: 6
//    vigor: 8
//    resistencia: 5
//    destreza: 10
//    Guerreiro
//    inteligencia: 1
//    forca: 8
//    vigor: 5
//    resistencia: 10
//    destreza: 6
}
