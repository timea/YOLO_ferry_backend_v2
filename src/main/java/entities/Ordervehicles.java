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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Entity
@Table(name = "Order_vehicles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordervehicles.findAll", query = "SELECT o FROM Ordervehicles o"),
    @NamedQuery(name = "Ordervehicles.findByOrderVehiclesId", query = "SELECT o FROM Ordervehicles o WHERE o.orderVehiclesId = :orderVehiclesId"),
    @NamedQuery(name = "Ordervehicles.findByOrderId", query = "SELECT o FROM Ordervehicles o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Ordervehicles.findByVehicleTypeId", query = "SELECT o FROM Ordervehicles o WHERE o.vehicleTypeId = :vehicleTypeId")})
public class Ordervehicles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_vehicles_id")
    private Integer orderVehiclesId;
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;

    public Ordervehicles() {
    }

    public Ordervehicles(Integer orderVehiclesId) {
        this.orderVehiclesId = orderVehiclesId;
    }

    public Integer getOrderVehiclesId() {
        return orderVehiclesId;
    }

    public void setOrderVehiclesId(Integer orderVehiclesId) {
        this.orderVehiclesId = orderVehiclesId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderVehiclesId != null ? orderVehiclesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordervehicles)) {
            return false;
        }
        Ordervehicles other = (Ordervehicles) object;
        if ((this.orderVehiclesId == null && other.orderVehiclesId != null) || (this.orderVehiclesId != null && !this.orderVehiclesId.equals(other.orderVehiclesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Ordervehicles[ orderVehiclesId=" + orderVehiclesId + " ]";
    }
    
}
