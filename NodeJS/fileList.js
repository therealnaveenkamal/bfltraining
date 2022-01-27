const fs = require('fs')
const path = require('path')
fp = path.join(__dirname,".")

var data = Object()
data.files = []

fs.readdir(fp, (err, files) =>{
    files.forEach(file =>{
        data.files.push(file.toString())
    })
    console.log(JSON.stringify(data))
})



//console.log(JSON.stringify(data))
