/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Izidio Carvalho
 */
@Entity
@Table(name = "Retail")
public class Retail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String InvoiceNo;
    private String StockCode;
    private String Description;
    private String Quantity;
    private String InvoiceDate;
    private String UnitPrice;
    private String CustomerID;
    private String Country;

    public Retail() {

    }

    public Retail(String InvoiceNo, String StockCode, String Description, String Quantity, String InvoiceDate, String UnitPrice, String CustomerID, String Country) {
        this.InvoiceNo = InvoiceNo;
        this.StockCode = StockCode;
        this.Description = Description;
        this.Quantity = Quantity;
        this.InvoiceDate = InvoiceDate;
        this.UnitPrice = UnitPrice;
        this.CustomerID = CustomerID;
        this.Country = Country;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the InvoiceNo
     */
    public String getInvoiceNo() {
        return InvoiceNo;
    }

    /**
     * @param InvoiceNo the InvoiceNo to set
     */
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    /**
     * @return the StockCode
     */
    public String getStockCode() {
        return StockCode;
    }

    /**
     * @param StockCode the StockCode to set
     */
    public void setStockCode(String StockCode) {
        this.StockCode = StockCode;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Quantity
     */
    public String getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the InvoiceDate
     */
    public String getInvoiceDate() {
        return InvoiceDate;
    }

    /**
     * @param InvoiceDate the InvoiceDate to set
     */
    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    /**
     * @return the UnitPrice
     */
    public String getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the CustomerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }
}
