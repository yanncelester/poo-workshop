package ar.com.ada.online.second.interfaceex;

import java.util.ArrayList;

public interface DataBase<D> {
        //Metodo para guardar en la base de datos
        //El contrato para guardar en la base de datos son cuatro médodos
        //GUARDAR
        //CONSULTAR
        //CONSULTAR POR ID
        //ELIMINAR

        //D es el datatype (tipo de retorno que dará el método
        D save(D obj); //como es genérico no se que tipo de retorno tendra el obj que implemente
        ArrayList<D> getAll(); //Consultar
        D findById(Integer id); //Consultar por id
        void delete(Integer id); //eliminar

}
