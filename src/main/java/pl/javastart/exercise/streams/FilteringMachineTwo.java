package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> names = ppl.stream()
                .filter(f -> f.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
        return names;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName()+"_"+person.getAge()))
                .collect(Collectors.toList());
        return users;
    }
}
