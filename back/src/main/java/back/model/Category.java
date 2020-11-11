package back.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Getter
@Setter
@Entity
public class Category {
    @Id
    private int id;
    private String MainClassName;
    private String SubClassName;
    private String CategoryName;
}
