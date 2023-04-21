package by.pvt.companytax;

import java.util.*;

public class Firm {
    private String name;
    private String fieldOfActivity;
    private int debt;
    private int id;

    public Firm(String name, String fieldOfActivity, int debt, int id) {
        this.name = name;
        this.fieldOfActivity = fieldOfActivity;
        this.debt = debt;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Firm firm = (Firm) o;
        return id == firm.id && Objects.equals(name, firm.name) && Objects.equals(fieldOfActivity, firm.fieldOfActivity) && debt == firm.debt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fieldOfActivity, debt, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "name='" + name + '\'' +
                ", fieldOfActivity='" + fieldOfActivity + '\'' +
                ", debt='" + debt + '\'' +
                ", id=" + id +
                '}';
    }
}
