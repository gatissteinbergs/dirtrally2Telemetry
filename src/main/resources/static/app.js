var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
}

function connect() {
    var socket = new SockJS('/dirt2TelemetryWS');
    stompClient = Stomp.over(socket);
    stompClient.debug = null;
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/dr2Tele', function (data) {
            showData(JSON.parse(data.body));
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

function showData(message) {

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
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#connect").click(function () {
        connect();
    });
});

function showTime() {
    setTimeout(showTime, 100);
}
connect();
showTime();