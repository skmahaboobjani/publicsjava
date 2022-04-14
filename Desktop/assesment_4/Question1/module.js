const fs = require('fs');

fs.readFile('./mabu.txt', "utf-8", (err, data) => {

    if (err) {
        throw err;
    }
    console.log(data);
});