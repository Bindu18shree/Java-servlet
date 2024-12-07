//Window scroll

$(window).on("scroll", function(){

    var scrollTop = $(window).scrollTop();

    if(scrollTop >= 100){

        $('body').addClass('fixed-header');
    } else{

        $('body').removeClass('fixed-header')
    }
});

//Document Ready

$(document).ready(function (){

    //Typing animation

    new Typed('#type-it', {
        strings: ['Full Stack Developer', 'Full Stack Developer', 'Full Stack Developer'],
        typeSpeed: 100,
        loop: true
      });


});

$(document).ready(function (){

    $('#myForm').on('submit', function(event) {
        event.preventDefault(); // prevent reload
        
        var formData = new FormData(this);
        formData.append('service_id', 'service_58nsy6s');
        formData.append('template_id', 'template_dhxnfvf');
        formData.append('user_id', 'MG5Tjjh3PrsIvRO9h');
     
        $.ajax('https://api.emailjs.com/api/v1.0/email/send-form', {
            type: 'POST',
            data: formData,
            contentType: false, // auto-detection
            processData: false // no need to parse formData to string
        }).done(function() {
            alert('Your mail is sent!');
        }).fail(function(error) {
            alert('Oops... ' + JSON.stringify(error));
        });
    });
})





              