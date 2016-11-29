package ch.lazzaretti.exercise10.sub3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.ToDoubleFunction;

/**
 * Created by fab on 29.11.2016.
 */
public class QueryList<E> extends ArrayList<E> {

    public QueryList(){
        super();
    }

    public QueryList(Collection<? extends E> c){
        super(c);
    }

    public double average(ToDoubleFunction<? super E> f){
        double sum = 0;
        for(E item:this){
            sum += f.applyAsDouble(item);
        }
        return sum / this.size();
    }

    public E maximumElement(ToDoubleFunction<? super E> f){
        if (this.size() == 0){
            throw new RuntimeException("List is Empty!");
        }
        E maxItem = this.get(0);
        double max = f.applyAsDouble(maxItem);
        for(int i=1; i<this.size();i++){
            E item = this.get(i);
            double thisVal = f.applyAsDouble(item);
            if (max < thisVal){
                max = thisVal;
                maxItem = item;
            }
        }
        return maxItem;
    }

    public double maximum(ToDoubleFunction<? super E> f){
        if (this.size() == 0){
            throw new RuntimeException("List is Empty!");
        }
        double max = f.applyAsDouble(this.get(0));
        for(int i=1; i<this.size();i++){
            double thisVal = f.applyAsDouble(this.get(i));
            if (max < thisVal){
                max = thisVal;
            }
        }
        return max;
    }
}
