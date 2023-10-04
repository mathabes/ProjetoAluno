package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteAtualizar {
	public static String txt(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static int inteiro(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public static double real(String message) {
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Aluno objA = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		
		objA.setRm(inteiro("Digite o RM"));
		objA.setNome(txt("Digite o nome"));
		objA.setTurma(txt("Digite a turma"));
		objA.setNota(real("Digite a nota"));
		
		System.out.println(dao.inserir(objA));

	}

}
