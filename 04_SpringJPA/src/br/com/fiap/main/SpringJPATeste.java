package br.com.fiap.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fiap.model.Produto;
import br.com.fiap.service.ProdutoService;

public class SpringJPATeste {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");
		ProdutoService produtoService = ctx.getBean(ProdutoService.class);
		produtoService.add(new Produto(1, "Laranja", 70.0, 15.0));
		produtoService.add(new Produto(2, "Limao", 10.0, 10.0));
		System.out.println(">>>>>>>>>");
		System.out.println(produtoService.findAll());

		produtoService
				.addAll(Arrays.asList(new Produto(3, "Pera", 15.0, 5.0), new Produto(4, "Morango", 4.0, 30.0), new Produto(5, "Maracuja", 9.0, 5.0)));

		System.out.println(produtoService.findAll());
		System.out.println(">>>>>>>>>");
		System.out.println(produtoService.findByName("Maracuja"));
		System.out.println(">>>>>>>>>");
		Produto findById = produtoService.findById(3);
		System.out.println(findById + ":" + findById.getPreco());
		
		List<Produto> findByPrecoLesserThan = produtoService.findByPrecoLesserThan(8.0);
		System.out.println(">>>>>>>>>");
		System.out.println(findByPrecoLesserThan);
		
		ctx.close();
	}
}