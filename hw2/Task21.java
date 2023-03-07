package hw2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task21 {
    private static String readerFile(String pathFile) throws FileNotFoundException, IOException {

        String str = "empty";
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            StringBuilder sBuilder = new StringBuilder();
            str = br.readLine();
        }
        return str;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str = readerFile("hw2/task21.txt");
        boolean ft = true;
        str = str.replaceAll("[{} ]", "");
        String[] arr = str.split("[:,]");
        StringBuilder sBuilder = new StringBuilder("SELECT * FROM students WHERE ");
        for (int i = 0; i < arr.length; i += 2) {
            if (!arr[i + 1].equals("\"null\"")) {
                if (!ft)
                    sBuilder.append(" AND ");
                ft = false;
                sBuilder.append(arr[i].substring(1, arr[i].length() - 1));
                sBuilder.append(" = ");
                sBuilder.append(arr[i + 1]);
            }
        }
        sBuilder.append(";");
        System.out.println(sBuilder);
    }

}