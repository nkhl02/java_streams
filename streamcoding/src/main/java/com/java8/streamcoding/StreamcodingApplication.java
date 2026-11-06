package com.java8.streamcoding;

import com.java8.streamcoding.allmatch.CheckIfAllNumbersArePositive;
import com.java8.streamcoding.anymatch.AnyNumberIsDivisibleByThree;
import com.java8.streamcoding.distinct.FindAllTheDisctinctElements;
import com.java8.streamcoding.flatmap.FlatenListOfList;
import com.java8.streamcoding.groupingby.*;
import com.java8.streamcoding.partitioningby.SeperateEvenAndOdd;
import com.java8.streamcoding.primitivemathoperations.FindAverageOfNumbers;
import com.java8.streamcoding.reduce.FindMaxNumberReduce;
import com.java8.streamcoding.reduce.ProductOfAllNumbers;
import com.java8.streamcoding.reduce.SumOfEvenNumbers;
import com.java8.streamcoding.reduce.SumOfSquareOfEvenNumbers;
import com.java8.streamcoding.sorted.FindMaxNumber;
import com.java8.streamcoding.sorted.SortInAscendingOrder;
import com.java8.streamcoding.sorted.SortInDescendingOrder;
import com.java8.streamcoding.string.CountHowManyStringsStartsWith;
import com.java8.streamcoding.string.FindFirstNonEmptyElement;
import com.java8.streamcoding.string.JoinAllStringIntoCommaSeperatedString;
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

        FindAllTheDisctinctElements findAllTheDisctinctElements = new FindAllTheDisctinctElements();
        findAllTheDisctinctElements.findDistinctUsingSet();
        findAllTheDisctinctElements.findDistinct();

        FindAverageOfNumbers findAverageOfNumbers = new FindAverageOfNumbers();
        findAverageOfNumbers.findAverageOfNumbers();

        SortInAscendingOrder sortInAscendingOrder = new SortInAscendingOrder();
        sortInAscendingOrder.sortAscending();

        SortInDescendingOrder sortInDescendingOrder = new SortInDescendingOrder();
        sortInDescendingOrder.sortDescending();

        CountHowManyStringsStartsWith countHowManyStringsStartsWith = new CountHowManyStringsStartsWith();
        countHowManyStringsStartsWith.countStringsStartingWith();

        JoinAllStringIntoCommaSeperatedString joinAllStringIntoCommaSeperatedString = new JoinAllStringIntoCommaSeperatedString();
        joinAllStringIntoCommaSeperatedString.joinCommaSeperated();

        CheckIfAllNumbersArePositive checkIfAllNumbersArePositive = new CheckIfAllNumbersArePositive();
        checkIfAllNumbersArePositive.checkAllNumbersPositive();

        AnyNumberIsDivisibleByThree anyNumberIsDivisibleByThree = new AnyNumberIsDivisibleByThree();
        anyNumberIsDivisibleByThree.anyNumberDivisibleByThree();

        FlatenListOfList flatenListOfList = new FlatenListOfList();
        flatenListOfList.flattenList();

        FindFirstNonEmptyElement findFirstNonEmptyElement = new FindFirstNonEmptyElement();
        findFirstNonEmptyElement.findFirstNonEmpty();

        FindSecondHighestNumber findSecondHighestNumber = new FindSecondHighestNumber();
        findSecondHighestNumber.findSecondHighest();

        SortEmployeeBySallary sortEmployeeBySallary = new SortEmployeeBySallary();
        sortEmployeeBySallary.sortBySallary();

        CalculateAverageAge calculateAverageAge = new CalculateAverageAge();
        calculateAverageAge.calculateAverageAge();

        SeperateEvenAndOdd seperateEvenAndOdd = new SeperateEvenAndOdd();
        seperateEvenAndOdd.seperateOddAndEven();

        GroupWordsByLength groupWordsByLength = new GroupWordsByLength();
        groupWordsByLength.groupWordsByLength();

        CountOccurenceOfEachElement countOccurenceOfEachElement = new CountOccurenceOfEachElement();
        countOccurenceOfEachElement.getOccurenceOfEachElement();

        GroupEmpByDeptAndCalculateAvgSalary groupEmpByDeptAndCalculateAvgSalary = new GroupEmpByDeptAndCalculateAvgSalary();
        groupEmpByDeptAndCalculateAvgSalary.groupEmpByDeptAndCalAvgSalary();

        FindHighestPaidEmployeeInEachDept findHighestPaidEmployeeInEachDept = new FindHighestPaidEmployeeInEachDept();
        findHighestPaidEmployeeInEachDept.findHighestPaidEmpInEachDept();

        FindDeptMoreThanTwoEmployee findDeptMoreThanTwoEmployee = new FindDeptMoreThanTwoEmployee();
        findDeptMoreThanTwoEmployee.findDeptMoreThanTwoEmp();

        FindDeptWithHighestAvgSallary findDeptWithHighestAvgSallary = new FindDeptWithHighestAvgSallary();
        findDeptWithHighestAvgSallary.findDeptWithHighestAvgSallary();

        FindMostFrequentCharInString findMostFrequentCharInString = new FindMostFrequentCharInString();
        findMostFrequentCharInString.findMostFrequentChar();

        FirstNonRepeatingCharacterInString firstNonRepeatingCharacterInString = new FirstNonRepeatingCharacterInString();
        firstNonRepeatingCharacterInString.findFirstNonRepeatingChar();
    }

}
