class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class userException {
    static void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Not Valid");
        else
            System.out.println("Valid");
    }
    public static void main(String[] args){
        try{
            validate(13);
        }
        catch(Exception m){
            System.out.println("Exception occurred "+m);
        }
        System.out.println("Made By Chaitanya sharma");
    }
}
