package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteAtualizar {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Aluno objA = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		
		objA.setRm(inteiro("Insira o RM cujos dados serão alterados"));
		objA.setNome(texto("Insira o novo Nome"));
		objA.setTurma(texto("Insira a nova Turma"));
		objA.setNota(real("Insira a nova Nota"));
		System.out.println(dao.atualizar(objA));

	}

}
