package visitor;

public class VisitorSample {
    static public void main(String[] args){
        Car car = new Car();
        Visitor printVisitor = new PrintVisitor();
        Visitor doVisitor = new DoVisitor();
        car.accept(printVisitor);
        car.accept(doVisitor);
    }
}