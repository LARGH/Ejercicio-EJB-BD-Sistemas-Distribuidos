$(document).ready(function () {
    $( "#message-alert-error" ).hide();
    $( "#message-alert-success" ).hide();
    $( "#closeAlertError" ).click(function () {
        $( "#message-alert-error" ).hide();
    });
    $( "#closeAlertSuccess" ).click(function () {
        $( "#message-alert-success" ).hide();
    });
});

function bindEvendTooltip($class) {
    $('.' + $class).tooltip({
        'placement': 'bottom',
        'trigger': 'hover'
    });
}