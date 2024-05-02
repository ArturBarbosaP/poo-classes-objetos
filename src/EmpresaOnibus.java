public class EmpresaOnibus
{
    public int idEmpresa;
    public String nome;
    public String endereco;
    public int qtd_onibus;

    public EmpresaOnibus (int id, String nome, String endereco, int qtd_onibus)
    {
        this.idEmpresa = id;
        this.nome = nome;
        this.endereco = endereco;
        this.qtd_onibus = qtd_onibus;
    }

    public void imprimeQtdonibus()
    {
        System.out.println("A empresa " + nome + " tem " + qtd_onibus + " onibus.");
    }

    public void imprimirDados()
    {
        System.out.println(idEmpresa + "\n" + nome + "\n" + endereco);
    }

}