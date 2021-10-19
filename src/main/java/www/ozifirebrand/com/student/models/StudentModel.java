package www.ozifirebrand.com.student.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentModel {

    // every of your model must have an id

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer studentId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Transient
    private int age;

    @Column(nullable = false, unique = true)
    private int phoneNumber;

//    @OneToOne
//    private AccommodationModel accommodationModel;
}
