package demo.mockito.more;

public class Car {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

class Engine {
    public void ignite() {
        System.out.println("Engine ignited");
    }

    public void shutdown() {
        System.out.println("Engine shutdown");
    }
}

class Transmission {
    public void shiftUp() {
        System.out.println("Transmission shifted up");
    }

    public void shiftDown() {
        System.out.println("Transmission shifted down");
    }
}

