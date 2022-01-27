const path = require("path")
const fs = require("fs")
fp = path.join("task.json")
const add = (title, deadline) =>{
    var obj = Object()
    obj.title = title
    obj.deadline = deadline
    //console.log(fp)
    
    fs.readFile(fp,(err,result)=>{
        if(err) console.log(err)
        else{
            let student = JSON.parse(result);
            if(student[obj.title] == undefined){
                student[obj.title] = obj.deadline
                fs.writeFile(fp,JSON.stringify(student),(err1,res1)=>{
                    if(err) throw err
                })
            }
            else{
                console.log("Title already defined")
            }
        }
    })
}

const view = () =>{
    fs.readFile(fp,(err,result)=>{
        if(err) console.log(err)
        else{
            let student = JSON.parse(result);
            console.log(student)
        }
        
    })
}

module.exports = {add, view}
