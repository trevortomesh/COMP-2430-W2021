/* Comments work like you would expect...
 * this is a simple multi-line comment
 *
 */

// single line comments too!

val PI = 3.14; // this is a val -- we can't change this later! 'Float' is inferred
var x = 0; // this is a var -- we CAN change this later! 'Int' is inferred!


fun main() {
    /*
    println("Hello, world!!!");
    
    val a: Int = 1; //immediate assignment with a declared type
    val b = 2; // Int is inferred!
    
    val c: Int; // val without a initialization (undeclared) -- type is needed if not declaring
    c = 3; 
    
 	val thinga: Int = 10000;
    val thingd: Double = 100.00;
    val thingf: Float = 100.00f;
    val thingl: Long = 100000004;
    val things: Short = 10;
    val thingb: Byte = 1;
    
    println("Your Int Value is "+thinga);
    println("Your Double Value is "+thingd);
    println("Your Float Value is "+thingf);
   	println("Your Long Value is "+thingl);
   	println("Your Short Value is "+things);
   	println("Your Byte Value is "+thingb);
    
    //we can easilly cast a value as a string like this...
    
    println("This works, too:"+"$thinga");
    
    /* Let's do some char stuff!*/
    
    val charthing: Char; // defining a value
    charthing = 'A';
    println("$charthing");
    println(charthing);
    
    
    var boolthing: Boolean; 
    boolthing = true;
    println("Your character value is "+"$boolthing");
    
    
    /* String time! Oh yeah, baby! */
    
    var rawString: String = "Yo! I am a raw string!";
    println("Hello!"+rawString);
    
    
    val escapedString: String = "I am an escaped string! Can't catch me, coppers!\n";
    
    /*
	\t - Inserts tab
	\b - Inserts backspace
	\n - Inserts newline
	\r - Inserts carriage return
	\' - Inserts single quote character
	\" - Inserts double quote character
	\\ - Inserts backslash
	\$ - Inserts dollar character
	*/
    
    print(escapedString);
    print("Look, ma! New line!");
    println("OopS!");
    
    // String templates are really freakin' rad!
	
    var foo = 1;
    
    //simple string template
    val s1 = "foo is $foo";
    println(s1);
    
    foo = 2; 
    val s2 = "${s1.replace("is","was")}, but now is $foo";
    println(s2);
    
    println(rawString[0]);
    //rawString[0] = "J";
    
    rawString = "Jo! I am a raw string!";
    println(rawString);
    
    */
    
    /* Let's talk about collections... */
    /*
    val numbers = mutableListOf("une", "deux", "trois");
    println(numbers);
    numbers.add("five");
    println(numbers);
    
    //numbers = mutableListOf("one", "two", "three"); <- Can't do this! Is val not var!
    
	val numbersList = listOf("one", "two", "three", "four");
    println("Number of elements: ${numbersList.size}");
    println("Third Element is: ${numbersList.get(2)}");
    println("Fourth element is: ${numbersList[3]}");
    println("Index of element two is ${numbersList.indexOf("two")}");
    
    val people = listOf("Suraj", "Johnathan", "tyler", "tyler");
    val people2 = listOf("Suraj", "tyler", "Johnathan", "tyler");
    
    println(people == people2);
    
    
    /*mutable lists are cooler than immutable lists, tho!*/
    
    val moreNumbers = mutableListOf(1,2,3,4);
    
    moreNumbers.add(5);
    moreNumbers.removeAt(1);
    moreNumbers[0] = 0;
    moreNumbers.shuffle();
    println(moreNumbers);
    
    */
    
    
   /* Fun and games with sets!*/
    
    val numberSet = setOf(1,2,3,4);
    
    println("Number of elements: ${numberSet.size}");
    val numbersBackwards = setOf(4,3,2,1);
    println("The sets are equal: ${numberSet == numbersBackwards}");
    
    
    //maps are fun!
   
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4);
    
    
    println("all keys: ${numbersMap.keys}");
    println("all values: ${numbersMap.values}");
 
    if ("key2" in numbersMap) println("Value by key2: ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map!");
    if (numbersMap.containsValue(1)) println("The value 1 is in the map!");
    
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 4, "key3" to 3)
    
    println("The maps are equal: ${numbersMap == anotherMap}");
    
    val mnumbersMap = mutableMapOf("one" to 1, "two" to 2);
    mnumbersMap.put("three",3);
    mnumbersMap["one"] = 11;
    
    println(mnumbersMap);
    
    
    println(sum(1,2));
    printSum(2,3);
}


fun sum(a: Int, b: Int): Int{
    return a+b;
}


fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a+b}")
}



