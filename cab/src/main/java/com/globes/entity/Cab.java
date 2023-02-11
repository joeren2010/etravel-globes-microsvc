package com.globes.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import javax.persistence.*;

@Entity
@Table(name="cab")
@NamedQuery(name="Cab.findAll", query="SELECT c FROM Cab c")
public class Cab implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//add fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cabid")					//tells springboot to map to cabid
	private int cabId;						//by default: springboot will map this to cab_id
	@Column(name="cabcolor")	
	private String cabColor;
	@Column(name="cabtitle")
	private String cabTitle;
	@Column(name="cabdescription")	
	private String cabDescription;
	private int price;
	
	@ElementCollection							//stores a list of values as an entity
	@OrderColumn(name="imageid")				//ensures the order in the column is maintained
	@CollectionTable(name="imageinfo")			//defines the table name
	@Lob										//specifies the datatype "blob" type
	@Column(columnDefinition="LONGBLOB")		//ensures "longblob" is the assigned "blob" type
	private String images[];					//array-field for array-table	

	@Column(name="thumbnailimage")
	private int thumbnailImage;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="addedon")						//tells springboot to map to addedon
	private Date addedOn;						//by default: springboot will map this to added_on
	private int rating;
	@Column(name="pickuploc")	
	private String pickupLoc;
	@Column(name="pickupdate")	
	private LocalDate pickupDate;
	@Column(name="pickuptime")	
	private LocalTime pickupTime;
	@Column(name="dropoffloc")	
	private String dropoffLoc;
	@Column(name="dropoffdate")	
	private LocalDate dropoffDate;
	@Column(name="dropofftime")	
	private LocalTime dropoffTime;
	@Column(name="categoryid")					//tells springboot to map to categoryid
	private int categoryId;						//by default: springboot will map this to category_id
	
//	//bi-directional many-to-one association to Category
//	//@JsonIgnore
//	@ManyToOne
//	//@JoinColumn(name="categoryId", nullable=false)
//	@JoinColumn(name="categoryid", nullable=false)
//	//@JoinColumn(name="cabid", referencedColumnName="categoryid", insertable = false, updatable = false, nullable=false)
//	private Category category;
//	//bi-directional many-to-one association to Cart
//	@OneToMany(mappedBy="cab")
//	private List<Cart> carts;
//	//bi-directional many-to-one association to Orderitem
//	@OneToMany(mappedBy="cab")
//	private List<Orderitem> orderitems;
//	//bi-directional many-to-one association to Wishlist
//	@OneToMany(mappedBy="cab")
//	private List<Wishlist> wishlists;
	
	//default constructor
	public Cab() {
		super();
	}

	//parameterized constructor
	public Cab(int cabId, String cabColor, String cabTitle, String cabDescription, int price, String[] images,
			int thumbnailImage, Date addedOn, int rating, String pickupLoc, LocalDate pickupDate, LocalTime pickupTime,
			String dropoffLoc, LocalDate dropoffDate, LocalTime dropoffTime, int categoryId) {
		super();
		this.cabId = cabId;
		this.cabColor = cabColor;
		this.cabTitle = cabTitle;
		this.cabDescription = cabDescription;
		this.price = price;
		this.images = images;
		this.thumbnailImage = thumbnailImage;
		this.addedOn = addedOn;
		this.rating = rating;
		this.pickupLoc = pickupLoc;
		this.pickupDate = pickupDate;
		this.pickupTime = pickupTime;
		this.dropoffLoc = dropoffLoc;
		this.dropoffDate = dropoffDate;
		this.dropoffTime = dropoffTime;
		this.categoryId = categoryId;
	}

	
	//getter and setter methods
	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public String getCabColor() {
		return cabColor;
	}

	public void setCabColor(String cabColor) {
		this.cabColor = cabColor;
	}

	public String getCabTitle() {
		return cabTitle;
	}

	public void setCabTitle(String cabTitle) {
		this.cabTitle = cabTitle;
	}

	public String getCabDescription() {
		return cabDescription;
	}

	public void setCabDescription(String cabDescription) {
		this.cabDescription = cabDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(int thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getPickupLoc() {
		return pickupLoc;
	}

	public void setPickupLoc(String pickupLoc) {
		this.pickupLoc = pickupLoc;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getDropoffLoc() {
		return dropoffLoc;
	}

	public void setDropoffLoc(String dropoffLoc) {
		this.dropoffLoc = dropoffLoc;
	}

	public LocalDate getDropoffDate() {
		return dropoffDate;
	}

	public void setDropoffDate(LocalDate dropoffDate) {
		this.dropoffDate = dropoffDate;
	}

	public LocalTime getDropoffTime() {
		return dropoffTime;
	}

	public void setDropoffTime(LocalTime dropoffTime) {
		this.dropoffTime = dropoffTime;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	//override to-string method
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", cabColor=" + cabColor + ", cabTitle=" + cabTitle + ", cabDescription="
				+ cabDescription + ", price=" + price + ", images=" + Arrays.toString(images) + ", thumbnailImage="
				+ thumbnailImage + ", addedOn=" + addedOn + ", rating=" + rating + ", pickupLoc=" + pickupLoc
				+ ", pickupDate=" + pickupDate + ", pickupTime=" + pickupTime + ", dropoffLoc=" + dropoffLoc
				+ ", dropoffDate=" + dropoffDate + ", dropoffTime=" + dropoffTime + ", categoryId=" + categoryId + "]";
	}

}