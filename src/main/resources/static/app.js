var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    } else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.debug = null;
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (greeting) {
            showGreeting(JSON.parse(greeting.body));
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
}

function showGreeting(message) {

    var data = "";

    $.each(message, function (k, v) {
        data += "<tr><td>" + k + "</td><td>" + v + "</td></tr>";
    });

    $("#brakeTempBl").val(message.brakeTempBl);
    $("#brakeTempBr").val(message.brakeTempBr);
    $("#brakeTempFl").val(message.brakeTempFl);
    $("#brakeTempFr").val(message.brakeTempFr);


    $("#dataTable").html(data);
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    connect();
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendName();
    });
});

function showTime() {


    setTimeout(showTime, 100);
    sendName();

}
connect();
showTime();