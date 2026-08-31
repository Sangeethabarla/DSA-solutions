# FYISUJ10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Temperature Sensor Readings

Temperature sensors measure and store readings using the `byte` data type, which is ideal for small integer values. In this task, you will declare two variables to store temperature readings from a hot and cold region, ensuring they remain within the valid byte range (-128 to 127).

 **Steps of Complete** 

- Declare a variable named hotRegionTemp and assign a positive temperature 45.
- Declare another variable named coldRegionTemp and assign a negative temperature -20.
- Print both temperature readings to verify they are stored correctly.

Run your code to see the correct output. Click "Submit" when you're ready!

 **Expected Output** 

```
Hot Region Temperature: 45  
Cold Region Temperature: -20  

```

Feel free to modify the temperatures to explore different sensor readings!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T16:44:59.690Z  

```java
class Codechef {
    public static void main(String[] args) {
        //  Declare and assign temperature readings
        int hotRegionTemp=45;
        int coldRegionTemp=-20;



        //  Print the temperature readings
        System.out.println("Hot Region Temperature:"+hotRegionTemp+"\n"+"Cold Region Temperature:"+coldRegionTemp );


    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FYISUJ10)