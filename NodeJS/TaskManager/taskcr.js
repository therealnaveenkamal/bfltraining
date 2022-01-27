const args = require("yargs")
const {add, view} = require("./mems.js")

const data = args.argv._
if(data[0] == "add"){
    add(data[1], data[2])
}
if(data[0] == "view"){
    view()
}
