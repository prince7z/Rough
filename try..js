function sort(arr) {
    for( let j=0; j<arr.length-1; j++){
        for (let i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                let t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
    }
    
    return arr;
}

// main function (in JS, directly writing)
console.log("hell");

let arr = [3, 5, 1, 9, 5, 0];

console.log(sort(arr));
