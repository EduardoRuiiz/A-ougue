public class Validade {

    private int mes;
    private int ano;
    private Carne carne;

    public Validade(Carne carne,int mes,int ano)
    {
        this.mes = mes;
        this.ano = ano;
        this.carne = carne;
    }
    public void exibirDetalhe()
    {
        System.out.println("Corte da carne: " + carne.getNome()
                          + "\nTipo da carne: " + carne.getTipo()
                           + "\nQuantidade de peças disponiveis: " + carne.getQuant()
                            + "\nPreço: R$" + carne.getPreco()  
                            + "\nValidade: " + getMes() +"/"+ getAno());
    }
    public int getMes()
    {
        return mes;
    }
    public int getAno()
    {
        return ano;
    }
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }

}
