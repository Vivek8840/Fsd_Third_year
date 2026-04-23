import express from 'express';
const app = express();
app.get('/', (req, res) => {
res.send("hello! Server is Ready")
});
//get a list of 5 jokes
app.get('/api/jokes',(req,res)=>{
    const jokes = [
        {
            id:1,
            title: "Why don't scientists trust atoms?",
            joke:"Because they make up everything!"
        },
        {
            id:2,
            title: "Why did the scarecrow win an award?",   
            joke:" Because he was outstanding in his field!"
        },
        {
            id:3,
            title: "Why don't skeletons fight each other?",
            joke:" They don't have the guts!"
        },
        {
            id:4,
            title: "What do you call fake spaghetti?",
            joke:"An impasta!"
        },
        {
            id:5,
            title: "Why did the bicycle fall over?",
            joke:" Because it was two-tired!"
        }
    ];
    res.send(jokes);
    
})
const port=process.env.PORT || 3000;
app.listen(port,()=>{
    console.log(`Serve at http://localhost:${port}`);
}) ;