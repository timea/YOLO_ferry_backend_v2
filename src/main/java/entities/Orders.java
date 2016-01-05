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
@Table(name = "Orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Orders.findByCustomerId", query = "SELECT o FROM Orders o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "Orders.findByRouteId", query = "SELECT o FROM Orders o WHERE o.routeId = :routeId"),
    @NamedQuery(name = "Orders.findByDepartureDateTime", query = "SELECT o FROM Orders o WHERE o.departureDateTime = :departureDateTime"),
    @NamedQuery(name = "Orders.findByArrivalDateTime", query = "SELECT o FROM Orders o WHERE o.arrivalDateTime = :arrivalDateTime"),
    @NamedQuery(name = "Orders.findByNrOfOassengers", query = "SELECT o FROM Orders o WHERE o.nrOfOassengers = :nrOfOassengers"),
    @NamedQuery(name = "Orders.findByVehicleList", query = "SELECT o FROM Orders o WHERE o.vehicleList = :vehicleList")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "route_id")
    private Integer routeId;
    @Column(name = "departure_date_time")
    private Integer departureDateTime;
    @Column(name = "arrival_date_time")
    private Integer arrivalDateTime;
    @Column(name = "nr_of_oassengers")
    private Integer nrOfOassengers;
    @Column(name = "vehicle_list")
    private Integer vehicleList;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Integer departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Integer getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Integer arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Integer getNrOfOassengers() {
        return nrOfOassengers;
    }

    public void setNrOfOassengers(Integer nrOfOassengers) {
        this.nrOfOassengers = nrOfOassengers;
    }

    public Integer getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(Integer vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Orders[ orderId=" + orderId + " ]";
    }
    
}
