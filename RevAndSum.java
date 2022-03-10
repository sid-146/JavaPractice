import java.util.Scanner;

class RevAndSum{
    public static void main(string[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Number, Reverse = 0, Addition; 
        Number = sc.nextInt();

        // int i = 0;

        while(Number >= 0)
        {  
            int temp = Number % 10;
            Reverse = Reverse + temp;
            Addition = Addition + temp;
            Addition = Addition * 10;
            Number = Number / 10;
        }

        System.out.println(Addition);
        System.out.println(Reverse);
    }
}