import java.util.*;
class Book_keeper {
    public static void main(String[] args) {

        System.out.println("Welcome to our library");
        Hashtable<String, Integer> books = new Hashtable<String, Integer>();
        books.put("B1",3);
        books.put("B2",2);
        books.put("B3",3);
        books.put("B4",6);
        books.put("B5",5);   
        int n, a, b, days;
        String type, book;
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: Cost of each book is Rs. 10, late fee after 7 days (Rs.5 per day late)");
        boolean d = true;
        while(d) {
            System.out.println("Select an option:\n1.Issue\n2.Return"); 
            n = sc.nextInt();        
            switch (n) {
                case 1:
                    System.out.println(books);
                    System.out.println("Select book to issue:");
                    type = sc.next();
                    a = books.get(type);
                    if(a>0) {
                        books.put(type, --a);
                        System.out.println("Current status is:");
                        System.out.println(books);
                    }
                    else {
                        System.out.println("No books available");
                    }
                    break;
                case 2:
                    System.out.println(books);
                    System.out.println("Select book to return:"); 
                    book = sc.next();
                    b = books.get(book);
                    books.put(book, ++b);
                    System.out.println("Enter number of days after which you're returning the book");
                    days = sc.nextInt();
                    if(days>7) {
                        System.out.println("Cost: Rs."+(days-7)*5 + 10);
                    }
                    else if(days<7) {
                        System.out.println("Cost: Rs. 10");
                    }
                    else {
                        System.out.println("Invalid option");
                    }
                    break;
    
                default:
                    System.out.println("Invalid option");
                    break;
            } 
            System.out.println("Do you want to continue(y/n): ");
            String c = sc.next();
            if(c=="y") {
                d = false;
            }
            sc.close();
        }    
    }
}
