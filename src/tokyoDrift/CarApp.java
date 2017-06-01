package tokyoDrift;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carA = new Car();
		Car carB = new Car(90, true, false, "Forest Green", "Buggati");
		//Car A Started or Stopped
		if(carA.hasStarted()==true){
			System.out.printf("The %s %s is starting!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s has stopped!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Started or Stopped
		if(carB.hasStarted()==true){
			System.out.printf("The %s %s is starting!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s has stopped!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		//Car A Accelerating of Decelerating
		if(carA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Accelerating of Decelerating
		if(carB.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		//Car A Speed		
		System.out.printf("The %s %s is going %smph!",carA.getColor(), carA.getModel(), carA.getSpeed());
		System.out.println();
		//Car B Speed
		System.out.printf("The %s %s is going %smph!",carB.getColor(), carB.getModel(), carB.getSpeed());
		System.out.println();
		carA.setSpeed(200);
		carB.setSpeed(250);
		carA.accelerate();
		carB.accelerate();
		if(carA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Accelerating of Decelerating
		if(carB.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carB.getColor(), carB.getModel());
			System.out.println();
		}
		System.out.printf("The %s %s is going %smph!",carA.getColor(), carA.getModel(), carA.getSpeed());
		System.out.println();
		//Car B Speed
		System.out.printf("The %s %s is going %smph!",carB.getColor(), carB.getModel(), carB.getSpeed());
		System.out.println();
	}

}
