import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        System.out.println("Coffee Shop");
        System.out.print("Please enter currency value - ");

        //TODO: Считать значение moneyAmount из консоли
        int moneyAmount = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            moneyAmount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value !");
        }

        //Заданые цены и напитки
        int[] drinkPrices = {150, 80, 20, 30};
        String[] drinkNames = {"Cappuccinos", "Americano", "Water", "Milk"};

        //Переменная для проверки возможности покупки
        boolean canBuyAnything = false;

        for (int i = 0; i < 4; i++) {
            if (drinkPrices[i] <= moneyAmount) {
                System.out.println("You could buy : " + drinkNames[i]);
                canBuyAnything = true;
            } else {
                System.out.println("Not enough " + (drinkPrices[i] - moneyAmount) + "$  for " + drinkNames[i]);
            }
        }

        if (canBuyAnything == false) {
            System.out.println("Not enough money");
        }

        //TODO:
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        //TODO: получить скриншот екрана в переменную image
        try {
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            System.out.println(image.getWidth() + "x" + image.getHeight());
            ImageIO.write(image, "png", new File("/home/ezhik/Desktop/" + formatter.format(date) + ".png"));
        } catch (AWTException e) {
            e.printStackTrace();
        }

        //TODO: send to telegram chat with hashtag #ямолодец
    }
}
