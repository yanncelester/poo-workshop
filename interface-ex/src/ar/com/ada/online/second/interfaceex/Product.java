package ar.com.ada.online.second.interfaceex;

import java.util.Date;
import java.util.UUID;

public class Product {

    // Atributos
    private UUID uuid; //UUID (Universally Unique ID) es un estándar (parte de ISO/IEC 11578:1996) para crear identificadores únicos universales para identificar objetos en un sistema.
    private String name;
    private Date expirationDate;

    //Constructores


    public Product() {
    }

    public Product(UUID uuid, String name, Date expirationDate) {
        this.uuid = uuid;
        this.name = name;
        this.expirationDate = expirationDate;
    }

}
