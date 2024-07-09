$(document).ready(function() {

    // для главной страницы
    $('[data-modal=record]').on('click', function() {
        $('.overlay,#record').fadeIn('slow');
    });
    $('.modal__close').on('click', function() {
        $('.overlay').fadeOut('slow');
    });

    $('[data-modal=washing]').on('click', function() {
        $('.overlay,#washing').fadeIn('slow');
    });
    $('[data-modal=molting]').on('click', function() {
        $('.overlay,#molting').fadeIn('slow');
    });
    $('[data-modal=grooming]').on('click', function() {
        $('.overlay,#grooming').fadeIn('slow');
    });
    $('[data-modal=hygiene]').on('click', function() {
        $('.overlay,#hygiene').fadeIn('slow');
    });
    $('[data-modal=cats]').on('click', function() {
        $('.overlay,#cats').fadeIn('slow');
    });
    $('[data-modal=care]').on('click', function() {
        $('.overlay,#care').fadeIn('slow');
    });
    $('[data-modal=exhibition]').on('click', function() {
        $('.overlay,#exhibition').fadeIn('slow');
    });
    $('[data-modal=trimming]').on('click', function() {
        $('.overlay,#trimming').fadeIn('slow');
    });
    $('.modal__close').on('click', function() {
        $('.overlay, #trimming, #washing, #molting, #grooming, #hygiene, #cats, #care, #exhibition').fadeOut('slow');
    });


    // личный кабинет
    // кнопка "изменить данные"
    $('[data-modal=btnEditDataUser]').on('click', function() {
        $('.overlay, #editDataUser').fadeIn('slow');
    });

    let pass = document.getElementById('pass');
    let pass_rep = document.getElementById('repPass');
    let error = document.getElementById('errorBlock');
    let btnRegistration = document.getElementById('btn-registration');
    repPass.addEventListener('input', checkPasswords);
    function checkPasswords() {
        if (pass.value !== repPass.value){
            error.textContent = 'Пароли не совпадают';
        }
        else {
            error.textContent = '';
        }
    }


    /*function showToast() {
        var toast = document.getElementById("toast");
        toast.className = "toast show";
        setTimeout(function() {
            toast.className = toast.className.replace("show", "");
        }, 15000);
    }

    $('form').submit(function(event) {
        event.preventDefault();
        $.ajax({
            url: $(this).attr('action'),
            type: $(this).attr('method'),
            data: $(this).serialize(),
            success: function(response) {
                showToast();
                setTimeout(function() {
                    window.location.href = "/home";
                }, 1500);
            },
            error: function(response) {
                alert("Произошла ошибка при записи на услугу.");
            }
        });
    });

    $(document).ready(function () {
        $('#category').change(function () {
            var categoryId = $(this).val();
            $.ajax({
                url: '/services',
                type: 'get',
                data: {categoryId: categoryId},
                success: function (services) {
                    $('#service').empty();
                    $.each(services, function (key, service) {
                        $('#service').append($('<option>', {
                            value: service.id,
                            text: service.name
                        }));
                    });
                }
            });
        });
    });*/
});