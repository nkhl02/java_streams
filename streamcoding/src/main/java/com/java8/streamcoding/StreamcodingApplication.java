package com.java8.streamcoding;

import org.springframework.beans.factory.annotation.Autowired;
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
	}

}
