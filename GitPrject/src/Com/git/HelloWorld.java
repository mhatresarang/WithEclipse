package Com.git;

import java.sql.Date;
import java.time.LocalDate;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello World");
	Runtime r = Runtime.getRuntime();
	System.out.println(r);

	Date D = new Date (2023);
	System.out.println(D);
	LocalDate d = LocalDate.now();
	System.out.println(d);
	System.out.println(d);
	System.out.println(d);

}
}
