public class Onibus
{
    public double quilometragem;
    public int qtd_pessoas;
    public String nome_motorista;
    public EmpresaOnibus empresa;

    public Onibus (double km, int qtd_pessoas, String nome_motorista, EmpresaOnibus empresa)
    {
        this.quilometragem = km;
        this.qtd_pessoas = qtd_pessoas;
        this.nome_motorista = nome_motorista;
        this.empresa = empresa;
    }

    public void verificaKM()
    {
        if (quilometragem > 200)
        {
            System.out.println("KM: " + quilometragem + " Onibus impossibilitado de rodar.");
        }
        else
        {
            System.out.println("KM: " + quilometragem + " Onibus permitido rodar.");
        }
    }

    public void addPessoas(int pessoas)
    {
        if (qtd_pessoas + pessoas <= 60)
        {
            System.out.println("Adicionada " + pessoas + " pessoas ao onibus.");
            qtd_pessoas += pessoas;
            System.out.println("Onibus agora tem " + qtd_pessoas + " pessoas.");
        }
        else
        {
            System.out.println("Onibus lotado!");
        }
    }

    public void removerPessoa(int pessoas)
    {
        if (qtd_pessoas - pessoas >= 0)
        {
            System.out.println("Retirada " + pessoas + " pessoas do onibus.");
            qtd_pessoas -= pessoas;
            System.out.println("Onibus agora tem " + qtd_pessoas + " pessoas.");
        }
        else
        {
            System.out.println("Erro ao retirar pessoas.");
        }
    }

    public void trocarMotorista(String nome)
    {
        System.out.println("Motorista " + nome_motorista + " saiu para a entrada do motorista " + nome);
        nome_motorista = nome;
    }
}