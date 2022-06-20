package views.servicesEntry;

import java.util.Scanner;

public class SendEmail extends SendBasic{

    @Override
    public void run(Scanner sc){
        sc.nextLine(); // clean sc
        System.out.print("Digite o e-mail dos pais: ");
        String email = sc.nextLine();
        messageSend(email);
        messageReady();
    }
}
