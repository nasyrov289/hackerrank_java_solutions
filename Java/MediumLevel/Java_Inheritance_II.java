package MediumLevel;

class Arithmetic {
    public String getName() {
        return "Arithmetic";
    }
}

class Adder extends Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}
