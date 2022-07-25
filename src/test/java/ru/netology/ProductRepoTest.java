package ru.netology;
import org.junit.jupiter.api.Test;
import ru.netology.Product;
import ru.netology.ProductRepo;
import ru.netology.Book;
import ru.netology.Smartphone;
import ru.netology.ProductManager;
import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {

        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1,"Book Name1", 100, "Slava");
        Book book2 = new Book(2,"Journal Name2", 200, "Kolya");
        Book book3 = new Book(3,"Book Name3", 300, "Pasha");

        Product product1 = new Product(5, "Prod1", 400);
        Product product2 = new Product(6, "Prod2", 500);
        Product product3 = new Product(7, "Prod3", 600);

        Smartphone smartphone1 = new Smartphone(10, "Smartphone1", 700, "Manuf1");
        Smartphone smartphone2 = new Smartphone(11, "Smartphone2", 800, "Manuf1");
        Smartphone smartphone3 = new Smartphone(12, "Smartphone3", 900, "Manuf2");

    @Test
    public void shouldRemoveByIDProduct() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.removeById(product2.getId());

        Product[] expected = { product1, product3 };
        Product[] actual = repo.getProduct();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIDBook() {
        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        repo.removeById(book2.getId());

        Product[] expected = { book1, book3 };
        Product[] actual = repo.getProduct();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllProduct() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Product[] expected = { product1, product2, product3};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddProduct() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Product[] expected = { product1, product2, product3};
        Product[] actual = repo.products;

        assertArrayEquals(expected, actual);

    }

   }





