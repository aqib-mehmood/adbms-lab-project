/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package femail_pms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author SYED ALI ABBAS
 */
@Entity
@Table(name = "PARKINGINFORMATION", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Parkinginformation.findAll", query = "SELECT p FROM Parkinginformation p")
    , @NamedQuery(name = "Parkinginformation.findByPrarkingPlotId", query = "SELECT p FROM Parkinginformation p WHERE p.prarkingPlotId = :prarkingPlotId")
    , @NamedQuery(name = "Parkinginformation.findByFloorLevel", query = "SELECT p FROM Parkinginformation p WHERE p.floorLevel = :floorLevel")
    , @NamedQuery(name = "Parkinginformation.findByPlotName", query = "SELECT p FROM Parkinginformation p WHERE p.plotName = :plotName")
    , @NamedQuery(name = "Parkinginformation.findBySlotName", query = "SELECT p FROM Parkinginformation p WHERE p.slotName = :slotName")
    , @NamedQuery(name = "Parkinginformation.findByVehicleNamePlate", query = "SELECT p FROM Parkinginformation p WHERE p.vehicleNamePlate = :vehicleNamePlate")
    , @NamedQuery(name = "Parkinginformation.findByEntrydate", query = "SELECT p FROM Parkinginformation p WHERE p.entrydate = :entrydate")
    , @NamedQuery(name = "Parkinginformation.findByEntryTime", query = "SELECT p FROM Parkinginformation p WHERE p.entryTime = :entryTime")
    , @NamedQuery(name = "Parkinginformation.findByExitTime", query = "SELECT p FROM Parkinginformation p WHERE p.exitTime = :exitTime")
    , @NamedQuery(name = "Parkinginformation.findByParkingtype", query = "SELECT p FROM Parkinginformation p WHERE p.parkingtype = :parkingtype")
    , @NamedQuery(name = "Parkinginformation.findByPrice", query = "SELECT p FROM Parkinginformation p WHERE p.price = :price")})
public class Parkinginformation implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PRARKING_PLOT_ID")
    private BigDecimal prarkingPlotId;
    @Column(name = "FLOOR_LEVEL")
    private String floorLevel;
    @Column(name = "PLOT_NAME")
    private String plotName;
    @Column(name = "SLOT_NAME")
    private String slotName;
    @Column(name = "VEHICLE_NAME_PLATE")
    private String vehicleNamePlate;
    @Column(name = "ENTRYDATE")
    private String entrydate;
    @Column(name = "ENTRY_TIME")
    private String entryTime;
    @Column(name = "EXIT_TIME")
    private String exitTime;
    @Column(name = "PARKINGTYPE")
    private String parkingtype;
    @Column(name = "PRICE")
    private BigInteger price;

    public Parkinginformation() {
    }

    public Parkinginformation(BigDecimal prarkingPlotId) {
        this.prarkingPlotId = prarkingPlotId;
    }

    public BigDecimal getPrarkingPlotId() {
        return prarkingPlotId;
    }

    public void setPrarkingPlotId(BigDecimal prarkingPlotId) {
        BigDecimal oldPrarkingPlotId = this.prarkingPlotId;
        this.prarkingPlotId = prarkingPlotId;
        changeSupport.firePropertyChange("prarkingPlotId", oldPrarkingPlotId, prarkingPlotId);
    }

    public String getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(String floorLevel) {
        String oldFloorLevel = this.floorLevel;
        this.floorLevel = floorLevel;
        changeSupport.firePropertyChange("floorLevel", oldFloorLevel, floorLevel);
    }

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        String oldPlotName = this.plotName;
        this.plotName = plotName;
        changeSupport.firePropertyChange("plotName", oldPlotName, plotName);
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        String oldSlotName = this.slotName;
        this.slotName = slotName;
        changeSupport.firePropertyChange("slotName", oldSlotName, slotName);
    }

    public String getVehicleNamePlate() {
        return vehicleNamePlate;
    }

    public void setVehicleNamePlate(String vehicleNamePlate) {
        String oldVehicleNamePlate = this.vehicleNamePlate;
        this.vehicleNamePlate = vehicleNamePlate;
        changeSupport.firePropertyChange("vehicleNamePlate", oldVehicleNamePlate, vehicleNamePlate);
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        String oldEntrydate = this.entrydate;
        this.entrydate = entrydate;
        changeSupport.firePropertyChange("entrydate", oldEntrydate, entrydate);
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        String oldEntryTime = this.entryTime;
        this.entryTime = entryTime;
        changeSupport.firePropertyChange("entryTime", oldEntryTime, entryTime);
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        String oldExitTime = this.exitTime;
        this.exitTime = exitTime;
        changeSupport.firePropertyChange("exitTime", oldExitTime, exitTime);
    }

    public String getParkingtype() {
        return parkingtype;
    }

    public void setParkingtype(String parkingtype) {
        String oldParkingtype = this.parkingtype;
        this.parkingtype = parkingtype;
        changeSupport.firePropertyChange("parkingtype", oldParkingtype, parkingtype);
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        BigInteger oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prarkingPlotId != null ? prarkingPlotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parkinginformation)) {
            return false;
        }
        Parkinginformation other = (Parkinginformation) object;
        if ((this.prarkingPlotId == null && other.prarkingPlotId != null) || (this.prarkingPlotId != null && !this.prarkingPlotId.equals(other.prarkingPlotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "femail_pms.Parkinginformation[ prarkingPlotId=" + prarkingPlotId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
