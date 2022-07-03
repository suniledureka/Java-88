package co.edureka.services;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Book;

@Path("/library")
public class LibraryRestController {
	@GET
	@Path("/book")
	@Produces("application/json")
	public Book getBookDetails() {
		Book book = new Book();
		
		book.setBookId(1);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(755.50f);
		
		return book;
	}
	
	@GET
	@Path("/books")
	@Produces("application/json")
	public List<Book> getBooksDetails() {
		List<Book> books = Arrays.asList(
					new Book(101, "Java Certification", 255f),
					new Book(102, "Python Certification", 255f),
					new Book(103, "R Certification", 255f)
				);
		
		return books;
	}	
}
