package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = (ArrayList<Aluno>) dao.selecionar();
		if (lista != null) {
			for(Aluno aluno : lista) {
				System.out.println("\nRM: " + aluno.getRm() +
						"\nNome: " + aluno.getNome() +
						"\nTurma: " + aluno.getTurma() +
						"\nNota: " + aluno.getNota());
			}
		}

	}

}
