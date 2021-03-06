package library.library.comparators;

import library.library.model.Reader;

import java.util.Comparator;

/**
 * Created by Alexander on 02.11.2016.
 */
public class ComparatorReaderByName implements Comparator<Reader> {

    @Override
    public int compare(Reader reader1, Reader reader2) {
        return reader1.getName().compareTo(reader2.getName());
    }
}
