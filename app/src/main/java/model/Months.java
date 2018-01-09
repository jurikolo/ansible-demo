package model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "months")
@NamedQuery(name = "findAllMonths", query =
                "select name from Months months order by sequence"
        )
public class Months {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(name = "name")
    private String name;

    @Column(name = "sequence")
    private Integer sequence;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Months{" +
                "name='" + name + '\'' +
                '}';
    }
}
