public class Main {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Mauricio", "Natacao", 11);
        int salarioInstrutor1 = instrutor1.calculoSalarioInstrutor();
        System.out.println("Salário do Instrutor 1: " + salarioInstrutor1);

        MembroPremium membroPremium1 = new MembroPremium("Julia", 29, "Premium");
        int valorPlanoMembro1 = membroPremium1.valorPlano();
        System.out.println("Valor do Plano do Membro Premium 1: " + valorPlanoMembro1);

    }
}
