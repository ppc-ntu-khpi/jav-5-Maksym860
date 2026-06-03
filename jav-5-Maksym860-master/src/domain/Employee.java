package domain;

/**
 * Представляє загального працівника компанії.
 * <p>
 * Це базовий клас для всіх типів працівників. Кожен працівник має
 * унікальний випадково згенерований ідентифікатор, ім'я, посаду,
 * рівень кваліфікації (1–3) та відділ.
 * </p>
 *
 * @author Maksym
 * @version 1.0
 */
public class Employee {

    /** Повне ім'я працівника. */
    private String name;

    /** Посада працівника. */
    private String jobTitle;

    /** Унікальний випадково згенерований ідентифікатор працівника. */
    private int ID;

    /**
     * Рівень кваліфікації працівника.
     * <p>Допустимі значення: 1 (молодший), 2 (середній), 3 (старший).
     * Будь-яке інше значення автоматично замінюється на 1.</p>
     */
    private int level;

    /** Назва відділу, до якого належить працівник. */
    private String dept;

    /**
     * Створює працівника із зазначеними даними.
     *
     * @param name     повне ім'я працівника (якщо формат невірний — встановлюється {@code "John Doe"})
     * @param jobTitle посада працівника
     * @param level    рівень кваліфікації (1–3; недопустимі значення замінюються на 1)
     * @param dept     назва відділу
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює працівника з випадково згенерованим ідентифікатором.
     * Інші поля залишаються незаповненими.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає повне ім'я працівника.
     *
     * @return ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації працівника.
     * <p>Приймає значення 1, 2 або 3. Будь-яке інше значення тихо замінюється на 1.</p>
     *
     * @param level рівень кваліфікації (1–3)
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень кваліфікації працівника.
     *
     * @return рівень кваліфікації (1–3)
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу, до якого належить працівник.
     *
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює повне ім'я працівника.
     * <p>
     * Ім'я повинно містити щонайменше ім'я та прізвище, розділені пробілом,
     * і складатися лише з літер, апострофів, ком, крапок або дефісів.
     * Якщо ім'я не відповідає шаблону — встановлюється значення {@code "John Doe"}.
     * </p>
     *
     * @param name повне ім'я працівника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }

    /**
     * Повертає рядкове представлення працівника, що містить
     * ідентифікатор, ім'я, посаду, рівень та відділ.
     *
     * @return відформатований рядок з даними працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
}
