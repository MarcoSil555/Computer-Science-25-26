public class Chair {

    private int numberOfLegs; // = 4;
    private boolean wheels; // = true;
    private float speed; // = 12.34;
    private String color; // = "blue and gray";
    private int numberOfScrews; // = 4;
    private char firstLetter; // = 'C'

    // characteristics private, actions public

    public Chair() {
        numberOfLegs = 4;
        wheels = true;
        speed = 0f;
        color = "blue and gray";
        numberOfScrews = 4;
        firstLetter = 'C';

    // break the chair
    // chair can roll
    // chair can recline
    }

    public void roll() {
        speed = 5.5f;
        System.out.println("Slow down!!");
        System.out.println(speed);

    }

    public void rupture() {
        numberOfScrews = 0;
        numberOfLegs = 0;
        wheels = false;
        System.out.println("Ouch! I have " + numberOfScrews + " attached.");

    }

    public void recline() {
        System.out.println("Relaxing!");
        }

    public void paintPurple() {
        System.out.println("I am currently " + color);
        color = "Purple";
        System.out.println("I am now " + color);

    }
}

