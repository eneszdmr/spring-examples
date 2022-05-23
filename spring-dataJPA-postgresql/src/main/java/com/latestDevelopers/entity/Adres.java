package com.latestDevelopers.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "kisi_adres")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(length = 500, name = "adres")
    private String adres;
    @Enumerated
    private String adresTip;

    @Column(name = "aktif")
    private boolean aktif;

    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    public enum AdresTip {
        EV_ADRESI, IS_ADRESI, DIGER

    }

}
