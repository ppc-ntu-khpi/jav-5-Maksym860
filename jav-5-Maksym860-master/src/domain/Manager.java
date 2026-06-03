package domain;

/**
 * Представляє менеджера, який керує командою працівників {@link Employee}.
 * <p>
 * {@code Manager} розширює {@link Employee} і зберігає масив
 * працівників, що підпорядковані цьому менеджеру.
 * </p>
 *
 * @author Maksym
 * @version 1.0
 * @see Employee
 */
public class Manager extends Employee {

    /** Масив працівників, якими керує цей менеджер. */
    private Employee[] employees;

    /**
     * Створює менеджера з усіма зазначеними даними та командою.
     *
     * @param employees масив об'єктів {@link Employee}, що підпорядковані менеджеру
     * @param name      повне ім'я менеджера
     * @param jobTitle  посада менеджера
     * @param level     рівень кваліфікації (1–3)
     * @param dept      назва відділу
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Створює менеджера з командою. Інші поля залишаються незаповненими.
     *
     * @param employees масив об'єктів {@link Employee}, що підпорядковані менеджеру
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює менеджера з випадковим ідентифікатором та порожньою
     * командою місткістю 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає імена всіх підпорядкованих працівників у вигляді
     * рядка, розділеного комами.
     *
     * @return рядок з іменами працівників команди
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює команду працівників, якими керує цей менеджер.
     *
     * @param employees масив об'єктів {@link Employee}
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підпорядкованих працівників у вихідному вигляді.
     *
     * @return масив працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    /**
     * Повертає рядкове представлення менеджера — дані батьківського
     * класу {@link Employee} з доданим переліком підпорядкованих працівників.
     *
     * @return відформатований рядок з даними менеджера та командою
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }
}
