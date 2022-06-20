package views.servicesEntry;
import java.util.Scanner;

public abstract class SendBasic {
    public abstract void run(Scanner sc);

    protected void messageSend(String sender){
        System.out.printf("Enviando para %s %n",sender);
        System.out.println("Enviando...3...2...1");
    }

    protected void messageReady(){
        System.out.println("Envio feito!");
    }

}
