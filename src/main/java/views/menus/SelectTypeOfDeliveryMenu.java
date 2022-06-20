package views.menus;
import model.DeliveryTypeEnum;
import views.validation.OptionEnumValidate;
import views.validation.YesNoValidate;
import java.util.Scanner;

public class SelectTypeOfDeliveryMenu extends BasicMenu<Integer>{
    @Override
    public Integer run(Scanner sc) {

        System.out.print("Deseja enviar o boletim ? (s-sim ou n-não): ");
        if (YesNoValidate.run(sc)){
            System.out.println("Selecione o modo de envio: ");
            for(int i = 0; i < DeliveryTypeEnum.values().length; i++){
                System.out.printf("\t%d - %s %n", i+1, DeliveryTypeEnum.values()[i].getLabel());
            }

            int option = -1;
            do {
                System.out.print("Digite o codigo do modo de envio: ");
                option = OptionEnumValidate.run(sc, DeliveryTypeEnum.values());
            }while(option < 0 || option >= DeliveryTypeEnum.values().length);

            return option;
        }
        return -1;
    }
}
