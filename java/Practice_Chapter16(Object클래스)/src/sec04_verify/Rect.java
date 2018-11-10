package sec04_verify;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;	
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
    /*	
    public boolean equals(Rect r) {
		if(width*height==r.width*r.height) {
			return true;
		}else {
			return false;
		}
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		Rect pp=(Rect)obj;
		if(width*height==pp.width*pp.height) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public String toString(){
		return "Rect num1의 필드 값  : x :"+this.width+"이며, y : "+this.height+"이다.";
	}
}
