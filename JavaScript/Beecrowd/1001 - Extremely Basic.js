var input = require('fs').readFileSync('stdin', 'utf8');

var [A, B] = input.split("\n").map(item => parseInt(item));

var sum = A + B

console.log("X = " + sum)
