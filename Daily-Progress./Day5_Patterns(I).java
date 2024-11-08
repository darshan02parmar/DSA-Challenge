
import java.util.Scanner;

public class Patterns(I) {
    
// Star Pattern
  public static void main(String[] args) {
        
        System.out.print("Enter number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int lines = 1; lines <= n; lines++) {
            for(int star=1;star<=lines;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

  // Inverted Star pattern
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int lines = 1; lines < n; lines++) {
            for (int star = 1; star < (n-lines+1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// Half pyramind
      public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }

// Character pattern
    
     public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char ch='A';

        for (int i=1; i<=n; i++) {
            for (int j=1 ; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }        
    }

// FLOYD'S Triangle pattern

  public static void main(String[] args) {
    System.out.print("Enter number ");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    int number=1;

    for (int i=1;i<=n;i++) {
        for (int j=1;j<=i; j++) {
            System.out.print(number+" ");
            number++;   
        }   
        System.out.println();
    }
  }
}

