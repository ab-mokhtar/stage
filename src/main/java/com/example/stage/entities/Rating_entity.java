package com.example.stage.entities;

import com.example.stage.ctrl.Etudiant;

import javax.persistence.*;

@Entity
public class Rating_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Etudiant_entity etudiant;
    @ManyToOne
    private  Module_entity module;
    private int pedagogie_note;
    private int contenu_note;
    private int enseignement_note;
    private int ambiance_note;
    private int nb_heure;
    private int enseignement_progression_note;
   @Column(length = 255,nullable = true)
    private String points_forts;
    @Column(length = 255,nullable = true)
    private String points_faibles;
    @Column(length = 255,nullable = true)
    private String proposition;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Etudiant_entity getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant_entity etudiant) {
        this.etudiant = etudiant;
    }

    public Module_entity getModule() {
        return module;
    }

    public void setModule(Module_entity module) {
        this.module = module;
    }

    public int getPedagogie_note() {
        return pedagogie_note;
    }

    public void setPedagogie_note(int pedagogie_note) {
        this.pedagogie_note = pedagogie_note;
    }

    public int getContenu_note() {
        return contenu_note;
    }

    public void setContenu_note(int contenu_note) {
        this.contenu_note = contenu_note;
    }

    public int getEnseignement_note() {
        return enseignement_note;
    }

    public void setEnseignement_note(int enseignement_note) {
        this.enseignement_note = enseignement_note;
    }

    public int getAmbiance_note() {
        return ambiance_note;
    }

    public void setAmbiance_note(int ambiance_note) {
        this.ambiance_note = ambiance_note;
    }

    public int getNb_heure() {
        return nb_heure;
    }

    public void setNb_heure(int nb_heure) {
        this.nb_heure = nb_heure;
    }

    public int getEnseignement_progression_note() {
        return enseignement_progression_note;
    }

    public void setEnseignement_progression_note(int enseignement_progression_note) {
        this.enseignement_progression_note = enseignement_progression_note;
    }

    public String getPoints_forts() {
        return points_forts;
    }

    public void setPoints_forts(String points_forts) {
        this.points_forts = points_forts;
    }

    public String getPoints_faibles() {
        return points_faibles;
    }

    public void setPoints_faibles(String points_faibles) {
        this.points_faibles = points_faibles;
    }

    public String getProposition() {
        return proposition;
    }

    public void setProposition(String proposition) {
        this.proposition = proposition;
    }
}
