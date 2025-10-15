public class StaticLifetime {
    static int var = 0;
public void incrementCounter(){
    var++;
    System.out.println("Variables: " + var);
}

public static void main(String[] args){
    StaticLifetime obj = new StaticLifetime();
    StaticLifetime obj2 = new StaticLifetime();
    obj.incrementCounter();
    obj2.incrementCounter();
}
}
