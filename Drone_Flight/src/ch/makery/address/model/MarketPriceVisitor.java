package ch.makery.address.model;


public class MarketPriceVisitor implements Visitor{
	private double marketValue;
	
	public MarketPriceVisitor() {
		marketValue = 0;
	}
	public MarketPriceVisitor(double price) {
		this.marketValue = price;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double price) {
		this.marketValue = price;
	}
	public void getTotalMarketPrice(Container c) {
		marketValue += c.getTotalPrice();
	}	
	
	@Override
	public void visit(Component c) {
		marketValue += c.getPrice();	
	}
	
	public double containerValue(Container c) {
		return marketValue += c.getTotalPrice();
		}
	public double  Value() {
		return marketValue * 0.9;
		
		}
		
	}
	

