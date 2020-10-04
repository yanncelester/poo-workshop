package ar.com.ada.online.second.interfaceex;

import java.util.ArrayList;

public class NOSQLDataBase implements DataBase<Person> {
    @Override
    public Person save(Person obj) {
        return null;
    }

    @Override
    public ArrayList<Person> getAll() {
        return null;
    }

    @Override
    public Person findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
