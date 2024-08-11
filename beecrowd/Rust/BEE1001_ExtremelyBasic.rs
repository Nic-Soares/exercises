/*
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.
Input

The input file will contain 2 integer numbers.
Output

Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all.
 */

use std::io;

fn main() {
    let mut input_a = String::new();
    let mut input_b = String::new();

    // Read the values of A and B from the user
    io::stdin().read_line(&mut input_a).expect("Failed to read input");
    io::stdin().read_line(&mut input_b).expect("Failed to read input");

    // Parse the inputs as integers
    let a: i32 = input_a.trim().parse().expect("Failed to parse input");
    let b: i32 = input_b.trim().parse().expect("Failed to parse input");

    // Calculate the sum
    let x = a + b;

    // Print the result
    println!("X = {}", x);
}
