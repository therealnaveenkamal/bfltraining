const fs = require("fs")
const path = require("path")
fp = path.join(__dirname, "osinf.txt")

linelist = []

fs.readFile(fp,'utf-8', (err, data) =>{
    data.split(/\r?\n/).forEach(function(line){
        linelist.push(line)
    })
    console.log(linelist)
})