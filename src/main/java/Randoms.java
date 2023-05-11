import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }
    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new  Iterator<>() {
            Random random = new Random();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return min + random.nextInt(max - min);
            }
        };
    }
}

