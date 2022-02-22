function main() {
	const socket = new WebSocket("ws://localhost:9090");
	socket.addEventListener("open", function(event) {
		socket.send("This message was sent from a websocket!");
	});
	socket.addEventListener("message", function(event) {
		console.log(event.data);
		document.getElementById("outlet").innerHTML = event.data;
	});
}
