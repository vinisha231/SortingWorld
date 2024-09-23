import java.util.Scanner; 

class rough23{
    private static void reverse(int[] a){
        int n = a.length; 
        for(int i=0; i<n/2; i++){
            int temp = a[i]; 
            a[i] = a[n-i-1]; 
            a[n-i-1] = temp; 
        }
    }

    private static void insertionSort(int[] a){
        System.out.println("Insertion sort performed! ");
        int n = a.length; 
        for(int i=1; i<n; i++){
            for(int j = i ; j>0 && (less(a[j], a[j-1])); j--){
                exchange(a , j , j-1);
                print(a); 
            }
        }
    }
    
    private static void selectionSort(int[] a){
        System.out.println("Selection sort performed!");
        int n = a.length;
        for(int i=0; i<n; i++){
            int min = i; 
            for(int j = i+1; j<n; j++){
                if (less(a[j], a[min])){
                    min = j; 
                }
                exchange(a, i, min); 
                print(a); 
            }
        }
    }

    private static boolean less(int v, int w){
        return v <= w;
    }

    private static void exchange(int[] a, int i, int j){
        int temp = a[i]; 
        a[i]= a[j];
        a[j] = temp; 
    }

    private static void print(int[] a){
        for(int i=0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println(); 
    }

    private static void reset(int[] a){
        for(int i=1; i<=a.length; i++){
            a[i-1]=i; 
        }
        reverse(a); 
    }

    public static void main(String[] args) {
        int[] newArray = new int[10]; 
        reset(newArray);
        System.out.println("Printing Array");
        print(newArray);

        System.out.println("Welcome to sorting calculator world!");
        boolean repeat = true; 
        while(repeat){
            System.out.println("Choose your sorting method from the following options: "); 
            System.out.println("1. Selection sort"); 
            System.out.println("2. Insertion sort"); 
            System.out.println("5. Exit"); 
            Scanner input = new Scanner(System.in); 
            int ch = input.nextInt(); 
            switch (ch) {
                case 1 -> {
                    reset(newArray);
                    selectionSort(newArray);
                    System.out.println();
                }
                case 2 -> {
                    reset(newArray);
                    insertionSort(newArray);
                    System.out.println();
                }
                default -> {
                    System.out.println("Thanks for visiting the sorting world!");
                    System.out.println("Hope to see you again!");
                    System.out.println(); 
                    repeat = false;
                }
            }
        }
    }
}
