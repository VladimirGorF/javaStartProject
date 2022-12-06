import java.io.FileWriter;
import java.io.IOException;
import java.io.*;


public class file_work_module {
    // Запись файлов, дозапись, если нет такого файла создание.
    // public static void main(String[] args) {
    //     try (FileWriter fw = new FileWriter("file.txt", false)) {
    //         fw.write("Во поле береза стояла");
    //         fw.append('\n');
    //         fw.append('3');
    //         fw.write("Спартак забил гол");
    //         fw.append('\n');
    //         fw.write("Тут тоже что-то стояло Дуб наверное");
    //         fw.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }
    // Чтение посимовольно
    // public static void main(String[] args) throws Exception {
    //     FileReader fr = new FileReader("file.txt");
    //     int c;
    //     while ((c = fr.read()) != -1) {
    //         char ch = (char) c;
    //         if (ch == '\n') {
    //             System.out.print(ch);
    //         } else {
    //             System.out.print(ch);
    //         }
    //     }
    // }
    // Чтение построчное
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }

}

    