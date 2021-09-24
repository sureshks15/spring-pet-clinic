package learn.spring.petclinic.model;

import java.io.Serializable;

public class BaseEnity implements Serializable {

    Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
