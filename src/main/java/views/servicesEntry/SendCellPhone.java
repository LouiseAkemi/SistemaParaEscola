package views.servicesEntry;
import java.util.Scanner;

public class SendCellPhone extends SendBasic{

    @Override
    public void run(Scanner sc){
        sc.nextLine(); // clean sc
        System.out.print("Digite o número de telefone dos pais: ");
        String number = sc.nextLine();
        messageSend(number);
        messageReady();
    }
}
