package model;

public enum DeliveryTypeEnum {
    EMAIL("e-mail"), CELL_PHONE("Mensagem por celular"), PRINT("Impressão do boletim");

    String label;

    DeliveryTypeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
