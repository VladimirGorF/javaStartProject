import java.time.LocalDateTime;
import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {

       
        
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец
//  массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны 
// от заданного, а остальные - равны ему.
    
    int [] arr = new int [] {3,1,2,3,2,3};
    for (int i = 0; i < arr.length - 1; i++){
            int temp = 0;
            if (arr[i] == 3 && arr[i+1] != 3) {
                temp = arr [i+1];
                arr [i+1] = arr [i];
                arr [i] = temp; 
            } 
            else if (arr[i] == 3 && arr[i+1] == 3) {
                for (int j = i+2; j < arr.length; j++ ){
                    if (arr[j] != 3) {
                        temp = arr [j];
                        arr [j] = arr [i];
                        arr [i] = temp;
                    }

                }
            }

    }
    
    System.out.println();
    










    //  Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Введите массив: ");
        // String arrStr = iScanner.nextLine();
        // // arrStr.split(arrStr) = 


        // int [] arr = new int [] {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        //     int count = 0;
        //     int countMax = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         if (arr[i] == 1) {
        //             count++;
        //         } else {
        //             if (count > countMax) {
        //                 countMax = count;
        //             } 
        //             count = 0;
        //         }
        //         if (count > countMax) {
        //             countMax = count;
        //         } 
        //     }
        //     System.out.println(countMax);







        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Введите имя: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет %s", name);
        // iScanner.close();
        
    }
    
}
