for (var i = 0; i <50; i+=10){
    console.log(i);
}
// ---------------------------------------------

let a = 10;
if (a === 10){
    console.log("Deu certo");
}
// ---------------------------------------------

let x = 5;
let y = x++ + ++x;
console.log("y= "+y);
x=3;
y=x*(x + 1)*x++;
x=5;
y=3;
y*= x+1;
console.log("x= "+x);
console.log("y= "+y);
// ---------------------------------------------

var z=0;
for (var i=20; i<50; i+=10){
    z+=i;
}
console.log(z);


function soma(a=1, b=3){
    return a+b;
}
console.log(soma());
console.log(soma(3));
console.log(soma(1,2));