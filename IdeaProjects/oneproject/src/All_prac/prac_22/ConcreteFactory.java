package All_prac.prac_22;

public class ConcreteFactory implements ComplexAbstarctFactory{

    @Override
    public Complex createComplex() {

        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {

        return new Complex(real, image);
    }
}
