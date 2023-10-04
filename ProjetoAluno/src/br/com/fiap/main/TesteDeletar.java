package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteDeletar {
	public static int inteiro(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Aluno objA = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		
		objA.setRm(inteiro("Digite o RM a ser deletado"));
		
		System.out.println(dao.deletar(objA));

	}

}
