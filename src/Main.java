import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();


        while (!queue.isEmpty()){
            Person person = queue.peek(); // посмотрим
            if (person.useTicket()) {
                System.out.println(person.name + " " + person.lastName + " прокатился на аттракционе");
                queue.poll(); //вынимаем
                if (person.qTickets != 0) {queue.offer(person); }
            } else queue.poll();
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Ирина", "Иванова", 2));
        list.add(new Person("Николай", "Свиридов", 1));
        list.add(new Person("Игорь", "Пупкин", 0));
        list.add(new Person("Нина", "Петрова", 5));
        list.add(new Person("Алена", "Комиссарова", 1));
        return list;
    }
}