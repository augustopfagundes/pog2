package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import bd.dbos.*;

public class Usuarios
{
	public boolean buscarUsuario(long id) throws Exception
	{
		boolean retorno = false;
		
		try
		{
			String sql;
			
			sql = "SELECT * " +
				  "FROM USUARIO" +
				  " WHERE ID = ?";
			
			BD.comando.prepareStatement(sql);
			
			BD.comando.setLong(1, id);
			
			MeuResultSet resultado = (MeuResultSet)BD.comando.executeQuery();
			
			retorno = resultado.first();
		}
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar usuário");
        }

        return retorno;
	}
	
	public void incluirUsuario(Usuario usuario) throws Exception
	{
		if(usuario == null)
		{
			throw new Exception("Usuário nao informado");
		}
		
		try
		{
			String sql;
			
			sql = "INSERT INTO USUARIO" +
				  " (id, eMail, senha, primeiraDataMes, QtdVitoriasMes, cartela)" +
				  " VALUES (?,?,?,?,?,?)";
			
			BD.comando.prepareStatement(sql);
			
			BD.comando.setLong(1, usuario.getId());
			BD.comando.setString(2, usuario.geteMail());
			BD.comando.setString(3, usuario.getSenha());
			BD.comando.setDate(4, usuario.getPrimeiraDataMes());
			BD.comando.setInt(5, usuario.getQtdVitoriasMes());
			BD.comando.setArray(6, usuario.getCartela()); //Gerar cartela em outro método
			
			BD.comando.executeUpdate();
			BD.comando.commit();
		}
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao inserir usuário");
        }
	}
	
	public void excluirUsuario(long id) throws Exception
	{
        if (!buscarUsuario (id))
        {
        	throw new Exception ("Nao cadastrado");
        }

        try
        {
            String sql;

            sql = "DELETE FROM USUARIO " +
                  "WHERE ID=?";

            BD.comando.prepareStatement (sql);

            BD.comando.setLong (1, id);

            BD.comando.executeUpdate();
            BD.comando.commit();        
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir usuário");
        }
				
	}
	
    public void alterarUsuario (Usuario usuario) throws Exception
    {
        if (usuario==null)
        {
        	throw new Exception ("Usuário nao fornecido");
        }
            

        if (!buscarUsuario (usuario.getId()))
        {
        	throw new Exception ("Nao cadastrado");
        }

        try
        {
            String sql;

            sql = "UPDATE USUARIO " +
                  "SET EMAIL=? " +
                  "SET SENHA=? " +
                  "WHERE ID = ?";

            BD.comando.prepareStatement (sql);

            BD.comando.setString (1, usuario.geteMail());
            BD.comando.setString  (2, usuario.getSenha());
            BD.comando.setLong    (3, usuario.getId());

            BD.comando.executeUpdate ();
            BD.comando.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados do usuario");
        }
    }
    
    public Usuario obterUsuario (long id) throws Exception
    {
        Usuario usuario = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM USUARIO " +
                  "WHERE ID = ?";

            BD.comando.prepareStatement (sql);

            BD.comando.setLong (1, id);

            MeuResultSet resultado = (MeuResultSet)BD.comando.executeQuery ();

            if (!resultado.first())
            {
            	throw new Exception ("Nao cadastrado");
            }

            usuario = new Usuario (resultado.getLong   ("ID"),
                               resultado.getString("EMAIL"),
                               resultado.getString ("SENHA"),
                               resultado.getDate("PRIMEIRADATAMES"),
                               resultado.getInt("QTDVITORIASMES"),
                               resultado.getArray("CARTELA"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar usuário");
        }

        return usuario;
    }

    public MeuResultSet obterUsuarios () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM USUARIO";

            BD.comando.prepareStatement (sql);

            resultado = (MeuResultSet)BD.comando.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar usuarios");
        }

        return resultado;
    }

	
	/*-*-* Início Deletar *-*-*/
    public boolean cadastrado (int codigo) throws Exception //feito
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM usuario";

            BD.comando.prepareStatement (sql);

            BD.comando.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BD.comando.executeQuery ();

            retorno = resultado.first();

            /* // ou, se preferirmos,

            String sql;

            sql = "SELECT COUNT(*) AS QUANTOS " +
                  "FROM LIVROS " +
                  "WHERE CODIGO = ?";

            BD.comando.prepareStatement (sql);

            BD.comando.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BD.comando.executeQuery ();

            resultado.first();

            retorno = resultado.getInt("QUANTOS") != 0;

            */
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar livro");
        }

        return retorno;
    }

    public void incluir (Usuario livro) throws Exception //feito
    {
        if (livro==null)
            throw new Exception ("Livro nao fornecido");

        try
        {
            String sql;

            sql = "INSERT INTO LIVROS " +
                  "(CODIGO,NOME,PRECO) " +
                  "VALUES " +
                  "(?,?,?)";

            BD.comando.prepareStatement (sql);

            BD.comando.setInt    (1, livro.getCodigo ());
            BD.comando.setString (2, livro.getNome ());
            BD.comando.setFloat  (3, livro.getPreco ());

            BD.comando.executeUpdate ();
            BD.comando.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao inserir livro");
        }
    }

    public void excluir (int codigo) throws Exception // feito
    {
        if (!cadastrado (codigo))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM LIVROS " +
                  "WHERE CODIGO=?";

            BD.comando.prepareStatement (sql);

            BD.comando.setInt (1, codigo);

            BD.comando.executeUpdate ();
            BD.comando.commit        ();        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir livro");
        }
    }

    public void alterar (Usuario livro) throws Exception //feito
    {
        if (livro==null)
            throw new Exception ("Livro nao fornecido");

        if (!cadastrado (livro.getCodigo()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE LIVROS " +
                  "SET NOME=? " +
                  "SET PRECO=? " +
                  "WHERE CODIGO = ?";

            BD.comando.prepareStatement (sql);

            BD.comando.setString (1, livro.getNome ());
            BD.comando.setFloat  (2, livro.getPreco ());
            BD.comando.setInt    (3, livro.getCodigo ());

            BD.comando.executeUpdate ();
            BD.comando.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de livro");
        }
    }

    public Usuario getLivro (int codigo) throws Exception
    {
        Usuario livro = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVROS " +
                  "WHERE CODIGO = ?";

            BD.comando.prepareStatement (sql);

            BD.comando.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BD.comando.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Nao cadastrado");

            livro = new Usuario (resultado.getInt   ("CODIGO"),
                               resultado.getString("NOME"),
                               resultado.getFloat ("PRECO"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar livro");
        }

        return livro;
    }

    public MeuResultSet getLivros () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVROS";

            BD.comando.prepareStatement (sql);

            resultado = (MeuResultSet)BD.comando.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar livros");
        }

        return resultado;
    }
    /*-*-* Fim Deletar *-*-*/
}