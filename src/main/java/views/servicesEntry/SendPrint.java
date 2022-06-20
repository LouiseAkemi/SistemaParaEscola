package views.servicesEntry;
import java.util.Scanner;

public class SendPrint extends SendBasic {
    @Override
    public void run(Scanner sc){
        System.out.print("Digite o nome da impressora: ");
        String printerName = sc.nextLine();
        messageSend(printerName);
        messageReady();

    }

    @Override
    protected void messageSend(String sender){
        System.out.printf("Enviando para a impressora %s %n",sender);
        System.out.println("Imprimindo...3...2...1");
    }

    @Override
    protected void messageReady(){
        System.out.println("Impressão pronta!");
    }

}
