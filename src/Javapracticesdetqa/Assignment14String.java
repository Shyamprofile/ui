package Javapracticesdetqa;

public class Assignment14String {

	public static void main(String[] args) {
		String Str1= "Welcome";
		String Str2= "Java";
		String Str3= "Welcome";
//Compare 2 string ignoring case
		System.out.println(Str1.equalsIgnoreCase(Str3));
		System.out.println(Str1.equalsIgnoreCase(Str2));
//Concatenate one string to another string	
		System.out.println(Str1.concat(Str2));
//Get length of given string
		System.out.println(Str1.length());
//Get substring of given string at specified location
		System.out.println(Str1.substring(3, 6));
//Convert all characters in string to uppercase
		System.out.println(Str1.toUpperCase());
//Convert all characters in string to lowercase
		System.out.println(Str1.toLowerCase());
		}

}
