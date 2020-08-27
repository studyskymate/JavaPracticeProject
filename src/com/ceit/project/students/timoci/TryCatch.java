package com.ceit.project.students.timoci;

public class TryCatch {

	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 0;
		int result;
		try {
			String str = null;
			str.trim();
			
			result = number1 / number2;
		}
		catch (NullPointerException ex) {
			System.out.println("Error Occured Null :  "+ ex);
		}
		catch (Exception ex) {
			System.out.println("Error Occured:  "+ ex);
		}finally {
			System.out.println("I will Execute every time");
		}
		
		//=============================================
		try {

			result = number1 / number2;
		}
		catch (NullPointerException ex) {
			System.out.println("Error Occured Null :  "+ ex);
		}
		catch (Exception ex) {
			System.out.println("Error Occured:  "+ ex);
		}finally {
			System.out.println("I will Execute every time");
		}
		
		try {
			 validate(15);
			}catch(Exception ex) {
				System.out.println("Exceptin : " +ex);
			}
		}
	

		public static boolean validate(int age) {
			if(age>20)
				throw new ArithmeticException("AGe Greater than 20");
			return true;
	}
}