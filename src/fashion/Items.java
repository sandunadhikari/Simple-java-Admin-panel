/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashion;

/**
 *
 * @author ADSI
 */
public class Items {
    private int Id;
    private String Name;
    private float Price;
    private String AddDate;
    private byte[] Image;

    public Items(int  id,String name,float price,String adddate,byte [] image) {
        this.Id=id;
        this.Name=name;
        this.Price=price;
        this.AddDate=adddate;
        this.Image=image;
    }
    
    
    
    public int getId(){
        return this.Id;
    }
    public String getName(){
        return this.Name;
    }
    public float getPrice(){
        return this.Price;
    }
    public String getAddDate(){
        return this.AddDate;
    }
    public byte[] getImage(){
        return  this.Image;
    } 
    
}
