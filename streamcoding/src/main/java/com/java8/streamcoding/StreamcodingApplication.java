package com.java8.streamcoding;

import com.java8.streamcoding.reduce.FindMaxNumberReduce;
import com.java8.streamcoding.reduce.ProductOfAllNumbers;
import com.java8.streamcoding.reduce.SumOfEvenNumbers;
import com.java8.streamcoding.reduce.SumOfSquareOfEvenNumbers;
import com.java8.streamcoding.sorted.FindMaxNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamcodingApplication {



	public static void main(String[] args) {
		SpringApplication.run(StreamcodingApplication.class, args);


        HowCreateStreams howCreateStreams = new HowCreateStreams();
        howCreateStreams.createStreams();

        FilterEvenNumbers filterEvenNumbers = new FilterEvenNumbers();
        filterEvenNumbers.filterEvenNumbers();

        ConvertNumberToSquares convertNumberToSquares = new ConvertNumberToSquares();
        convertNumberToSquares.printSquare();

        SquareEvenNumbers squareEvenNumbers = new SquareEvenNumbers();
        squareEvenNumbers.squareEvenNumbers();

        FindFirstNumberGreaterThan findFirstNumberGreaterThan= new FindFirstNumberGreaterThan();
        findFirstNumberGreaterThan.findFirstNumberGreaterThan();

        CountGreaterThan countGreaterThan = new CountGreaterThan();
        countGreaterThan.countGreaterThan();

        ProductOfAllNumbers productOfAllNumbers = new ProductOfAllNumbers();
        productOfAllNumbers.productOfAllNumbers();
        productOfAllNumbers.productOfAllNumbers2();

        SumOfEvenNumbers sum = new SumOfEvenNumbers();
        sum.sumOfEvenNumbers();

        FindMaxNumber findMaxNumber = new FindMaxNumber();
        findMaxNumber.findMaxNumber();

        FindMaxNumberReduce findMaxNumberReduce = new FindMaxNumberReduce();
        findMaxNumberReduce.findMaxNumberByReduce();

        SumOfSquareOfEvenNumbers sumOfSquareOfEvenNumbers = new SumOfSquareOfEvenNumbers();
        sumOfSquareOfEvenNumbers.sumOfSquareOfEvenNumbers();
	}

}
