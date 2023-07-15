package model;



public class AverageCalculator implements AverageDao  {

public int calculate(AverageBean averageBean) {
	int num1 = averageBean.getNumber1();
	int num2 = averageBean.getNumber2();
	return(num1+num2);
}

public int minus(AverageBean averageBean) {
	int num1 = averageBean.getNumber1();
	int num2 = averageBean.getNumber2();
	return(num1-num2);
}

public int multiply(AverageBean averageBean) {
	int num1 = averageBean.getNumber1();
	int num2 = averageBean.getNumber2();
	return(num1*num2);
}

public int divide(AverageBean averageBean) {
	int num1 = averageBean.getNumber1();
	int num2 = averageBean.getNumber2();
	return(num1/num2);
}
}
