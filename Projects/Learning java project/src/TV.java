import java.util.Scanner;

public class TV {

    private double width;
    private double height;
    private double pixels;
    private double frame_rate;
    private boolean has_remote;
    //private Remote remote;

    public TV(double width, double height, double pixels, double frame_rate, boolean has_remote) {
        this.width = width;
        this.height = height;
        this.pixels = pixels;
        this.frame_rate = frame_rate;
        this.has_remote = has_remote;
         
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*width+2*height;
    }

    @Override
    public String toString() {
        return "TV["+width+","+height+"]Area:"+getArea()+",Perimiter:"+getPerimeter();
    }

    public static void main(String[] args) {
         Scanner console=new Scanner(System.in);
        double width = getValue(console, "Width");
        double height = getValue(console, "Height");
        double pixels = getValue(console, "pixels");
        double frame_rate = getValue(console, "frame_rate");
        boolean has_remote = getValueBoolean(console, "has_remote");
        TV TV = new TV(width, height, pixels, frame_rate, has_remote);
        System.out.println(TV);

    }

    public static double getValue(Scanner console, String name) {
        System.out.println("Enter "+name + " : ");
        String widthStr = console.nextLine();
        double parseDouble;
        try {
            parseDouble = Double.parseDouble(widthStr);
        }catch(NumberFormatException ne) {
            System.out.println("Unable to parse your input, enter correct value ");
            return getValue(console, name);
        }
        return parseDouble;
    }
    
    public static boolean getValueBoolean(Scanner console, String name) {
        System.out.println("Enter "+name + " : ");
        String widthStr = console.nextLine();
        boolean parseBoolean;
        try {
            parseBoolean = Boolean.parseBoolean(widthStr);
        }catch(NumberFormatException ne) {
            System.out.println("Unable to parse your input, enter correct value ");
            return getValueBoolean(console, name);
        }
        return parseBoolean;
    }
}


