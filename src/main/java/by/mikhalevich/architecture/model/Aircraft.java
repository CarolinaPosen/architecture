package by.mikhalevich.architecture.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@ToString
@Entity
@Table(name = "aircrafts")
public class Aircraft {

    @GeneratedValue
    @Id
    private String aircraftCode;
    private String model;
    private Integer range;

}
