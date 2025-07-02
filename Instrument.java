abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
// Main class
class TestInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        
        // Assign different types of instruments
        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Piano();
        instruments[4] = new Flute();
        instruments[5] = new Guitar();
        instruments[6] = new Piano();
        instruments[7] = new Guitar();
        instruments[8] = new Flute();
        instruments[9] = new Piano();
        
        for (int i = 0; i < instruments.length; i++) {
            System.out.print("Instrument at index " + i + ": ");
            instruments[i].play();  

            // Type identification using instanceof
            if (instruments[i] instanceof Piano) {
                System.out.println(" -> It's a Piano\n");
            } else if (instruments[i] instanceof Flute) {
                System.out.println(" -> It's a Flute\n");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println(" -> It's a Guitar\n");
            }
        }
    }
}

