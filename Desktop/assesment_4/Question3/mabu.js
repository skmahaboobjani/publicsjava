const express = require('express');

const app = express();

const PORT = 3000;

const person=[];
app.use(express.json());

app.post('/person',(req,res)=>{
    let detail=req.body;
   person.push(data);
    
   res.send("<p>Name: "+detail.name+"<br>"+ " City :"+detail.city+"<br>"+" Mobile :"+detail.mobile+"<br>"+" Email : "+detail.email+"</p");
}
);

app.listen(PORT, () => {
    console.log(`The server is running  port ${PORT}`);
});