package domain;

/**
 * Представляє працівника-художника, який має набір творчих навичок.
 * <p>
 * {@code Artist} розширює {@link Employee} і додає список навичок,
 * що описують художні здібності працівника.
 * </p>
 *
 * @author Maksym
 * @version 1.0
 * @see Employee
 */
public class Artist extends Employee {

    /** Масив навичок цього художника. */
    private String[] skiils;

    /**
     * Створює художника з усіма зазначеними даними.
     *
     * @param skiils   масив назв навичок
     * @param name     повне ім'я працівника
     * @param jobTitle посада працівника
     * @param level    рівень кваліфікації (1–3)
     * @param dept     назва відділу
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює художника із зазначеними навичками та випадковим ідентифікатором.
     * Інші поля залишаються незаповненими.
     *
     * @param skiils масив назв навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює художника з випадковим ідентифікатором та порожнім
     * масивом навичок місткістю 10.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає навички художника у вигляді рядка, розділеного комами.
     *
     * @return рядок з переліком навичок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив навичок для цього художника.
     *
     * @param skills новий масив назв навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок у вихідному вигляді.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }

    /**
     * Повертає рядкове представлення художника — дані батьківського
     * класу {@link Employee} з доданим переліком навичок.
     *
     * @return відформатований рядок з даними працівника та навичками
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }
}
