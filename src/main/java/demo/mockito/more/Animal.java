package demo.mockito.more;

public class Animal {
    public String sound() {
        return "Some sound";
    }
}

class Dog {
    public String sound() {
        return "Bark";
    }

    public String favoriteToy() {
        return "Bone";
    }
}

class Cat {
    public String sound() {
        return "Meow";
    }

    public String favoriteToy() {
        return "Ball of yarn";
    }
}

