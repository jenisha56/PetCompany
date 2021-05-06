
public abstract interface SortedADT {

    public class NotFoundException extends Exception{}

    public class NotUniqueException extends Exception{}

    public abstract void insert (String object) throws NotUniqueException;

    // returns the object found
    public abstract String remove(String object) throws NotFoundException;

    // returns the object removed
    public abstract String find(String object) throws NotFoundException;
}
