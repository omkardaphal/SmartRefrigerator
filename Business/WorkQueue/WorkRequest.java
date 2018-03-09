/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Results.ResultsDir;
import Business.UserAccount.UserAccount;
import Refrigerator.ConsumedProudcts;
import Refrigerator.Product;
import Refrigerator.ProductDirectory;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private Product proudct;
    private ConsumedProudcts productDirectory;

    private String message;
    private String result;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String familyID;
    private ResultsDir resultsDir;

    public ResultsDir getResultsDir() {
        return resultsDir;
    }

    public void setResultsDir(ResultsDir resultsDir) {
        this.resultsDir = resultsDir;
    }

    public Product getProudct() {
        return proudct;
    }

    public void setProudct(Product proudct) {
        this.proudct = proudct;
    }

    public ConsumedProudcts getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ConsumedProudcts productDirectory) {
        this.productDirectory = productDirectory;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getFamilyID() {
        return familyID;
    }

    public void setFamilyID(String familyID) {
        this.familyID = familyID;
    }

    @Override
    public String toString() {
        return sender.getUsername();
    }

}
