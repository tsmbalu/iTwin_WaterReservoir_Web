$(document).ready(function(){
    // click on button submit
    $("#submit").on('click', function(){

        var formDataArray = $("#webForm").serializeArray();

        // Convert the array to a JSON object
        var formDataJson = {};
        $.each(formDataArray, function() {
          formDataJson[this.name] = this.value;
        });

        // Display the JSON data in the console (optional)
        console.log(formDataJson);

        // send ajax
        $.ajax({
            url: '/reservoir',
            type : "POST",
            dataType : 'json',
            contentType: "application/json; charset=utf-8",
            data : JSON.stringify(formDataJson),
            success : function(result) {
                // you can see the result from the console
                // tab of the developer tools
                console.log(result);
                alert("Form submitted successfully!");
                $("#webForm")[0].reset();
            },
            error: function(xhr, resp, text) {
                console.log(xhr, resp, text);
                alert("Error submitting the form. Please try again.");
            }
        })
    });
});
