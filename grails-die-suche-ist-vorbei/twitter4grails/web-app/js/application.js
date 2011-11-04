if (typeof jQuery !== 'undefined') {
    (function($) {
        $('#spinner').ajaxStart(
                function() {
                    $(this).fadeIn();
                }).ajaxStop(function() {
                    $(this).fadeOut();
                });
    })(jQuery);
}


[{
    "class":"grails4taglib.Status",
    "id":1,
    "dateCreated":"2011-11-04T12:51:30Z",
    "message":"My first post!",
    "poster":{"class":"Person","id":1}
},{
    "class":"grails4taglib.Status",
    "id":2,
    "dateCreated":"2011-11-04T12:51:42Z",
    "message":"Second message!",
    "poster":{"class":"Person","id":1}
}]
