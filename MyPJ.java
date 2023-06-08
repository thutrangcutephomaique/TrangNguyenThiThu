public class Project{

	/**
 	* Retrieves the average value from a list of numbers.
 	*
 	* @param numbers The list of numbers to calculate the average from.
 	* @return The average value of the numbers.
 	* @throws IllegalArgumentException if the list of numbers is null or empty.
	*/
	public double calculateAverage(List<Double> numbers) {
   		if (numbers == null || numbers.isEmpty()) {
        		throw new IllegalArgumentException("List of numbers cannot be null or empty");
    		}

    		double sum = 0;
    		for (double number : numbers) {
        		sum += number;
    		}

    		return sum / numbers.size();
	}

}