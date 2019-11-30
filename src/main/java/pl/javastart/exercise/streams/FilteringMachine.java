package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> list = numberList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return list;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> list = numberList.stream()
                .filter(n -> n>20)
                .collect(Collectors.toList());
        return list;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> books = titles.stream()
                .map(Book::new)
                .collect(Collectors.toList());
        return books;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> books = titles.stream()
                .filter(f -> f.startsWith("Gra"))
                .map(Book::new)
                .collect(Collectors.toList());
        return books;
    }
}
