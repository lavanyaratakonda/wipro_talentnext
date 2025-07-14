package optional;
import java.util.Optional;
import java.util.Scanner;
public class NpException {

	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] names = new String[5];
	        names[0] = sc.nextLine();
	        Optional<String> opt = Optional.ofNullable(names[0]);
	        if (opt.isPresent()) {
	            System.out.println(opt.get().length());
	        } else {
	            System.out.println("Value is null");
	        }
	    }
	}



