class switchday 
{
    public static void main(String args[]) 
    {
     char ch='S';
     
     switch(ch)
     {
        case 'M':
                System.out.println("Monday");
        break;
        case 'T':
                System.out.println("Tuesday");
                break;
        case 'W':
                System.out.println("Wednesday");
                break;
        case 't':
                System.out.println("Thursday");
                break;
        case 'F':
                 System.out.println("Friday");
                 break;
        case 's':
                 System.out.println("Saturday");
                 break;
        case 'S':
                 System.out.println("Sunday");
                 break;
        default:
                System.out.println("Invalid Choice");
     }
    }
}
