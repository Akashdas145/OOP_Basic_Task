class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Change the light color
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Get duration
    public int getDuration() {
        return duration;
    }

    // Set new duration
    public void setDuration(int duration) {
        this.duration = duration;
    }
}

public class TrafficLightTest {
    public static void main(String[] args) {
        // Initial light: red, duration 45
        TrafficLight light = new TrafficLight("red", 45);
        // Output initial states
        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());
        // Change to green
        light.changeColor("green");
        System.out.println("The light is now green: " + light.isGreen());

        // Print initial duration
        System.out.println("The light duration is: " + light.getDuration());

        // Change duration to 25
        light.setDuration(25);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}