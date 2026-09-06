# TONKSS10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distance & Travel Status Tracker

A transportation department monitors city-to-city distances and journey status.
Use  **`long`**  for distance and observe Java's  **implicit conversion**  to  **`double`**  for precision.
Additionally, a  **`boolean`**  variable tracks whether the journey is active (`true`) or completed (`false`).

 **Expected Output:** 
If stored and printed correctly, your output should look something like:

```
Distance in Long: 450 km  
Converted Distance in Double: 450.0 km  
Is Journey Active: true  

```

Run the code, modify values, and explore different city distances and journey statuses!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:36:22.123Z  

```java
class Codechef {
    public static void main (String[] args) {
        // Declare and assign city distance in long
        long cityDistance = 450L;
        
        // Implicit conversion to double
        double convertedDistance = cityDistance;
        
        // Declare and assign journey status
        boolean isJourneyActive = true;
        
        // Print all values
        System.out.println("Distance in Long: " + cityDistance + " km");
        System.out.println("Converted Distance in Double: " + convertedDistance + " km");
        System.out.println("Is Journey Active: " + isJourneyActive);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS10)