
//   You are expected to create a register() method that will valid user details before saving them in memory. Below are the specifications:
//   User details gathered by this system include givenName, familyName, birthDate,
//   countryCode, taxld, height, weight, alpha2 country code and email.
//   For the user to considered valid:
//        All fields must be present.

//        The values in all fields must follow real world rules eg. no negative height, no future
//        birthDate date, email must be in the correct format etc.

//        Upon validation, a custom exception must be thrown if any of the details are invalid.
//        The message of this exception must include all details that are incorrect in a format
//        that includes the name of the respective field as a key and a custom error code as a
//        value.

//        For example, if the taxld is missing AND the email is in an incorrect
//        Format AND the weight is negative, the exception message could be:
//        "taxid: IS BLANK; email: INCORRECT _FORMAT, weight: INVALID_VALUE"



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
}

public class main{
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
            //System.out.println("dd-mm-yyyy");


           // String date = scanner.nextLine();
           // Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
           // System.out.println(date1);

           String name = scanner.nextLine();
            System.out.println(name);

            try{
                register(name,"V", "11-22-2003", "MT", -6, -200, "vellagmail.com");

            }
            catch(UserDefinedException ude)
            {
                // Print the message from MyException object
                System.out.println(ude.getMessage());
            }
    }

        static void register (String givenName, String familyName, String birthDate, String countryCode, float height, float weight, String email) throws UserDefinedException{
        //parse date

        // checking if any fields blank

                if(givenName.isEmpty()){   //(param != null)
                    throw new UserDefinedException("name is blank!");
                }


            //check if height and weight are 0

            //check for no negative height, weight

        // checking birthday format

        // checking country code format
            Locale locale = new Locale("en", "US", "WIN");
            System.out.println("Locale:" + locale);
            String[] countries = Locale.getISOCountries();

            for (int i = 0; i < countries.length; i++) {
                //if( countries[i]);
            }

            //checking email format

        }
    }
