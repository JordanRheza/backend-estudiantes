package com.backend.estudiantes.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "instructores")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario;

    @Column(nullable = false)
    private String especialidad;

    @Column(nullable = false)
    private LocalDate fechaContratacion;
}
