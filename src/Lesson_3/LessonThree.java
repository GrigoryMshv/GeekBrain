package Lesson_3;

import java.util.*;

public class LessonThree {
    public static void main(String[] args) {

    String[] arr = {"1", "2", "3", "2",
            "four", "7", "level", "3",
            "2", "four", "7", "new",
            "native", "coffe", "seven",
            "new", "9", "0", "2"};

        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);                            //вычисляем уникальные слова
            if (map.containsKey(arr[i]))                //вычисляем повтор слов
                map.put(arr[i], map.get(arr[i]) + 1);   //
            else                                        //
                map.put(arr[i], 1);                     //
        }

        System.out.println("Колличество уникальных слов: " + set.size() + "\nСписок уникальных слов: " + set);
        System.out.println("Cписок колличества каждого слова " + map);
        System.out.println();

        phon();  //вызов метода телефонного справочника
    }

    private static void phon() {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "+79178905468");
        phonebook.add("Petrov", "+79034678475");
        phonebook.add("Sidorov", "+79152381811");
        phonebook.add("Nosov", "+79256781209");
        phonebook.add("Shishkin", "+79034056784");
        phonebook.add("Nosov", "+79162174788");
        phonebook.add("Ivanov", "+79054081858");
        phonebook.add("Shishkin", "+79075060369");
        phonebook.add("Shishkin", "+79098761256");

        System.out.println("Ivanov" + phonebook.get("Ivanov"));
        System.out.println("Petrov" + phonebook.get("Petrov"));
        System.out.println("Sidorov" + phonebook.get("Sidorov"));
        System.out.println("Nosov" + phonebook.get("Nosov"));
        System.out.println("Shishkin" + phonebook.get("Shishkin"));
    }
}

class Phonebook {
    private Map<String, List<String>> phonebook_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phonebook_hm.containsKey(surname)) {
            phone_number_list = phonebook_hm.get(surname);
            phone_number_list.add(phone_number);
            phonebook_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phonebook_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phonebook_hm.get(surname);
    }
}
