

public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalDePaginas, int quantidadeDepaginasColorida, boolean ehFrenteVerso ){
        Impressao impressao;


        if (TamanhoImpressao.A2 == tamanhoImpressao){
            if (ehFrenteVerso){
                return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.28, 0.18, 0.0, 0.0);
            }
            return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.0, 0.0, 0.32, 0.22);


        }

        if (TamanhoImpressao.A3 == tamanhoImpressao){
            if (ehFrenteVerso){
                return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.25, 0.15, 0.0, 0.0);

            }
            return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.0, 0.0, 0.30, 0.20);

        } else{
            if (ehFrenteVerso){
                return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.20, 0.10, 0.0, 0.0);

            }
            return new Impressao(totalDePaginas, quantidadeDepaginasColorida, ehFrenteVerso, 0.0, 0.0, 0.25, 0.15);

        }

    }
}
