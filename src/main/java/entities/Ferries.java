/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Entity
@Table(name = "Ferries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ferries.findAll", query = "SELECT f FROM Ferries f"),
    @NamedQuery(name = "Ferries.findByFerryId", query = "SELECT f FROM Ferries f WHERE f.ferryId = :ferryId"),
    @NamedQuery(name = "Ferries.findByName", query = "SELECT f FROM Ferries f WHERE f.name = :name"),
    @NamedQuery(name = "Ferries.findByMaxPeople", query = "SELECT f FROM Ferries f WHERE f.maxPeople = :maxPeople"),
    @NamedQuery(name = "Ferries.findByMaxCar", query = "SELECT f FROM Ferries f WHERE f.maxCar = :maxCar"),
    @NamedQuery(name = "Ferries.findByMaxLorry", query = "SELECT f FROM Ferries f WHERE f.maxLorry = :maxLorry"),
    @NamedQuery(name = "Ferries.findByMaxMachinery", query = "SELECT f FROM Ferries f WHERE f.maxMachinery = :maxMachinery"),
    @NamedQuery(name = "Ferries.findByMovableDeck", query = "SELECT f FROM Ferries f WHERE f.movableDeck = :movableDeck"),
    @NamedQuery(name = "Ferries.findByOutOfService", query = "SELECT f FROM Ferries f WHERE f.outOfService = :outOfService"),
    @NamedQuery(name = "Ferries.findByNote", query = "SELECT f FROM Ferries f WHERE f.note = :note"),
    @NamedQuery(name = "Ferries.findByOwner", query = "SELECT f FROM Ferries f WHERE f.owner = :owner")})
public class Ferries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ferry_id")
    private Integer ferryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_people")
    private int maxPeople;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_car")
    private int maxCar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_lorry")
    private int maxLorry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_machinery")
    private int maxMachinery;
    @Basic(optional = false)
    @NotNull
    @Column(name = "movable_deck")
    private boolean movableDeck;
    @Column(name = "out_of_service")
    private Boolean outOfService;
    @Size(max = 200)
    @Column(name = "note")
    private String note;
    @Column(name = "owner")
    private Integer owner;

    public Ferries() {
    }

    public Ferries(Integer ferryId) {
        this.ferryId = ferryId;
    }

    public Ferries(Integer ferryId, String name, int maxPeople, int maxCar, int maxLorry, int maxMachinery, boolean movableDeck) {
        this.ferryId = ferryId;
        this.name = name;
        this.maxPeople = maxPeople;
        this.maxCar = maxCar;
        this.maxLorry = maxLorry;
        this.maxMachinery = maxMachinery;
        this.movableDeck = movableDeck;
    }

    public Integer getFerryId() {
        return ferryId;
    }

    public void setFerryId(Integer ferryId) {
        this.ferryId = ferryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getMaxCar() {
        return maxCar;
    }

    public void setMaxCar(int maxCar) {
        this.maxCar = maxCar;
    }

    public int getMaxLorry() {
        return maxLorry;
    }

    public void setMaxLorry(int maxLorry) {
        this.maxLorry = maxLorry;
    }

    public int getMaxMachinery() {
        return maxMachinery;
    }

    public void setMaxMachinery(int maxMachinery) {
        this.maxMachinery = maxMachinery;
    }

    public boolean getMovableDeck() {
        return movableDeck;
    }

    public void setMovableDeck(boolean movableDeck) {
        this.movableDeck = movableDeck;
    }

    public Boolean getOutOfService() {
        return outOfService;
    }

    public void setOutOfService(Boolean outOfService) {
        this.outOfService = outOfService;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ferryId != null ? ferryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ferries)) {
            return false;
        }
        Ferries other = (Ferries) object;
        if ((this.ferryId == null && other.ferryId != null) || (this.ferryId != null && !this.ferryId.equals(other.ferryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Ferries[ ferryId=" + ferryId + " ]";
    }
    
}
