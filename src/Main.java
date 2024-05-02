public class Main
{
    public static void main(String[] args)
    {
        EmpresaOnibus empresa1 = new EmpresaOnibus(1, "Empresa 1", "Rua 1", 1);

        Onibus onibus1 = new Onibus(50.2, 10, "Adalberto", empresa1);

        empresa1.imprimirDados();
        empresa1.imprimeQtdonibus();

        onibus1.verificaKM();
        onibus1.addPessoas(50);
        onibus1.removerPessoa(40);
        onibus1.trocarMotorista("Adilson");

    }
}