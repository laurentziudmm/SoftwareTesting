public class Calculator {

    public int add (int x, int y) {
        return x+y;
    }

    public int diff (int x, int y) {
        return x-y;
    }

    public String clock (int time){
        if (time < 12) {
            return " Good Morning " ;
        } else {
            return " Good Evening " ;
        }
    }

    public int divide (int x,int y) {
        return x / y;
    }

    public int multiply (int x,int y) {
        return x * y;
    }
}
