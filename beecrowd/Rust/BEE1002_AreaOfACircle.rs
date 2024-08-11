/*
The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.
Input

The input contains a value of floating point (double precision), that is the variable R.
Output

Present the message "A=" followed by the value of the variable, as in the example bellow, with four places after the decimal point. Use all double precision variables. Like all the problems, don't forget to print the end of line after the result, otherwise you will receive "Presentation Error".
 */

 use std::io;

 fn main() {
     let mut input = String::new();
 
     // Read the radius from the user
     io::stdin().read_line(&mut input).expect("Failed to read input");
     
     // Parse the input as a floating-point number
     let radius: f64 = input.trim().parse().expect("Failed to parse input");
 
     // Calculate the area
     let pi = 3.14159;
     let area = pi * radius.powf(2.0);
 
     // Print the result with four decimal places
     println!("A={:.4}", area);
 }
 