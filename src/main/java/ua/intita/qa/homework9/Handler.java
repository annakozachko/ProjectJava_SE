package ua.intita.qa.homework9;

public interface Handler {
    String uppercase(String word);              // метод переводит слово в верхний регистр  Character.isUpperCase()
    String lowercase(String word);              // метод переводит слово в нижний регистр
    int getLength(String word);                 // метод возвращает длину слова
    String concat(String str1, String str2);    // метод обьединяет две строки в одну/ concat()
    boolean contains(String word, char symbol);  // метод возвращает true если в слове есть такая буква
}
