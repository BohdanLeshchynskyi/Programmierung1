package storage;

import java.util.Objects;

class Storage {
    private Object[] objects;
    private String name;

    Storage(String name) {
        this.name = name;
        this.objects = new Object[3];
    }

    void add(Object object) {
        for (int i = 0; i < 3; i++) {
            if (objects[i] == null) {
                objects[i] = object;
                break;
            }
        }
    }

    private String helperToString(Object object) {
        if (object == null) {
            return "(null)";
        } else {
            return "(" + object.toString() + ":" + object.getClass().getSimpleName() + ")";
        }
    }

    @Override
    public String toString() {
        String objectsToStrings = name + ": [";
        for (int i = 0; i < 3; i++) {
            objectsToStrings += helperToString(objects[i]);
        }
        objectsToStrings += "]";
        return objectsToStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, objects[0], objects[1], objects[2]);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Storage a = (Storage) o;
        return this.toString().equals(a.toString());
    }
}
