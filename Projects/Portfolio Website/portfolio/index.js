let express  = require('express');
let app = express();
let bodyParser = require('body-parser');
var path = require('path');

app.use(bodyParser.json());

app.use(express.static('public'))


app.get('/', function(req, res) {
	res.sendFile(path.join(__dirname, './public', 'index.html'))
})







app.listen(3000, function(){
	console.log("Server started on port: 3000")
})