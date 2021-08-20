package www.ozifirebrand.com.student.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccomodationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accomodationId;

    @Column(nullable = false)
    private String address;


}
