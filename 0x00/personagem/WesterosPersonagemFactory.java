

public class WesterosPersonagemFactory extends PersonagemFactory{

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {

        if (tipo == TipoPersonagem.MAGO){
            return new Mago(nome, 8, 3, 3, 3, 4);

        }
        if (tipo == TipoPersonagem.LADRAO){
            return new Ladrao(nome, 1, 8, 7, 7, 10);
        }
        if (tipo == TipoPersonagem.GUERREIRO){
            return new Guerreiro(nome, 0, 9, 7, 10, 7);
        }
        return null;
    }


//    Mago:
//    nome: Mago
//    inteligencia: 8
//    forca: 3
//    vigor: 3
//    resistencia: 3
//    destreza: 4
//    Ladrao:
//    nome: Ladrao
//    inteligencia: 1
//    forca: 8
//    vigor: 7
//    resistencia: 7
//    destreza: 10
//    Guerreiro
//    nome: Guerreiro
//    inteligencia: 0
//    forca: 9
//    vigor: 7
//    resistencia: 10
//    destreza: 7
}
