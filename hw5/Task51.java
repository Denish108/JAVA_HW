package hw5;

import java.util.HashMap;
import java.util.List;

public class Task51 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.put("Ivanov", List.of("+79991222222", "+79882111111"));
        phoneBook.put("Petrov", List.of("+799842333333", "+79883222222"));
        phoneBook.put("Sidorov", List.of("+79893444444", "+31234350"));
        
        System.out.println(phoneBook);
    }
}
