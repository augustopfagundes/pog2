package bd.dbos;

import java.sql.Array;
import java.sql.Date;
//TODO: Falta fazer hashCode, toString, equals. Apagar gets e sets e variáveis da outra classe, quando finalizar
public class Usuario
{
	private long id;
	private String eMail;
	private String senha;
	private Date primeiraDataMes;
	private int qtdVitoriasMes;
	private Array cartela;
	
	/*-*-* Início deletar  *-*-*/
    private int    codigo;
    private String nome;
    private float  preco;
    /*-*-* Fim deletar  *-*-*/
    
    public long getId() { return id; }
	public void setId(long id) { this.id = id; }

	public String geteMail() { return eMail; }
	public void seteMail(String eMail) { this.eMail = eMail; }

	public String getSenha() { return senha; }
	public void setSenha(String senha) { this.senha = senha; }

	public Date getPrimeiraDataMes() { return primeiraDataMes; }
	public void setPrimeiraDataMes(Date primeiraDataMes) { this.primeiraDataMes = primeiraDataMes; }

	public int getQtdVitoriasMes() { return qtdVitoriasMes; }
	public void setQtdVitoriasMes(int qtdVitoriasMes) { this.qtdVitoriasMes = qtdVitoriasMes; }
	
	public Array getCartela() { return cartela; }
	public void setCartela(Array cartela) { this.cartela = cartela; }
	
    public Usuario (long id, String email, String senha, Date primeiraDataMes, int qtdVitoriasMes, Array cartela) throws Exception
    {
    	this.setId(id);
    	this.seteMail(email);
    	this.setSenha(senha);
    	this.setPrimeiraDataMes(primeiraDataMes);
    	this.setQtdVitoriasMes(qtdVitoriasMes);
    	this.setCartela(cartela);
    }

	
	/*-*-* Início deletar  *-*-*/ 
    public void setCodigo (int codigo) throws Exception
    {
        if (codigo <= 0)
            throw new Exception ("Codigo invalido");

        this.codigo = codigo;
    }   

    public void setNome (String nome) throws Exception
    {
        if (nome==null || nome.equals(""))
            throw new Exception ("Nome nao fornecido");

        this.nome = nome;
    }

    public void setPreco (float preco) throws Exception
    {
        if (preco <= 0)
            throw new Exception ("Preco invalido");

        this.preco = preco;
    }

    public int getCodigo ()
    {
        return this.codigo;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public float getPreco ()
    {
        return this.preco;
    }

    public Usuario (int codigo, String nome, float preco) throws Exception
    {
        this.setCodigo (codigo);
        this.setNome   (nome);
        this.setPreco  (preco);
    }
    /*-*-* Fim deletar  *-*-*/

    // é claro que os métodos obrigatórios deveriam ser feitos
    // para a implementação ficar completa
}