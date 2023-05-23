package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.avalia(4);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(9);
		var filmeNovo = new Filme("Dogville", 2000);
		filmeNovo.avalia(7);
		Serie lost = new Serie("Lost", 2000);
		lost.avalia(4);

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(filmeNovo);
		lista.add(lost);
		
		for (Titulo titulo : lista) {
			System.out.println(titulo);

			if (titulo instanceof Filme filme) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
		
		lista.forEach(titulo -> System.out.println(titulo.getNome()));
	}
}
