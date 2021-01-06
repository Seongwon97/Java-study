package myPackage;

public class TemperatureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature a = new Temperature(0.0, 'C');
		Temperature b = new Temperature(32.0);
		Temperature temp = new Temperature();
		b.setScale('F');
		if(a.getScale()==b.getScale()) {
			if(a.equal(b.getDegree()))
				System.out.println("Equal");
			else if(a.greater(b.getDegree()))
				System.out.println("Greater");
			else if(a.less(b.getDegree()))
				System.out.println("Less");			
		}
		else if(a.getScale()=='C') {
			a.toFahrenheit();
			if(a.equal(b.getDegree()))
				System.out.println("Equal");
			else if(a.greater(b.getDegree()))
				System.out.println("Greater");
			else if(a.less(b.getDegree()))
				System.out.println("Less");		
		}
		else if(a.getScale()=='F') {
			a.toCelsius();
			if(a.equal(b.getDegree()))
				System.out.println("Equal");
			else if(a.greater(b.getDegree()))
				System.out.println("Greater");
			else if(a.less(b.getDegree()))
				System.out.println("Less");		
		}
		
		Temperature c = new Temperature();
		Temperature d = new Temperature('F');
		c.setBoth(-40, 'C');	
		d.setDegree(-40);
		if(c.getScale() == d.getScale()) {
			if(c.equal(d.getDegree()))
				System.out.println("Equal");
			else if(c.greater(d.getDegree()))
				System.out.println("Greater");
			else if(c.less(d.getDegree()))
				System.out.println("Less");			
		}
		else if(c.getScale()=='F') {
			c.toCelsius();
			if(c.equal(d.getDegree()))
				System.out.println("Equal");
			else if(c.greater(d.getDegree()))
				System.out.println("Greater");
			else if(c.less(d.getDegree()))
				System.out.println("Less");		
		}
		else if(c.getScale()=='C') {
			c.toFahrenheit();
			if(c.equal(d.getDegree()))
				System.out.println("Equal");
			else if(c.greater(d.getDegree()))
				System.out.println("Greater");
			else if(c.less(d.getDegree()))
				System.out.println("Less");		
		}
		
		Temperature e = new Temperature(100.0 ,'C');
		Temperature f = new Temperature(212.0 ,'F');
		if(e.getScale()==f.getScale()) {
			if(e.equal(f.getDegree()))
				System.out.println("Equal");
			else if(e.greater(f.getDegree()))
				System.out.println("Greater");
			else if(e.less(f.getDegree()))
				System.out.println("Less");			
		}
		else if(e.getScale()=='F') {
			e.toCelsius();
			if(e.equal(f.getDegree()))
				System.out.println("Equal");
			else if(e.greater(f.getDegree()))
				System.out.println("Greater");
			else if(e.less(f.getDegree()))
				System.out.println("Less");		
		}
		else if(e.getScale()=='C') {
			e.toFahrenheit();
			if(e.equal(f.getDegree()))
				System.out.println("Equal");
			else if(e.greater(f.getDegree()))
				System.out.println("Greater");
			else if(e.less(f.getDegree()))
				System.out.println("Less");		
		}
	}

}
