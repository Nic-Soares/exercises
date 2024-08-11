/*
Read two integer values, in this case, the variables A and B. After this, calculate the sum between them and assign it to the variable SOMA. Write the value of this variable.

Input
The input file contains 2 integer numbers.

Output
Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B. Like all the problems, don't forget to print the end of line, otherwise you will receive "Presentation Error"
 */

 use std::io;

 fn main() {
    let mut input_a = String::new();
    let mut input_b = String::new();

    io::stdin().read_line(&mut input_a).expect("Failed to read input");
    io::stdin().read_line(&mut input_b).expect("Failed to read input");

    let a: i32 = input_a.trim().parse().expect("Failed to parse input");
    let b: i32 = input_b.trim().parse().expect("Failed to parse input");

    let x = a + b;

    println!("SOMA = {}", x);
 }