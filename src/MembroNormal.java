public class MembroNormal implements Membro {
    private String nome;
    private int idade;
    private String plano;
    private int tempoPlano;

    public MembroNormal(String nome, int idade, String plano, int tempoPlano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
        this.tempoPlano = tempoPlano;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getPlano() {
        return plano;
    }


    @Override
    public int valorPlano() {

        int valorFixo = 150;

        int descontoPorMes = 10;

        int valorCalculado = valorFixo - (tempoPlano * descontoPorMes);

        return Math.max(valorCalculado, 100);

    }
}
