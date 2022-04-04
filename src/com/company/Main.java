package com.company;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.util.*;

public class Main {

    public static String reverseStringByPreservingNonAlphabetCharacters(String input) {
        // Initialize left and right pointers
        char[] str = input.toCharArray();
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        return String.valueOf(str);
    }

    private static void printNumberPattern(int numOfRows) {

        for(int i = 1; i<=numOfRows ; i++) {
            for(int j = 1 ; j <=i ;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void fibbonacci(int num) {
        //0,1,1,2,3,5,8
        int a = 0;
        int b =1;
      //  int temp =0;
        int count =0;
        System.out.print(a+" "+b+" ");
        while(count != (num-2)) {
            int sum = a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
            count++;

        }
    }

    private static void reverseString(String  string) {
        char[] charArray = string.toCharArray();
        for(int i = charArray.length-1; i>=0;i--) {
            System.out.print(charArray[i]);
        }
    }

    private static void reverseSentence(String sentence) {
        String[] stringArray = sentence.split(" ");
        for(int i = stringArray.length-1; i>=0;i--) {
            System.out.print(stringArray[i]+" ");
            //reverseString(stringArray[i]+" ");
        }
    }

    private static void reverseStringUsingBuffer(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.print("\n"+stringBuilder.reverse());
    }

    private static void commonElementsInArrayUsingCollectionsAndSet(Integer[] intArray)  {
        Integer[] integers = intArray;
        Set<Integer> intSet = new HashSet<>();
        Set<Integer> commonElementsList = new HashSet<>();
        for (int i = 0; i < intArray.length; i++) {

            if(intSet.add(integers[i])) {

            }else {
                commonElementsList.add(integers[i]);
            }
        }
        List<Integer> list = new ArrayList<>(intSet);
        System.out.println("Unique elements before sort: "+list);
        Collections.sort(list);
        System.out.println("Unique elements after sort: "+list);
        System.out.println("Common Elemets are: "+commonElementsList);
    }

    private static void repeatingElementsInArray(Integer[] array) {
        Integer[] intArray = array;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ;i<intArray.length;i++) {
            int count =1;
            if(!list.contains(intArray[i])) {
                list.add(intArray[i]);
                for(int j=i+1;j<intArray.length;j++) {
                    if(intArray[j] == intArray[i]) {
                        count++	;
                    }

                }
                System.out.println(intArray[i]+" is repeated "+count+" times");
            }
        }
    }

    private static void printCommonCharactersInStringRudderStackQuestion(String s) {
        String removedSpacedAndLowerCseString = s.replace(" ","").toLowerCase();
        // System.out.println(removedSpacedAndLowerCseString);
        char[] c = removedSpacedAndLowerCseString.toCharArray();
        int count = 1;
        List<Character> list = new ArrayList<>();
        for (int i=0; i<c.length;i++){
            if(!list.contains(c[i])){
                list.add(c[i]);
                for (int j = i+1; j < c.length;j++ ){
                    if (c[i] == c[j]){
                        count++;
                    }
                }
                System.out.println("Character "+ "'"+c[i]+"'"+" is repeated "+count+" times");
                count =1;
            }

        }
    }

    public static void commonElementsInStringAndPrintMaximumOccuredCharacterAskedInGTENTechnologies(String string){
        char[] c = string.replace(" ","").toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        Map<Integer,Character> map = new HashMap<>();
        int count =1;
        for (int i =0; i<c.length;i++){
            if (!list.contains(c[i])){
                list.add(c[i]);
                for(int j=i+1;j<c.length;j++){
                    if (c[i] == c[j]){
                        count++;
                    }
                }
                map.put(count,c[i]);
                System.out.println(c[i]+" repeating "+count+" times");
                count =1;
            }
        }
        int maxvalue =0;
        for (Map.Entry<Integer,Character> entry:map.entrySet()){
            if(entry.getKey()>maxvalue){
                maxvalue = entry.getKey();
            }
        }
        System.out.println("*****************************************************");
        System.out.println(map.get(maxvalue)+" is repeated max no. of times"+" i.e, "+maxvalue);
    }

    private static  boolean isNumberArmstrong(int number){
        int temp, cube, isArmstrong;
        int sum = 0;
        isArmstrong = number;
        while (number != 0){
           temp = isArmstrong%10;
           cube = temp*temp*temp;
           sum = sum + cube;
            isArmstrong = isArmstrong/10;
        }
        if (sum == number){
            return true;
        }else {
            return false;
        }
    }

    private static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a= a-b;
        // OR
//        a = a*b;
//        b = a/b;
//        a = a/b;
        System.out.println("a is "+a+" b is "+b);
    }

    private static void randomNumberGeneratorUsingMathClass(){

       for (int i = 0;i<= 1000; i++){
           double d = Math.random()*25;
           int integer = (int)d;
           System.out.println(integer);
       }

    }

    private static  void  randomNumberGeneratorUsingRandomClass(){

        Random random = new Random();
        for (int i = 0; i <= 100; i++){
            System.out.println( random.nextInt(100));// will generate random numbers b/w 0 and 99
        }
        System.out.println("***************************************************");
        for (int i = 0; i <= 100; i++){
            System.out.println( random.nextDouble());// will generate random numbers b/w 0 and 1.0
        }

    }

    private static  void randomNumberGeneratorUsingApacheCommonLibray(){
        // We have added external jars (apache commons lang) to use RandomStringUtils class
        System.out.println( RandomStringUtils.randomNumeric(5));// will generate 5 digit random number
        System.out.println(RandomStringUtils.randomAlphabetic(6));//will generate 5 digit random alpahbetic
    }

    private static  void isStringContainsCommonLetters(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        char[] s1 = scanner.nextLine().toLowerCase().toCharArray();
        char[] s2 = scanner.nextLine().toLowerCase().toCharArray();
        for (int i =0 ; i < s1.length ; i++){
            for (int j = 0; j< s2.length; j++){
                if(s1[i] == s2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                System.out.println("Strings contains common letters");
                break;
            }
        }
        if (flag == false){
            System.out.println("No Common elements in the string");
        }
    }

    private static  void bubbleSort(int[] array){
        System.out.println("Array before sorting: "+Arrays.toString(array));
        for (int i =0 ; i< array.length-1;i++){
            for (int j = 0; j< array.length-1;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: "+Arrays.toString(array));
    }

    private static void removeJunkFromString(String string){
        string = string.replaceAll("[^A-Za-z]","");
        System.out.println(string);
    }

    private static void removeWhiteSpacesFromString(String s){
        System.out.println(s.replace(" ",""));
    }

    private static void readingDataFromFileUsingFileReader() throws IOException {
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\Sample.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;

        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }

    }

    private static void readingDataFromFileUsingScanner() throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir")+"\\Sample.txt");
        Scanner scanner = new Scanner(file); // this scanner obj is created by passing different argument to constructor


        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    private static void  arrangOddFirstAndEvenLastGTENT(int[] array){

        List<Integer> oddEle = new ArrayList<>();
        List<Integer> evenEle = new ArrayList<>();
        for (int i = 0; i<array.length;i++){
            if (array[i] % 2 !=0){
                oddEle.add(array[i]);
            }else {
                evenEle.add(array[i]);
            }
        }

        oddEle.addAll(evenEle);
        System.out.println(oddEle);
    }

    private static void maximumOccuringCharaterInString(String string) {
        char[] c = string.toLowerCase().replaceFirst(" ", "").toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : c) {
            int count =1;
            if(!map.containsKey(ch)) {
                map.put(ch, count);
            }else {
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);
        int maxCount=0;
        char maxOccuredCharacter = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            if(entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                maxOccuredCharacter = entry.getKey();
            }

        }

        System.out.println(maxOccuredCharacter+" is occured maximum number of times");
    }

    private static void commonElementsInStringUsingMap(String string){
        char[] chars = string.replaceAll("\\s","").toLowerCase().toCharArray();
        Map<Character,Integer>  map = new HashMap<>();
        for (char c : chars){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" is repeated "+entry.getValue()+" times");
        }

    }

    public static void randomFourDigitString(){
        Random random = new Random();
        for (int i = 0 ; i <= 100000; i++){
            String id = String.format("%04d", random.nextInt(10000));
            String contactNumber = "441987-".concat(id);
            System.out.println("Contact number is "+contactNumber);
            System.out.println("Last four digit is "+contactNumber.substring(contactNumber.length()-4));

        }

    }
    public  static  void  stringConcatenation(){
        String s1= "412987";
        Random random = new Random();
        //String s2 = String.format("%04d",random.nextInt(10000));
        for (int i = 0 ; i<100000 ; i++){
            String s2 = Integer.toString(random.nextInt(10000));System.out.println(s2);

        }

       // s1 = s1+s2;

    }

    public static void countNumberOfTimesOneIsRepeatedBetween1To9999(){
        int temp, count =1;
        for (int i = 10; i<=100;i++){
            int temp2 = i;
            while (temp2>0){
                temp = temp2%10;
                if (temp == 1){
                    count++;
                }
                temp2 = temp2 /10;
            }
        }
        System.out.println("One is repeated "+count+" times");
    }

    public static String printDays_TIAAInterviewQuestion(int num){
        if(num>=1){
            int temp = num%7;
            // System.out.println(temp);
            switch (temp){
                case 1:return "Monday";
                case 2:return "Tuesday";
                case 3:return "Wednesday";
                case 4:return "Thursday";
                case 5:return "Friday";
                case 6:return "Saturday";
                case 0:return "Sunday";
            }
        }else {
            return "Invalid Number";
        }

        return null;
    }


    public static void main(String[] args) throws IOException {

        for (int i = 1; i<=999;i++){
            System.out.println(printDays_TIAAInterviewQuestion(i));
        }

       // countNumberOfTimesOneIsRepeatedBetween1To9999();
     ///  stringConcatenation();
        // randomFourDigitString();
        //		System.out.println("Enter the number of rows you want ");
//		int numOfRows = Integer.parseInt(scanner.nextLine());
//		printNumberPattern(numOfRows);


//		System.out.println("How many numbers do you want in fibbonacci sequence ?");
//		int num = Integer.parseInt(scanner.nextLine());
//		fibbonacci(num);

//		reverseString("apple");
//		reverseStringUsingBuffer("orange");

        ///reverseSentence("My first job interview");
       /// Integer[] array = {1,2,3,1,6,9,89,3,3,1};
        //commonElementsInArrayUsingCollectionsAndSet(array);
        //repeatingElementsInArray(array);

      //  System.out.println(isNumberArmstrong(153));
       // swap(12,20);
        //randomNumberGeneratorUsingMathClass();
        //randomNumberGeneratorUsingRandomClass();
       // isStringContainsCommonLetters();
       // randomNumberGeneratorUsingApacheCommonLibray();
      //  bubbleSort(new int[]{8,2,4,1});
      //  removeJunkFromString("hdhhdshgh454*********&&&&&&T^%$^%%%&^%%%^%^6464$%^$%^$%%&^%&^%^%^%&^%VHJGJGJHGHJGHJG");
      //  removeWhiteSpacesFromString("My name is    Mohammed Kamle");
        //readingDataFromFileUsingFileReader();
        //readingDataFromFileUsingScanner();
       // commonElementsInStringAndPrintMaximumOccuredCharacterAskedInGTENTechnologies("Mohammed Kamhhhhhle");
      //  arrangOddFirstAndEvenLastGTENT(new int[]{2,8,16,5,14,7,97,99});
        //maximumOccuringCharaterInString("Azim Kamlxxxxxxxxxxxxe");
       // commonElementsInStringUsingMap("Mohammed Kamle Mohtassim");

        // To open notepad
       /* Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }
        catch (IOException e){
            System.out.println(e);
        }*/
    }

}
