	// Importar a classe Scanner

import java.util.Scanner;

import br.com.cinema.Usuario;

public class Classificacao {

	private static Scanner leia;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Instancia os objetos
		
		Usuario usuario = new Usuario();
		leia = new Scanner(System.in);
		
		// Entrada de dados
		
		System.out.println("Informe a idade:");
		usuario.idade = leia.nextInt();
		
		// Limpeza de Buffer
		
		leia.nextInt();
		
		// Declarar as variáveis
		
		String filme;
		int classificacao;
		
		// Algoritmo
		
		filme = "Uncharted Drake's Fortune";
		classificacao = 12;
		
		filme = "Exorcismo Sagrado";
		classificacao = 16;
		
		filme = "Morte no Nilo";
		classificacao = 14;
		
		filme = "Moonfall Ameaça Lunar";
		classificacao = 14;
		
		filme = "Homem-Aranha Sem Volta para Casa";
		classificacao = 12;
		
		filme = "Tô Ryca 2";
		classificacao = 12;
		
		filme = "A Jaula";
		classificacao = 16;
		
		filme = "Case Comigo";
		classificacao = 12;
				
		filme = "Sing 2";
		classificacao = 21;
				
	}

}
