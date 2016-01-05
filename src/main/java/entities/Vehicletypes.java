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
@Table(name = "Vehicle_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicletypes.findAll", query = "SELECT v FROM Vehicletypes v"),
    @NamedQuery(name = "Vehicletypes.findByVehicleTypeId", query = "SELECT v FROM Vehicletypes v WHERE v.vehicleTypeId = :vehicleTypeId"),
    @NamedQuery(name = "Vehicletypes.findByName", query = "SELECT v FROM Vehicletypes v WHERE v.name = :name"),
    @NamedQuery(name = "Vehicletypes.findBySize", query = "SELECT v FROM Vehicletypes v WHERE v.size = :size")})
public class Vehicletypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private int size;

    public Vehicletypes() {
    }

    public Vehicletypes(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public Vehicletypes(Integer vehicleTypeId, String name, int size) {
        this.vehicleTypeId = vehicleTypeId;
        this.name = name;
        this.size = size;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleTypeId != null ? vehicleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicletypes)) {
            return false;
        }
        Vehicletypes other = (Vehicletypes) object;
        if ((this.vehicleTypeId == null && other.vehicleTypeId != null) || (this.vehicleTypeId != null && !this.vehicleTypeId.equals(other.vehicleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Vehicletypes[ vehicleTypeId=" + vehicleTypeId + " ]";
    }
    
}
