public class Instrutor {
    private String nome;
    private String especialidade;
    private int nivelExperiencia;


    public Instrutor(String nome, String especialidade, int nivelExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public int calculoSalarioInstrutor() {
        int valorFixo = 1000;

        if (nivelExperiencia > 10) {
            return valorFixo + 200;
        } else {
            return valorFixo;
        }
    }

}





