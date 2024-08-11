/*
 Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.
 */

 use std::io;

 fn main() {
    let mut input_a = String::new();
    let mut input_b = String::new();

    io::stdin().read_line(&mut input_a).expect("Failed to read input");
    io::stdin().read_line(&mut input_b).expect("Failed to read input");

    let a: i32 = input_a.trim().parse().expect("Failed to parse input");
    let b: i32 = input_b.trim().parse().expect("Failed to parse input");

    let x = a * b;

    println!("PROD = {}", x);
 }