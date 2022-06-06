package entities.enums;

public enum EmployeeType {

    WAITER("Garçom"),
    MONITOR("Monitore"),
    COOK("Cozinheiro"),
    SUPERVISOR("Supervisor"),
    DOORMAN("Porteiro"),
    RECEPTIONIST("Recepcionista");

    private String description;

    private EmployeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static EmployeeType content(String description) {
        for (EmployeeType value : EmployeeType.values()) {
            if (value.getDescription().equals(description)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Tipo de funcionário inválido");
    }
}
