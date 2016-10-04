package ch.lazzaretti.exercise02;

/**
 * Created by flazz on 27.09.2016.
 */
public class FactorialDouble extends ch.lazzaretti.exercise01.FactorialDouble {

    @Override
    public int getFactorialDouble(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Undefined");
        }else if(number == 1) {
            return 1;
        }else if(number == 2){
            return 2;
        } else if (12 < number) {
            throw new Exception("To large");
        }

        return getFactorialDouble(number-2)*number;
    }
}
