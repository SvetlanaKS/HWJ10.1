package ru.netology.manager;

import ru.netology.domain.MoviesItem;

public class PosterManager {
    private MoviesItem[] items = new MoviesItem[0];

    public void add(MoviesItem item) {
        int length = items.length + 1;
        MoviesItem[] tmp = new MoviesItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MoviesItem[] getAll() {
        MoviesItem[] result = new MoviesItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public MoviesItem[] showLastMovies() {
        int moviesCount = 10;
        int resultsLenght;
        if (moviesCount > items.length) {
            resultsLenght = items.length;
        } else {
            resultsLenght = moviesCount;
        }
        MoviesItem[] results = new MoviesItem[resultsLenght];
        for (int i = 0; i < resultsLenght; i++) {
            int index = items.length - i - 1;
            results[i] = items[index];
        }
        return results;
    }

    public MoviesItem[] showLastMovies(int lenght) {
        int resultsLenght;
        if (lenght > items.length) {
            resultsLenght = items.length;
        } else {
            resultsLenght = lenght;
        }
        MoviesItem[] results = new MoviesItem[resultsLenght];
        for (int i = 0; i < resultsLenght; i++) {
            int index = items.length - i - 1;
            results[i] = items[index];
        }
        return results;
    }

//
////     наивная реализация
//    public void removeById(int id) {
//        int length = items.length - 1;
//        MoviesItem[] tmp = new MoviesItem[length];
//        int index = 0;
//        for (MoviesItem item : items) {
//            if (item.getId() != id) {
//                tmp[index] = item;
//                index++;
//            }
//        }
//        // меняем наши элементы
//        items = tmp;
//    }
}