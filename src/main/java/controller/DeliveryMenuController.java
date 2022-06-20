package controller;
import views.menus.SelectTypeOfDeliveryMenu;
import views.servicesEntry.SendCellPhone;
import views.servicesEntry.SendEmail;
import views.servicesEntry.SendPrint;
import java.util.Scanner;

public class DeliveryMenuController {
    public static void run(Scanner sc) {
        int option = new SelectTypeOfDeliveryMenu().run(sc);

        switch (option) {
            case -1:
                SelectTypeOfDeliveryMenu.exit();
                return;
            case 0:
                new SendEmail().run(sc);
                break;
            case 1:
                new SendCellPhone().run(sc);
                break;
            case 2:
                new SendPrint().run(sc);
                break;
            default:
                SelectTypeOfDeliveryMenu.invalidOption();
                break;
        }

        MainMenuController.run();
    }
}
