package bookAssignment;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class BookDriver {

	private static final Logger log = Logger.getLogger(BookDriver.class);
	public static void main(String[] args) throws Throwable {
		Layout layout = new PatternLayout(
				"%d - %L %m %n"
				);
		//Appender append = new FileAppender(layout, "C:/Users/Pavan/Documents/java/logFiles/s3_BookAssognment.log");
		Appender app = new ConsoleAppender(layout);
		//log.addAppender(append);
		log.addAppender(app);
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<>();

		Book b1 = new Book("All In One", 9133, "Pavan", 150);

		Book b2 = new Book("BeWare", 2534, "Vinay", 100);

		Book b3 = new Book("All Is Well", 4312, "Venkat", 250);

		Book b4 = new Book("All In One", 7298, "Pavan", 100);

		Book b5 = new Book("Nothing", 8765, "Puyllya", 450);

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		// System.out.println(al);
		int n=1;
		while(n!=0)
		{
			System.out.println("Choose an Option....");
			System.out.println("1.Add Book.");
			System.out.println("2.search By book using book Name.");
			System.out.println("3.Remove a Book by book id.");
			System.out.println("4.Display All the Book Details.");
			System.out.println("5.Display the book details price between 150 and 250.");
			System.out.println("6.Exit from Program");
			System.out.println("Coose an option between 1 to 5.....");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) 
			{
			case 1: {

				System.out.println("Enter the Book Name");
				String bname = sc.nextLine();
				boolean check = false;
				for (Object ob : al) {
					Book bk = (Book) ob;
					String bookName = bk.getbName();
					if (bookName.equals(bname)) {
						check = true;
						break;
					}
				}
				if (check) {
					//System.out.println("Already Existed");
					log.info("Alredy Existed");
					
				} else {
					//System.out.println("Enter the Book Id");
					log.info("Enter the Book Id : ");
					
					int id = sc.nextInt();
					sc.nextLine();

					//System.out.println("Enter the Book Author");
					log.info("Enter the Book Author : ");
					String author = sc.nextLine();

					//System.out.println("Enter the Book price");
					log.info("Enter the Book Price : ");
					double price = sc.nextDouble();
					sc.nextLine();
					
					Book bk = new Book(bname,id,author,price);
					al.add(bk);
					//System.out.println(al);
					
				}

				break;

			}

			case 2: {
//				System.out.println("Enter the book name u wamt...");
				log.info("Enter the Book name u wamt...: ");
				String bname = sc.nextLine();
				for (Object ob : al) {
					Book bk = (Book) ob;
					String bookName = bk.getbName();
					if (bookName.equals(bname)) {
						System.out.println(bk);
						break;
					}
					
				}
				//System.out.println("No Books are Present in the collection");
				log.info("No Books are Present in the collection ");
				
				break;
			}
			case 3: {
				System.out.println("Enter the Book id which ever u want...");
				int id = sc.nextInt();
				for (Object obj : al) 
				{
					Book bk = (Book) obj;
					int bid = bk.getBid();
					if (id == bid) 
					{
						al.remove(bk);
						System.out.println(bk);
						break;
					}
				}
				break;
			}

			case 4: {
				System.out.println(al);
				break;
			}

			case 5: {
				for (Object ob : al) {
					Book bk = (Book) ob;
					Double bookPrice = bk.getPrice();
					if (bookPrice >= 150 && bookPrice <= 250) {
						System.out.println(bk);
					}
				}
				break;
			}
			case 6:
			{
				n=0;
				System.out.println("Programme ended......");
			}

			}
			
		}


		sc.close();
	}

}
