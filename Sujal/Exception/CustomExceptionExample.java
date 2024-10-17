class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}


 class CustomExceptionExample 
{
    
    static void validateAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age is not valid to vote, must be 18 or older.");
        } 
        else 
        {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try 
        {
            validateAge(16);
        } catch (InvalidAgeException e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
