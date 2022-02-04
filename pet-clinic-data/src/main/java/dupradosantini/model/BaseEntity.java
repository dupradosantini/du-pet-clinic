package dupradosantini.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    //Everything will extend this base entity.
    private Long id; //Using Boxtyper because they can be NULLABLE

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
