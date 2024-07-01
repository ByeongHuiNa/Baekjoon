let fs = require("fs");
let filePath = process.platform === "linux" ? "/dev/stdin" : "test.txt";

let input = fs.readFileSync(filePath).toString().trim().split("");
let croatian = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];
let count = 0;

while (true) {
  if (croatian.includes(input.slice(0, 3).join(""))) {
    input.splice(0, 3);
    count++;
  } else if (croatian.includes(input.slice(0, 2).join(""))) {
    input.splice(0, 2);
    count++;
  } else {
    input.splice(0, 1);
    count++;
  }
  if (input.length === 0) {
    console.log(count);
    break;
  }
}