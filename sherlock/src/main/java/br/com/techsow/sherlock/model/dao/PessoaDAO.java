package br.com.techsow.sherlock.model.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.techsow.sherlock.model.entities.Conteudo;
import br.com.techsow.sherlock.model.entities.Pessoa;
import br.com.techsow.sherlock.model.interfaces.repository.IConteudoRepository;
import br.com.techsow.sherlock.model.services.ConnectionFactory;

public class PessoaDAO extends BaseDAO{


	public PessoaDAO() throws Exception {

			conn = ConnectionFactory.getConnection();
	}

	public Pessoa getById(int id) throws Exception{
		UsuarioDAO userDao = null;
		stmt = conn.prepareStatement("SELECT * FROM  TS_T_PESSOA WHERE ID_PESSOA=?");
		stmt.setInt(1, id);
		rs=stmt.executeQuery();
		
		if(rs.next()) {
			return new Pessoa(
					rs.getInt("ID_PESSOA"),
					rs.getString("NOME"),
					rs.getString("SOBRENOME"),
					userDao.getById(rs.getInt("ID_USUARIO")));
					
		}else {
			return new Pessoa();
		}
	}
	
	
	public int add(Pessoa p)throws Exception{
		stmt=conn.prepareStatement("insert into TS_T_PESSOA (ID_PESSOA,NOME,SOBRENOME,ID_USUARIO) values(c_pessoa_seq.nextval,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getSobrenome());
		stmt.setInt(3, p.getUsuarioId().getIdUsuario());
		return stmt.executeUpdate();
	}
	
	
	public int killPessoa(int id) throws Exception{
		stmt = conn.prepareStatement("delete from TS_T_PESSOA where ID_PESSOA =? ");
		stmt.setInt(1, id);
		return stmt.executeUpdate();

	}
	
	
	public int updateNome(Pessoa pessoa, String nomeNovo) throws Exception{

		int idPessoa = pessoa.getId(); 
		stmt = conn.prepareStatement("UPDATE TS_T_PESSOA SET NOME =? WHERE ID_PESSOA=?");

		stmt.setString(1, nomeNovo);
		stmt.setInt(2, idPessoa);

		return stmt.executeUpdate();

	}
	
	
	public int updateSobrenome(Pessoa pessoa, String sobreNomeNovo) throws Exception{

		int idPessoa = pessoa.getId(); 
		stmt = conn.prepareStatement("UPDATE TS_T_PESSOA SET SOBRENOME=? WHERE ID_PESSOA=?");

		stmt.setString(1, sobreNomeNovo);
		stmt.setInt(2, idPessoa);

		return stmt.executeUpdate();

	}
	
	public int updateIdade(Pessoa pessoa, int idadeNova) throws Exception{

		int idPessoa = pessoa.getId(); 
		stmt = conn.prepareStatement("UPDATE TS_T_PESSOA SET IDADE=? WHERE ID_PESSOA=?");

		stmt.setInt(1, idadeNova);
		stmt.setInt(2, idPessoa);

		return stmt.executeUpdate();

	}
	
	
	public void close() throws SQLException{
		conn.close();
	}
}
