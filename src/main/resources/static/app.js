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
            console.log(data.body);
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

    $("#throttleInput").val(message.throttleInput);

    $("#brakeInput").val(message.brakeInput);

    $("#clutchInput").val(message.clutchInput);

    $("#gear").val(message.gear);

    $("#totalTime").html(message.totalTime);
    $("#lapTime").html(message.lapTime);
    $("#sectorTime1").html(message.sectorTime1);
    $("#sectorTime2").html(message.sectorTime2);
    $("#lastLapTime").html(message.lastLapTime);

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
    sendRequest();
}
function sendRequest() {
    stompClient.send("/app/getTele", {}, "");
}
connect();
showTime();