function fizBuzz(a, i) {
    for (i = 1; i < 101; i++) {
        if (i % a === 0) {
            console.log("fiz");
        } else {
            console.log(i);
        }
    }
}

fizBuzz(10);