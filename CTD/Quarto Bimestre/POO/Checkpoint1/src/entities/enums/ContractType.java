package entities.enums;

public enum ContractType {

    BRUNCH("Café-Almoço"),
    LUNCH("Almoço"),
    COCKTAIL("Coquitel"),
    MIX("Mix"),
    BREAK("Recreio");

    private String description;

    private ContractType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ContractType content(String description) {
        for (ContractType value : ContractType.values()) {
            if (value.getDescription().equals(description)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Tipo de festa inválida");
    }
}
