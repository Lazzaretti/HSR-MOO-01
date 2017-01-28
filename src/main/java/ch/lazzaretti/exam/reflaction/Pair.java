package ch.lazzaretti.exam.reflaction;

/**
 * Created by flazz on 22.01.2017.
 */
public class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    public T first;
    public U second;

    @Override
    public int compareTo(Pair<T, U> other) {
        int c = first.compareTo(other.first);
        if (c == 0) {
            c = second.compareTo(other.second);
        }
        return c;
    }

    public static void main(String[] args){
        new Pair<Base,MySub>();
    }
}

class MySub extends Base{

}

class Base implements Comparable<Base>{

    @Override
    public int compareTo(Base o) {
        return 0;
    }
}