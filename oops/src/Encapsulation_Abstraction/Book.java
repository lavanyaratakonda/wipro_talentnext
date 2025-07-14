package Encapsulation_Abstraction;


	import java.util.Scanner;

	class Author {
	    private String name;
	    private String email;
	    private char gender;

	    public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setGender(char gender) {
	        this.gender = gender;
	    }
	}

	class Book {
	    private String name;
	    private Author author;
	    private double price;
	    private int qtyInStock;

	    public Book(String name, Author author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	    public String getName() {
	        return name;
	    }

	    public Author getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAuthor(Author author) {
	        this.author = author;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void setQtyInStock(int qtyInStock) {
	        this.qtyInStock = qtyInStock;
	    }

	    public void printDetails() {
	        System.out.println("Book Name: " + name);
	        System.out.println("Author Name: " + author.getName());
	        System.out.println("Author Email: " + author.getEmail());
	        System.out.println("Author Gender: " + author.getGender());
	        System.out.println("Price: ₹" + price);
	        System.out.println("Quantity in Stock: " + qtyInStock);
	    }
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter Author Details:");
	        System.out.print("Name: ");
	        String authorName = scanner.nextLine();
	        System.out.print("Email: ");
	        String authorEmail = scanner.nextLine();
	        System.out.print("Gender (M/F): ");
	        char authorGender = scanner.next().charAt(0);
	        scanner.nextLine();

	        Author author = new Author(authorName, authorEmail, authorGender);

	        System.out.println("\nEnter Book Details:");
	        System.out.print("Book Name: ");
	        String bookName = scanner.nextLine();
	        System.out.print("Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Quantity in Stock: ");
	        int qty = scanner.nextInt();

	        Book book = new Book(bookName, author, price, qty);

	        System.out.println("\n--- Book Information ---");
	        book.printDetails();

	        scanner.close();
	    }
	}


