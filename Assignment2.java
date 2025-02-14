// NAME - MOHD YAMEEN KHAN, UID- 22BCS14561 :
// problem 1 Write a Java program to create a Product class with attributes: 

class Assignment2 {
    static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Product Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 75000);
        product.displayDetails();
    }
}
 // problem 2 Write a Java program to implement a library management system .

 class Assignment2 {
    static class Book {
        protected String title;
        protected String author;
        protected double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    static class Fiction extends Book {
        public Fiction(String title, String author, double price) {
            super(title, author, price);
        }

        @Override
        public void displayDetails() {
            System.out.println("Fiction Book Details:");
            super.displayDetails();
        }
    }

    static class NonFiction extends Book {
        public NonFiction(String title, String author, double price) {
            super(title, author, price);
        }

        @Override
        public void displayDetails() {
            System.out.println("Non-Fiction Book Details:");
            super.displayDetails();
        }
    }

    public static void main(String[] args) {
        Fiction book1 = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction book2 = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}

//  problem 3 Design a student information system using Java with the following features:

//Abstract class Person with attributes name, age

class Assignment2 {
    static abstract class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract void displayDetails();
    }

    static class Student extends Person {
        private int rollNumber;

        public Student(String name, int age, int rollNumber) {
            super(name, age);
            this.rollNumber = rollNumber;
        }

        @Override
        public void displayDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    static class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        @Override
        public void displayDetails() {
            System.out.println("Teacher Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Subject: " + subject);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101);
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");

        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
    }
}
