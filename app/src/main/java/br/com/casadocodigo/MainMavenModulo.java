package br.com.casadocodigo;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import br.com.casadocodigo.domain.Book;
import br.com.casadocodigo.http.Books;
import br.com.casadocodigo.service.NFEmissor;


public class MainMavenModulo {

	public static void main(String[] args) {
		
		List<Book> books = Books.all();
		
		IntStream
			.range(0, books.size())
			.forEach(i->{System.out.println(i + " - " + books.get(i).getName() );});
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nDigite o codigo do livro desejavel : \n");
			int number = scanner.nextInt();
			
			Book book = books.get(number);
			
			System.out.println("\nO Livro escolhido foi  : "+book.getName());
			
			System.out.println("\nInforme seu nome para emissao da NF : \n");
			scanner = new Scanner(System.in);
			String nome = scanner.nextLine();
			
			NFEmissor emissor = new NFEmissor();
			emissor.emit(nome, book);
			
			Books.findSimilar(book)
				.ifPresentOrElse(similar->System.out.println("\nTalves tambem goste deste livro :"+similar.getName())
							, ()->System.out.println("\nNão temos nenhuma sugestão de similar no momento"));
			
			System.out.println("Aperte	o	enter	para	sair");
			new	Scanner(System.in).nextLine();
			emissor.close();
		
		}	catch(Exception	e)	{
			System.err.println("Ops,	aconteceu	um	erro:	"+	e);
		}		


	}

}
