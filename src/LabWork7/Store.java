package LabWork7;

import java.util.Scanner;

public class Store{

    public static class Product {
        String nameProduct;
        double cost, rating;

        Product(String nameProduct, double cost, double rating) {
            this.nameProduct = nameProduct;
            this.cost = cost;
            this.rating = rating;
        }
    }

    public static class Category {
        String nameCategory;
        Product[] products;

        Category(String nameCategory, Product[] products) {
            this.nameCategory = nameCategory;
            this.products = products;
        }
    }

    public static class Basket {
        Product[] purchased;

        Basket(Product[] purchased) {
            this.purchased = purchased;
        }
    }

    public static class User {
        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }
        public String login, password;
        public Basket purchased;

        boolean isAuth(String login, String password) {
            if(this.login == login && this.password == password) return true;
            else return false;
        }
    }

    public static void getMenu() {
        System.out.println("\n Меню");
        System.out.println("1.Категории товаров");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        System.out.println("0.Выход");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                getBasket(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
            case 0: {
                break;
            }
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Товарный чек");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + ". " + client.purchased.purchased[i].nameProduct + " ------- "
                    + client.purchased.purchased[i].cost + " ------- " + client.purchased.purchased[i].rating);
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок составляет -------" + gc);

    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);

    }
    public static void getBasket(Product[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " ------- "
                    + b[i].cost + " ------- " + b[i].rating);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }

    public static void seeProduct(Category cat) {
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " ------- "
                    + cat.products[i].cost + " ------- " + cat.products[i].rating);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }

    private static void buyProduct(Product p) {
        System.out.println("Продукт " + p.nameProduct + " за " + p.cost + " был добавлен в вашу корзину");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                }
            }
        }

        getCategory(all);
    }

    static Product bread = new Product("Хлеб", 100.0, 4.5);
    static Product baton = new Product("Батон", 150.0, 5.0);
    static Product cookies = new Product("Печенье", 90.0, 4.8);

    static Product milk = new Product("Молоко", 200.0, 4.0);
    static Product kefir = new Product("Кефир", 110.0, 3.7);
    static Product curd = new Product("Творог", 80.0, 3.8);

    static Product sausage = new Product("Сосиски", 350.0, 4.6);
    static Product farsh = new Product("Фарш", 270.0, 4.9);
    static Product aspic = new Product("Холодец", 220.0, 3.8);

    static Product[] Bakery = { bread, baton, cookies };
    static Product[] Diary = { milk, kefir, curd };
    static Product[] Meat = { sausage, farsh, aspic };

    static Category bakery = new Category("Бакалея", Bakery);
    static Category diary = new Category("Молочные изделия", Diary);
    static Category meat = new Category("Мясо", Meat);

    static Category[] all = { bakery, diary,meat };
    static Product[] card;
    static User client;
    public static void main(String[] args) {
        client = new User("Leather","Spitz");

        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Авторизация \n Введите логин и пароль пользователя:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (login.equals("Leather") | password.equals("Spitz")){
            if (!client.isAuth(login, password)) {
                getMenu();
            }

        }
        else {
            System.out.println("Ошибка авторизации!");
        }
    }

}