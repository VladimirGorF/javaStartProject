import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class lib {
    public static void hi(){
        System.out.println("hi");

    }
    static double factor(int n) {
        if (n==1) return 1;
        return n * factor(n-1);

    }
    public static void odd(int num){
        for (int i = 0; i < num; i++) {
            if (i%2 == 0) 
                continue;
            System.out.println(i);        
        }
    }
    // Работа с файлами, запись, дозапись
    public static void file_work(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
    // Чтение посимовольно
    public static void char_read(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    }   
    // Построчное чтение
    public static void str_read(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }



}
