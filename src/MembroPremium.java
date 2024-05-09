public class MembroPremium implements Membro {
    private String nome;
    private int idade;
    private String plano;


    public MembroPremium(String nome, int idade, String plano){
        this.nome=nome;
        this.idade=idade;
        this.plano=plano;
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
    public int valorPlano(){
        int valorFixo = 150;
        int adicionaisMembroPremium = 70;

        return valorFixo + adicionaisMembroPremium;


    }
}
