/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

/**
 *
 * @author Tharindu
 */
public class book {
    private String book;
    private int Quantiy;
    private int Cost;
    public book(String ISBN,int quan){
        book=ISBN;
        Quantiy=quan;
    }
    public book(String ISBN,int quan,int cost){
        book=ISBN;
        Quantiy=quan;
        Cost=cost;
    }
    public String getISBN(){
        return this.book;
    }
    public int getQuantity(){
        return this.Quantiy;
    }
    public int getCost(){
        return this.Cost;
    }
}

