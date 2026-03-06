package numberProfile;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Utilities {
    public void getProfile(int number){
        displayFactors(getFactors(number));
        if(isEven(number)) print("Is an Even Number");
        if(isOdd(number)) print("Is an Odd Number");
        if(isPerfect(number)) print("Is a Perfect Number");
        if(isNiven(number)) print("Is a Niven Number");
        if(isArmstrong(number)) print("Is an Armstrong Number");
        if(isPrime(number)) print("Is a Prime Number");
        if(isStrong(number)) print("Is a Strong Number");
        if(isPerfectSquare(number)) print("Is a Perfect Square");
        if(isPerfectCube(number)) print("Is a Perfect Cube");
        if(isPalindrome(number)) print("It is a Palindrome");
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public boolean isOdd(int number){
        return number % 2 != 0;
    }

    public boolean isPrime(int number){
        int counter = 0;
        for(int count = 1; count <= number; count++){
            if(number % count == 0) counter++;
        }
        return counter == 2;
    }

    public ArrayList<Integer> getFactors(int number){
        ArrayList<Integer> factors = new ArrayList<>();
        for(int count = 1; count < number; count++){
            if(number % count == 0) factors.add(count);
        }
        return factors;
    }

    public boolean isPerfect(int number){
        ArrayList<Integer> factors = getFactors(number);
        int total = 0;
        for(int factor : factors){
            total += factor;
        }
        return number == total;
    }

    public boolean isPerfectSquare(int number){
        for(int count = 1; count < number; count++){
            if(number == (count * count)) return true;
        }
        return false;
    }

    public boolean isPalindrome(int number){
        String newNumber = "" + number;
        int backIndex = newNumber.length() - 1;
        for(int count = 0; count < newNumber.length(); count++){
            if(newNumber.charAt(count) == newNumber.charAt(backIndex)) backIndex--;
            else return false;
        }
        return true;
    }

    public boolean isArmstrong(int number){
        String newNumber = "" + number;
        int power = newNumber.length();
        int initialNumber = number;
        int result = 0;
        char[] num = newNumber.toCharArray();

        for(int count = 0; count < power; count++){
            int digit = parseInt(String.valueOf(num[count]));
            result += (int) Math.pow(digit,power);
        }
        return initialNumber == result;
    }

    public boolean isStrong(int number){
        String newNumber = "" + number;
        char[] num = newNumber.toCharArray();
        int result = 0;
        for(int count = 0; count < newNumber.length(); count++){
            int digit = parseInt(String.valueOf(num[count]));
            result += getFactorial(digit);
        }
        return number == result;
    }

    public int getFactorial(int number){
        int result = 1;
        for(int index = number; index > 0; index--){
            result *= index;
        }
        return result;
    }

    public boolean isNiven(int number){
        String newNumber = "" + number;
        char[] num = newNumber.toCharArray();
        int result = 0;
        for(int count = 0; count < newNumber.length(); count++){
            int digit = parseInt(String.valueOf(num[count]));
            result += digit;
        }
        return number % result == 0;
    }

    public boolean isPerfectCube(int number){
        for(int count = 1; count < number; count++){
            if(number == (count * count * count)) return true;
        }
        return false;
    }

    private void print(String message){
        System.out.println(message);
    }

    private void displayFactors(ArrayList<Integer> factors){
        print("The Factors are: ");
        for(int number: factors){
            System.out.print(number + " ");
        }
        print("");
    }
}
