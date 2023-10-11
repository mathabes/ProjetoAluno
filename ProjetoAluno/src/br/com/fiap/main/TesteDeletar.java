package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteDeletar {
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Aluno objA = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		
		objA.setRm(inteiro("Digite o RM que deseja deletar"));
		System.out.println(dao.deletar(objA));

	}

}
