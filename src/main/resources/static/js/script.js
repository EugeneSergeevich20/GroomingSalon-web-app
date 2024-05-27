
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