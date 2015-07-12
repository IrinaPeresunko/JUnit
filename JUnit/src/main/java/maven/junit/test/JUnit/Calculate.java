package maven.junit.test.JUnit;

public class Calculate {
	
//	public Calculate(int leftOperand,int rightOperand){
//		this.leftOperand = leftOperand;
//		this.rightOperand = rightOperand;
//	}
	public int multiplyOperands(int leftOperand,int rightOperand){
		return leftOperand*rightOperand;
	}
	public int sumOperands(int leftOperand,int rightOperand){
		return leftOperand+rightOperand;
	}
	public double divideOperands(int leftOperand,int rightOperand){
		return leftOperand/rightOperand;
	}
	public boolean ifOperandsIsEquals(int leftOperand,int rightOperand){
		return leftOperand==rightOperand;
	}
}
