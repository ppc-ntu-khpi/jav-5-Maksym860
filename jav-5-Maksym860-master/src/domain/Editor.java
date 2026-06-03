package domain;

/**
 * Представляє редактора — спеціалізованого художника з перевагою
 * електронного або паперового редагування.
 * <p>
 * {@code Editor} розширює {@link Artist} і додає поле {@code electronicEditing},
 * яке вказує, чи надає редактор перевагу цифровому формату роботи.
 * </p>
 *
 * @author Maksym
 * @version 1.0
 * @see Artist
 */
public class Editor extends Artist {

    /**
     * Перевага редагування: {@code true} — електронне, {@code false} — паперове.
     */
    private boolean electronicEditing;

    /**
     * Створює редактора з усіма зазначеними даними.
     *
     * @param electronicEditing {@code true} — перевага електронного редагування,
     *                          {@code false} — паперового
     * @param skiils            масив назв навичок
     * @param name              повне ім'я працівника
     * @param jobTitle          посада працівника
     * @param level             рівень кваліфікації (1–3)
     * @param dept              назва відділу
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з перевагою редагування та навичками.
     * Інші поля залишаються незаповненими.
     *
     * @param electronicEditing {@code true} — перевага електронного редагування
     * @param skiils            масив назв навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з перевагою редагування та порожнім масивом навичок.
     *
     * @param electronicEditing {@code true} — перевага електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора зі значеннями за замовчуванням:
     * перевага електронного редагування {@code true}, порожній масив навичок.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає перевагу редагування цього редактора.
     *
     * @return {@code true} — якщо надається перевага електронному редагуванню,
     *         {@code false} — паперовому
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює перевагу редагування для цього редактора.
     *
     * @param electronic {@code true} — електронне редагування, {@code false} — паперове
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }

    /**
     * Повертає рядкове представлення редактора — дані батьківського
     * класу {@link Artist} з доданою перевагою редагування.
     *
     * @return відформатований рядок з даними працівника, навичками та перевагою редагування
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }
}
