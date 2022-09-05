package ch.makery.address.model;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Drone extends Component{
	enum Facing{
		UP,
		DOWN,
		LEFT,
		RIGHT
	}
	
	private String name = null;
	private double price = 0.00;
	private int location_x = 0;
	private int location_y = 0;
	private double length = 25.0;
	private double width = 25.0;
	private double height = 25.0;
	private Color color;
	private ImageView image;
	private Facing facing = Facing.DOWN;
	
	
	// Constructor | Called when "+ add Item" is clicked giving an empty Item at the origin.
	public Drone(String name) {
		this.name = name;
	}
	public Drone(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Drone(String name, ImageView image) {
		this.name = name;
		this.image = image;
	}
	public Drone(String name, ImageView image, int location_x, int location_y, double length, double width, double height) {
		this.name = name;
		this.image = image;
		this.location_x = location_x;
		this.location_y = location_y;
		this.length = length;
		this.width = width;
		this.height = height;	
		this.facing = Facing.DOWN;
	}
	public Drone(String name, double price, ImageView image, int location_x, int location_y, double length, double width, double height, Color color) {
		this.name = name;
		this.price = price;
		this.location_x = location_x;
		this.location_y = location_y;
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
		this.image = image;
		this.facing = Facing.DOWN;
	}
	
	//Getters -----------------------------------------------------------------------------------------
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public int getLocationX() {
		return this.location_x;
	}
	public int getLocationY() {
		return this.location_y;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	public Color getColor() {
		return this.color;
	}
	public ImageView getImage() {
		return this.image;
	}
	
	// Setters ----------------------------------------------------------------------------------------
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setLocationX(int location_x) {
		this.location_x = location_x;
	}
	public void setLocationY(int location_y) {
		this.location_y = location_y;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void deleteItem(Component c) {	
	}
	
//Methods -----------------------------------------------------------------------------------------------
	public String toString() {
		return "Name: "+name+", Price: "+ price+ ", Length: "+length+", Width: "+width+", Height: "+height+", Color: "+color+", Location: "+"("+location_x +","+ location_y+")";
	}
	public void setImage(ImageView image) {
		this.image = image;
	}
	
	@Override
	public void accept(MarketPriceVisitor v) {
		v.visit(this);
		
	}
	public Facing getFacing() {
		return facing;
	}
	public void setFacing(Facing facing) {
		this.facing = facing;
	}
	
	public boolean isUp() {
		if (this.getFacing() == Facing.UP) {
			return true;
		} else { return false;
		}
	}
	public boolean isDown() {
		if (this.getFacing() == Facing.DOWN) {
			return true;
		} else { return false;
		}
	}
	public boolean isLeft() {
		if (this.getFacing() == Facing.LEFT) {
			return true;
		} else { return false;
		}
	}
	public boolean isRight() {
		if (this.getFacing() == Facing.RIGHT) {
			return true;
		} else { return false;
		}
	}
	
	public void rotateLeft() {
		if (this.isDown()){ this.setFacing(Facing.RIGHT);}
		else if (this.isUp()){ this.setFacing(Facing.LEFT);}
		else if (this.isLeft()){ this.setFacing(Facing.DOWN);}
		else if (this.isRight()){ this.setFacing(Facing.UP);}
	}
	public void rotateRight() {
		if (this.isDown()){ this.setFacing(Facing.LEFT);}
		else if (this.isUp()){ this.setFacing(Facing.RIGHT);}
		else if (this.isLeft()){ this.setFacing(Facing.UP);}
		else if (this.isRight()){ this.setFacing(Facing.DOWN);}
	}
	
	public void printFace() {
		if (this.isDown()){ System.out.println("DOWN");}
		if (this.isUp()){ System.out.println("UP");}
		if (this.isLeft()){ System.out.println("LEFT");}
		if (this.isRight()){ System.out.println("RIGHT");}
	}

}


