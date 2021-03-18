package exercise7;

//This class is to convert weight based on mars gravity
public class WeightConverter {

	//Weight on Mars= (Weight on Earth/9.81m/s2) * 3.711m/s2
	double getWeightOnMars(double weight){
		return (weight/9.81)*3.711;
	}
}