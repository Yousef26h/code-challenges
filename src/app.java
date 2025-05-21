import java.io.File;

public class app {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid number of arguments passed.");
        } else {
            switch (args[0]) {
                case "-c":
                    File file = new File(args[1]);
                    if (!file.exists()) {
                        System.out.println("File not found. Please make sure to provide absolute file path.");
                    } else {
                        System.out.println(file.length());
                    }
                    break;
                default:
                    System.out.println("Please use one of the following options: -c ");
            }
        }
    }
}
