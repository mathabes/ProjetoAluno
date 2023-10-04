package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConexaoFactory;

public class AlunoDAO {
	public Connection minhaConexao;
	
	public AlunoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String inserir(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_FIAP_ALUNO values (?, ?, ?, ?)");
		stmt.setInt(1, aluno.getRm());
		stmt.setString(2, aluno.getNome());
		stmt.setString(3, aluno.getTurma());
		stmt.setDouble(4, aluno.getNota());
		stmt.execute();
		stmt.close();
		return "Inserido com sucesso";
	}
	
	public String deletar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("delete from T_FIAP_ALUNO where RM = ?");
		stmt.setInt(1, aluno.getRm());
		stmt.execute();
		stmt.close();
		return "Deletado com sucesso";
	}
	public String atualizar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("update T_FIAP_ALUNO set NOME = ?, TURMA = ?, NOTA = ? where RM = ?");
		stmt.setInt(4, aluno.getRm());
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getTurma());
		stmt.setDouble(3, aluno.getNota());
		stmt.execute();
		stmt.close();
		return "Atualziado com sucesso";
	}
}