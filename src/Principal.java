public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "A procura da felicidade";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.duracaoEmMinutos = 117;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

    }
}
