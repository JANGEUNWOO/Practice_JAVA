package sec05_verify;

public abstract class Shape {

	
	Point p;
	
	public Shape(){
	
	}
	
    Shape(Point p){
    	
    }
    
    public Point getPosition() {
    	return p;
    }
    
    public void setPosition(Point p) {
    	System.out.println("xÁÂÇ¥:"+this.p.x+"yÁÂÇ¥:"+this.p.y);
    	
    }
    
    abstract double calcArea();
    
    
    
    
	
	
}
