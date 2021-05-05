package com.practice.bookcatalogue;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BooksController {
    @Inject
    SearchBook searchBook;

    @GET
    public Response getBooks(){
        Set<Book> books = BookMock.getBooks();
        return Response.status(Response.Status.OK).entity(books). build();
    }

    @GET
    @Path("/searchByTitle")
    public Response getBooksWithSearchCriteriaTitle(@DefaultValue("") @QueryParam("title") String title){
        Set<Book> books = new HashSet<>();
        if(!title.equals("")){
            books = searchBook.getBooksByTitle(title);

        }else{
            books = BookMock.getBooks();
        }
        return Response.status(Response.Status.OK).entity(books). build();
    }

    @GET
    @Path("/searchByAuthor")
    public Response getBooksWithSearchCriteriaAuthor(@DefaultValue("") @QueryParam("author") String author){
        Set<Book> books = new HashSet<>();

        if(!author.equals("")){
            books = searchBook.getBooksByAuthor(author);

        }else{
            books = BookMock.getBooks();
        }
        return Response.status(Response.Status.OK).entity(books). build();
    }

    @GET
    @Path("/searchByIsbn")
    public Response getBooksWithSearchCriteriaIsbn(@DefaultValue("0") @QueryParam("isbn") Integer isbn){
        Set<Book> books = new HashSet<>();

        if(isbn.intValue()!=0){
            books = searchBook.getBooksByIsbn(isbn);

        }else{
            books = BookMock.getBooks();
        }
        return Response.status(Response.Status.OK).entity(books). build();
    }

    @POST
    public Response addBook(Book book){
        BookMock.getBooks().add(book);
        return Response.status(Response.Status.CREATED).entity(book).build();
    }

    @DELETE
    public Response deleteBook(Book book){
        BookMock.getBooks().remove(book);
        return Response.status(Response.Status.OK).entity("Deleted Successfully").build();
    }

    @PUT
    public Response updateBook(Book book){
        BookMock.getBooks().remove(book);
        BookMock.getBooks().add(book);
        return Response.status(Response.Status.OK).entity(book).build();
    }
}
