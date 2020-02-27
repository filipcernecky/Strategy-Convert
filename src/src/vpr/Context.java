package src.vpr;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(int num){
        return strategy.convert(num);
    }
}
